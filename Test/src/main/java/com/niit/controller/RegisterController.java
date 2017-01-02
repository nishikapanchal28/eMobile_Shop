package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.model.Register;
import com.niit.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(value="/")
	public String register()
	{
		return "register";
	}
	
	@RequestMapping(value="/adduser",method=RequestMethod.POST)
	public String addUSer(@ModelAttribute("instuser") Register register)
	{
		registerService.addUser(register);
		return "redirect:/";
	}
}
