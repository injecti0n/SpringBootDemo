package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@RequestMapping(value = "/ex/foos", method = RequestMethod.GET)
	@ResponseBody
	public String getFoosBySimplePath() {

		return "Get some Foos";
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	@ResponseBody
	
	public ArrayList<String> getUsers() {
		Users user = new Users("username", 123456);
		ArrayList<String> users = new ArrayList<>();
		users.add(user.toString());
		return users;

	}
}
