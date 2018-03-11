package com.kinsu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome to the world of programming";
	}
	
	@RequestMapping("/user/list")
	public List listOfUser() {
		List user = new ArrayList();
		user.add("Amit");
		user.add("Sumit");
		user.add("Sujit");
		return user;
	}

}
