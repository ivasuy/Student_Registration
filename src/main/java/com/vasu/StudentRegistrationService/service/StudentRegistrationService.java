package com.vasu.StudentRegistrationService.service;

import com.vasu.StudentRegistrationService.model.request.AddStudentDetailsRequest;
import com.vasu.StudentRegistrationService.model.response.ResponseModel;

public interface StudentRegistrationService {
    ResponseModel addStudentDetails(AddStudentDetailsRequest registration);
}
