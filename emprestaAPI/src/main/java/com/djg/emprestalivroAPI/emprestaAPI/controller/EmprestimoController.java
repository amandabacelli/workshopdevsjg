package com.djg.emprestalivroAPI.emprestaAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.djg.emprestalivroAPI.emprestaAPI.service.EmprestimoServico;
import com.djg.emprestalivroAPI.emprestaAPI.vo.EmprestimoVO;

@RestController
public class EmprestimoController {
	@Autowired

	private EmprestimoServico emprestimoServico;
	
	@PostMapping ("/emprestimo")
	public void salvaEmprestimo (@RequestBody EmprestimoVO emprestimoVO) {
		emprestimoServico.save(emprestimoVO);
	}
	

}
