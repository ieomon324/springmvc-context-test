package net.javaguides.springmvc.prhas.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springmvc.helloworld.model.HelloWorld;

/**
 * @author Ramesh Fadatare
 */
@Controller
@RequestMapping("/prhas/*")
public class PrhasHelloWorldController {

	@RequestMapping("/hello")
	public String handler(Model model) {
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMessage("Hello World Example Using Spring MVC 5!!!");
		helloWorld.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("helloWorld", helloWorld);
		return "prhas/helloworld";
	}
}