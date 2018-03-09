package com.techelevator;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class xorderedController {
	
	@RequestMapping("/orderedNameIn")
	public String handleInput() {
			return "orderedNameIn";
			}
	
	@RequestMapping("/orderedNameOut")
	public String handleOutput(HttpServletRequest request) {
			String first = request.getParameter("firstName");
			String middle = request.getParameter("middleInitial");
			String last = request.getParameter("lastName");
			String order = request.getParameter("order");
			String result = "";
			
			switch (order) {
			case "1" : result = first + " " + middle + " " + last;
			break;
			case "2" : result = first + " "	+ last;
			break;
			case "3" : result = last + ", " + first +  " " + middle;
			break;
			case "4"	 : result = last + ", "	+ first;
			break;
			}
			
			OrderedNameBean orderedNameBean = new OrderedNameBean(first, middle, last, result);
			request.setAttribute("orderedNameBean", orderedNameBean);
			return "orderedNameOut";
		}
	}
