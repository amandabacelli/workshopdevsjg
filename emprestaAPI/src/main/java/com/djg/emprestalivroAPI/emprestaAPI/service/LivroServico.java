package com.djg.emprestalivroAPI.emprestaAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djg.emprestalivroAPI.emprestaAPI.dominio.LivroAPI;
import com.djg.emprestalivroAPI.emprestaAPI.repositorio.LivroRepositorio;

@Service
public class LivroServico {
	@Autowired
	private LivroRepositorio livroRepositorio;
	public void save (LivroAPI livro) {
		livroRepositorio.save(livro);
		
	}
	
}
