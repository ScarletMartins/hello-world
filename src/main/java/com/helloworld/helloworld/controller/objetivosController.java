package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class objetivosController {

	@GetMapping
	public String objetivo() {
	return "<h2>Objetivos de aprendizado da semana:</h2>"
			+ "<li>Contato inicial das ferramentas essenciais para o desenvolvimento do Projeto Integrador" 
			+ "e Blog Pessoal;"
			+ "<li>Aprendizado e aperfeiçoamento de novas habilidades;";
	}
}
