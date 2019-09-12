package com.djg.emprestalivroAPI.emprestaAPI.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djg.emprestalivroAPI.emprestaAPI.dominio.EmprestimoAPI;

public interface EmprestimoRepositorio extends JpaRepository<EmprestimoAPI, Long> {
	

}
