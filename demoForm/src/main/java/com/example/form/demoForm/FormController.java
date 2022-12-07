package com.example.form.demoForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController
{
	@Autowired 
	FormRepo formRepo;
	
	@GetMapping("/register")
	public String ShowForm(Model model)
	{
		Register register=new Register();
		model.addAttribute("register", register);
		return "Register";
	}
	
	@PostMapping("/register")
	public String store(@ModelAttribute("register") Register register)
	{
		 formRepo.save(register);
		 return "Success";
	}
	
	
	 
	
}
