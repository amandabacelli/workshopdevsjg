package com.djg.emprestalivroAPI.emprestaAPI.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djg.emprestalivroAPI.emprestaAPI.dominio.LivroAPI;

	public interface LivroRepositorio extends JpaRepository<LivroAPI, Long> {
		
	}
