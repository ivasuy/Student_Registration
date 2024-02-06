package com.vasu.StudentRegistrationService.service;

import com.vasu.StudentRegistrationService.entity.StudentRegistration;
import com.vasu.StudentRegistrationService.model.request.AddStudentDetailsRequest;
import com.vasu.StudentRegistrationService.model.response.ResponseModel;
import com.vasu.StudentRegistrationService.repository.StudentRegistrationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StudentRegistrationServiceImplementation implements StudentRegistrationService{

    private final StudentRegistrationRepository studentRepository;

    @Override
    public ResponseModel addStudentDetails(AddStudentDetailsRequest registration) {
        StudentRegistration studentRegistration = StudentRegistration.builder()
                .studentName(registration.getStudentName())
                .studentEmail(registration.getStudentEmail())
                .studentPhoneNumber(registration.getStudentPhoneNumber())
                .medicalBranch(registration.getMedicalBranch())
                .build();
        studentRepository.save(studentRegistration);

        return new ResponseModel("1", "Student Details Added Successfully", "01", studentRegistration);
    }
}
