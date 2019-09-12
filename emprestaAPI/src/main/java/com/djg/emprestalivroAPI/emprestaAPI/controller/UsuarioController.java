package com.djg.emprestalivroAPI.emprestaAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.djg.emprestalivroAPI.emprestaAPI.dominio.UsuarioAPI;
import com.djg.emprestalivroAPI.emprestaAPI.service.UsuarioServico;

@RestController
public class UsuarioController {
	//é a mesma coisa que fazer
	//private UsuarioServio usuarioServico = new UsuarioServico ()
	
	@Autowired
	private UsuarioServico usuarioServico;
	
	@PostMapping ("/usuario")
	public void criaUsuario (@RequestBody UsuarioAPI usuario) {
		usuarioServico.save(usuario);
		
	}
	

}
