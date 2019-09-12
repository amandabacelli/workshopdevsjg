package com.djg.emprestalivroAPI.emprestaAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.djg.emprestalivroAPI.emprestaAPI.dominio.LivroAPI;
import com.djg.emprestalivroAPI.emprestaAPI.service.LivroServico;

@RestController
public class LivroController {
	@Autowired
	private LivroServico livroServico;
	
	@PostMapping ("/livro")
	public void criaLivro (@RequestBody LivroAPI livro) {
		livroServico.save(livro);
	}

}
