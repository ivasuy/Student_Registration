package com.vasu.StudentRegistrationService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
@Table(name = "STUDENT_REGISTRATION_TABLE")
public class StudentRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "STUDENT_NAME")
    private String studentName;

    @Column(name = "STUDENT_PHONE_NUMBER")
    private String studentPhoneNumber;

    @Column(name = "STUDENT_EMAIL")
    private String studentEmail;

    @Column(name = "MEDICAL_BRANCH")
    private Boolean medicalBranch;

    @Column(name = "CORE_MARKS")
    private Float coreMarks;

    @Column(name = "PHYSICS_MARKS")
    private Float physicsMarks;

    @Column(name = "OPTIONAL_MARKS")
    private Float optionalMarks;

    @Column(name = "CALCULATED_PERCENTAGE")
    private Float calculatedPercentage;
}
