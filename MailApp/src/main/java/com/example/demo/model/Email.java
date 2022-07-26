package com.example.demo.model;

import org.springframework.mail.SimpleMailMessage;

public class Email {
	
	private static final String from = "gprem062@gmail.com";
	
	
	private String recipient; //single for now
	private String subject;
	private String body;
	
	
	
	public Email(String recipient, String subject, String body) {
		
		this.recipient = recipient;
		this.subject = subject;
		this.body = body;
	}



	public SimpleMailMessage build() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setSubject(subject);
		message.setTo(recipient);
		message.setFrom(from);
		message.setText(body);
		return message;
	}




	public String getRecipient() {
		return recipient;
	}



	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public String getBody() {
		return body;
	}



	public void setBody(String body) {
		this.body = body;
	}
	
	
}
