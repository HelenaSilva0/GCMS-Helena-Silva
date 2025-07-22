package com.example.WebApp;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 

@Controller 
public class HomeController { 
	
@RequestMapping("/") 
public @ResponseBody String greeting() { 
return "Hello, World!"; 

} 

@RequestMapping("/Helena") 
public @ResponseBody String greetingHelena() { 
return "Hello, Helena!"; 

} 

@RequestMapping("/Pratica3")
public @ResponseBody String greetingPratica3() {
	return "Novo endpoint. ";

}

	@RequestMapping("/Paralelo")
	public @ResponseBody String greetingParalelo() {
		return "Simulando trabalho em paralelo. ";

	}

} 