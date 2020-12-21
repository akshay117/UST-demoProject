package com.ust.vendorweb.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;


import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;


@Component
public class EmailUtilImpl implements EmailUtil {

	@Autowired
	JavaMailSender sender;
	
	@Override
	public void sendEmail(String toAddress, String subject, String body)  {
		
		// TODO Auto-generated method stub
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		try {
			helper.setTo(toAddress);
			helper.setSubject(subject);
			helper.setText(body);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sender.send(message);
		
		
	}
	
	

}
