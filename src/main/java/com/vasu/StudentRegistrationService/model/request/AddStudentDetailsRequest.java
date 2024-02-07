package com.vasu.StudentRegistrationService.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.Nullable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AddStudentDetailsRequest {
    private String studentName;
    private String studentPhoneNumber;
    private String studentEmail;
    private Boolean medicalBranch;
    @Nullable
    private Float bioMarks;
    @Nullable
    private Float mathsMarks;
    private Float physicsMarks;
    private Float optionalMarks;
}
