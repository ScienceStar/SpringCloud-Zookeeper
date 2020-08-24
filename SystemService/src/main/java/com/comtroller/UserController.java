package com.comtroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.User;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value="/user")
public class UserController {
	
	@RequestMapping(value = "/getUserInfo")
	public User getUserInfo() {
		User user = new User();
		user.setUserId("user001");
		user.setUserAge(21);
		return user;
	}

}
