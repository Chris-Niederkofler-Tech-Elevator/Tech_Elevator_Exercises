package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller 
@SessionAttributes("favoriteThings")
public class FavoriteThingsController {

	@RequestMapping(path= {"/", "/FavoriteThings/Page1"}, method=RequestMethod.GET)
	public String getPage1() {
		return "FavoriteThings/Page1";
	}
	
	@RequestMapping(path="/FavoriteThings/Page1", method=RequestMethod.POST)
	public String postPage1(@RequestParam String color, ModelMap model) {
		FavoriteThings thisOne = new FavoriteThings();
		thisOne.setColor(color);
		model.addAttribute("favoriteThings", thisOne);
		return "redirect:/FavoriteThings/Page2";
	}
	
	@RequestMapping(path="/FavoriteThings/Page2", method=RequestMethod.GET)
	public String getPage2() {
		return "FavoriteThings/Page2";
	}
	
	@RequestMapping(path="/FavoriteThings/Page2", method=RequestMethod.POST)
	public String postPage2(@RequestParam String food, ModelMap model) {
		FavoriteThings thisOne = (FavoriteThings) model.get("favoriteThings");
		thisOne.setFood(food);
		return "redirect:/FavoriteThings/Page3";
	}
	
	@RequestMapping(path="/FavoriteThings/Page3", method=RequestMethod.GET)
	public String getPage3() {
		return "FavoriteThings/Page3";
	}
	
	@RequestMapping(path="/FavoriteThings/Page3", method=RequestMethod.POST)
	public String postPage3(@RequestParam String season, ModelMap model) {
		FavoriteThings thisOne = (FavoriteThings) model.get("favoriteThings");
		thisOne.setSeason(season);
		return "redirect:/FavoriteThings/Summary";
	}
	
	@RequestMapping(path="/FavoriteThings/Summary", method=RequestMethod.GET)
	public String getSummary() {
		return "FavoriteThings/Summary";
	}
}