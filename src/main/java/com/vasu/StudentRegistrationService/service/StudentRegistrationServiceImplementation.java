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
    private final EmailService emailService;

    @Override
    public ResponseModel addStudentDetails(AddStudentDetailsRequest registration) {
        float physicsMarks = registration.getPhysicsMarks();
        float optionalMarks = registration.getOptionalMarks();

        StudentRegistration studentRegistration = StudentRegistration.builder()
                .studentName(registration.getStudentName())
                .studentEmail(registration.getStudentEmail())
                .studentPhoneNumber(registration.getStudentPhoneNumber())
                .medicalBranch(registration.getMedicalBranch())
                .physicsMarks(physicsMarks)
                .optionalMarks(optionalMarks)
                .build();

        Float mainSubjectMarks = registration.getMedicalBranch() ? registration.getBioMarks()
                : registration.getMathsMarks();
        studentRegistration.setCoreMarks(mainSubjectMarks);

        float totalMarks = mainSubjectMarks + physicsMarks + optionalMarks;
        float percentage = totalMarks / 3;
        studentRegistration.setCalculatedPercentage(percentage);
        studentRepository.save(studentRegistration);

        emailService.sendMailToUser(
                registration.getStudentEmail(),
                registration.getStudentName()
        );

        return new ResponseModel("1", "Student Details Added Successfully", "01", studentRegistration);
    }

}
