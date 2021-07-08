package com.xworkz.mobile.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.mobile.dto.MobileDTO;

//@Component
//@RequestMapping("/")
@Controller
public class MobileController {
	
	public MobileController() {
		System.out.println(this.getClass().getSimpleName() + "Object Created");
	}
//	@RequestMapping(value = "/mobile.do")
	//public String onSubmit(@RequestParam String mobileName, @RequestParam String mobileBrand, @RequestParam double ram, @RequestParam double cost) {
	//	System.out.println("invoked onsubmit()");
		//System.out.println(mobileName + " " + mobileBrand + " " + ram + " " + cost );
		//model.addAttribute()
		//return "/mobileResponse.jsp";
	//}
	
	@RequestMapping(value = "/mobile.do", method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute MobileDTO mobileDTO, Model model ) {
		System.out.println("invoked onsubmit()");
		System.out.println(mobileDTO);
		model.addAttribute("ResponseMessage" ,"thanks for submitting the form");
		return "index";
		
	}
	
	

}
