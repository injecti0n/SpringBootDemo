package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class selamlamaController {
	
	@GetMapping("/selamlama")
	public String selamlamaForm(Model model) {
		
		model.addAttribute("selamlama", new selamlama());
		return "selamlama";
		
	}
	
	@PostMapping("/selamlama")
	public String selamlamaSubmit(@ModelAttribute selamlama selam) {
		return "sonuc";
	}

}
