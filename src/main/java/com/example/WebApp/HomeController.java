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

/*<<<<<<< HEAD
@RequestMapping("/Paralelo")
public @ResponseBody String greetingParalelo() {
	return "Simulando trabalho em paralelo no arquivo original. ";
	
}
=======*/
@RequestMapping("/Paralelo")
public @ResponseBody String greetingParalelo() {
		return "Simulação de trabalho em paralelo concluída com sucesso. ";

	}
//>>>>>>> 01f028a494d535d2f4acb6542a077648a3eb4a17

@RequestMapping("/hotfix")
public @ResponseBody String greetingHotfix() {
	return "Branch Hotfix, adicionada!";

}

} 