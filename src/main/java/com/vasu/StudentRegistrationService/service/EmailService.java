package com.vasu.StudentRegistrationService.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmailService {

    private final JavaMailSender javaMailSender;

    public void sendMailToUser(String to, String firstname){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("Admission Inquiry");
        message.setTo(to);
        message.setText("Dear " + firstname + ",\n\n"
                + "Thank you for your interest in Jaypee University of Information Technology! We've received your admission inquiry and are excited to assist you further. We appreciate you if you find some time to fill online enquiry form - https://www.juit.ac.in/admissions_query \n\n"
                + "Our admissions team will review your inquiry promptly and reach out with next steps. For immediate assistance, feel free to contact us at admission2024@juitsolan.in or 7807868500 , 7807868600 , 7807846049 .\n\n"
                + "Looking forward to welcoming you to our community!\n\n"
                + "Best regards,\n\n"
                + "Admission Office\n"
                + "JUIT");

        javaMailSender.send(message);
    }
}
