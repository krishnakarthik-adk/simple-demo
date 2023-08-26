package com.simpledemo.git;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/simpledemo")
public class DemoController {
	
	@RequestMapping("/sayHello")
	public String sayHello() {
		return "Hello Students!";
	}
	
	@RequestMapping("/sayBye")
	public String sayBye() {
		return "Good Day Students!";
	}

}
