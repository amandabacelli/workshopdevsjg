package com.djg.emprestalivroAPI.emprestaAPI.repositorio;

import org.springframework.data.jpa.repository.JpaRepository; //interface do spring, ele ja sabe que essa classe vai acessar o BD

import com.djg.emprestalivroAPI.emprestaAPI.dominio.UsuarioAPI;

public interface UsuarioRepositorio extends JpaRepository<UsuarioAPI, Long> { //classe+tipo do ID da classe
//é uma herança de método, a classe usuariorepositorio puxa os metodos do JpaRepository
	
}
