package com.lim.cms.controller;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lim.cms.entity.MailObject;
import com.sun.mail.smtp.SMTPTransport;

@RestController
@RequestMapping("/api/email")
public class MailController {

	// for example, smtp.mailgun.org
    
    
	@PostMapping("/send")
	public void send(@RequestBody MailObject mail) {
		final String username = "feng5241@gmail.com";
        final String password = "2462205532";

        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        
		try {

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(mail.getFrom()));
        message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(mail.getTo())
        );
        message.setSubject("Testing Gmail TLS");
        message.setText("Dear Mail Crawler,"
                + "\n\n Please do not spam my email!");

        Transport.send(message);

        System.out.println("Done");

    } catch (MessagingException e) {
        e.printStackTrace();
    }
	}

}
