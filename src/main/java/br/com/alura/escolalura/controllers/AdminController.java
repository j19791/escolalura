package br.com.alura.escolalura.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

	@GetMapping("/")
	public String index() {
		return "index"; // retorna o nome do arquivo template (src/main/resources/templates) que será
						// carregado
	}

}
