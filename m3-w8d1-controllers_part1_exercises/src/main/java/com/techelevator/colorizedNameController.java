package com.techelevator;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class colorizedNameController {

	@RequestMapping("/colorizedNameInput")
	public String handleInput() {
		return "colorizedNameInput";
	}
	
	@RequestMapping("/colorizedNameOutput")
	public String handleOutput(HttpServletRequest request) {
		return "colorizedNameOutput";
	}
}