package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Email;
import com.example.demo.service.EmailSenderService;

@Controller
public class HomeController {
	
	@Autowired
	public EmailSenderService emailSender;
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping(path="/send",method=RequestMethod.POST)
	public void send(Email mail) {
		emailSender.sendMail(mail);
		System.out.println("Mail sent successfully!");
		return;
	}
	
	
}
