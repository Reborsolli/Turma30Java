package com.helloworld.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class Hello2 {


	@GetMapping
	 public String hello () {
		 return "Aprender Springboot";
	 }
}