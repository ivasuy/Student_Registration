package com.vasu.StudentRegistrationService.repository;

import com.vasu.StudentRegistrationService.entity.StudentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRegistrationRepository extends JpaRepository<StudentRegistration, Long> {
}
