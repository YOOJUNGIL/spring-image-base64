package com.myalley.image.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.myalley.image.util.ImageUtil;

@RestController
public class IndexController {

	@GetMapping("index")
	public ModelAndView index(Model model) throws Exception {
		model.addAttribute("img", ImageUtil.toBase64(null));
		return new ModelAndView("index");
	}
	
}
