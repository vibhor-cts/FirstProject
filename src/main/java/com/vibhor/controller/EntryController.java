package com.vibhor.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.vibhor.entities.User;

@Controller
public class EntryController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showEntryForm(Model model){
		model.addAttribute("user",getUser());
		return "entryForm";
	}
	
	@RequestMapping(value="/entry", method=RequestMethod.POST)
	public String showResults(@ModelAttribute("user") @Valid User user, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			System.out.println("in error part");
			return "entryForm";
		}
		return "results";
	}
	
	@ModelAttribute
	private User getUser(){
		return new User();
	}
}
	
