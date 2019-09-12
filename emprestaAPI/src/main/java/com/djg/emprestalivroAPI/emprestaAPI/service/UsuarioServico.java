package com.djg.emprestalivroAPI.emprestaAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djg.emprestalivroAPI.emprestaAPI.dominio.UsuarioAPI;
import com.djg.emprestalivroAPI.emprestaAPI.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServico {

	@Autowired //toda vez que usa interface usa esse comando para instanciar a classe
	private UsuarioRepositorio usuarioRepositorio; //o spring vai saber que vai ter que instanciar e colocar a classe dentro
	
	public void save (UsuarioAPI usuario) {
		usuarioRepositorio.save(usuario); //para salvar o usuario 
	}
}