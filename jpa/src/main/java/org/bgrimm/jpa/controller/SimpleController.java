package org.bgrimm.jpa.controller;

import org.bgrimm.jpa.User;
import org.bgrimm.jpa.service.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {
	@RequestMapping("/upa")
	public String simple() {
		User user = new User();
		user.setAge(10);
		user.setName("dafd");
		usr.saveUser(user);
		return "home";

	}

	@Autowired
	private UserDaoImpl usr;

}
