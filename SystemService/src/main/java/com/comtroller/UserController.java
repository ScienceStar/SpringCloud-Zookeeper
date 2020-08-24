package com.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.User;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@RequestMapping(value="/user")
public class UserController {

	public static final String USERDETAIL_URL = "http://SpringCloud-Cosumer";

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/getUserInfo")
	public User getUserInfo() {
		User user = new User();
		user.setUserId("user001");
		user.setUserAge(21);
		return user;
	}

	@RequestMapping(value = "/getUserDetail")
	public String getUserDetail(){
		String user = restTemplate.getForObject(USERDETAIL_URL+"/consumer/getUserDetail",String.class);
		return user;
	}
}
