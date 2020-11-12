package spring.security.jwt.service;

import org.springframework.stereotype.Service;

@Service
public interface MailSender {
    void send(String emailTo,String subject , String message);
}
