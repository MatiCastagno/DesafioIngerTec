package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Tresource;
import com.example.demo.services.tresourceServiceImp;

@Controller
@RequestMapping("")
public class tresourceController {

	@Autowired
	private tresourceServiceImp tresourceServi;
	
	@GetMapping("")
	public String index(ModelMap model) {
		
		Tresource box1 = tresourceServi.getById(1);
		
		String box= "dios y la virgen";
		
		model.addAttribute("box", box);
		
		return "index";
	}
}
