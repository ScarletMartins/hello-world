package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BSM-gen")
public class BSMController {
			 
	@GetMapping
	public String bsmGen() {
	return "<h1>BSM Generation<h1> "
		+ "<h2>Mentalidades</h2>"
		+ "<li/>Orientação ao futuro <br> <li/>Responsabilidade pessoal <br>"
		+ "<li/>Mentalidade de crescimento <br><li/>Persistência <br> "
		+ "<h2>Habilidades</h2>"
		+ "<li/>Trabalho em equipe <br>"
		+ "<li/>Atenção aos Detalhes <br> <li/>Proatividade <br> <li/>Comunicação";
	}
}
