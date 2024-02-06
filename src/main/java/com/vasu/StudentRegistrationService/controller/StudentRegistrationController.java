package com.vasu.StudentRegistrationService.controller;

import com.vasu.StudentRegistrationService.entity.StudentRegistration;
import com.vasu.StudentRegistrationService.model.request.AddStudentDetailsRequest;
import com.vasu.StudentRegistrationService.model.response.ResponseModel;
import com.vasu.StudentRegistrationService.service.StudentRegistrationService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StudentRegistrationController {

    private final StudentRegistrationService studentService;

    @PostMapping("/v1/student-registration/add-student-details")
    public ResponseModel addStudentDetails(@RequestBody AddStudentDetailsRequest registration){
        return studentService.addStudentDetails(registration);
    }

}
