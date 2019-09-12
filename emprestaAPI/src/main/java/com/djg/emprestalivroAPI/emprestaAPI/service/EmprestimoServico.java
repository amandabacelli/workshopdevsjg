package com.djg.emprestalivroAPI.emprestaAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djg.emprestalivroAPI.emprestaAPI.dominio.EmprestimoAPI;
import com.djg.emprestalivroAPI.emprestaAPI.dominio.LivroAPI;
import com.djg.emprestalivroAPI.emprestaAPI.dominio.UsuarioAPI;
import com.djg.emprestalivroAPI.emprestaAPI.repositorio.EmprestimoRepositorio;
import com.djg.emprestalivroAPI.emprestaAPI.repositorio.LivroRepositorio;
import com.djg.emprestalivroAPI.emprestaAPI.repositorio.UsuarioRepositorio;
import com.djg.emprestalivroAPI.emprestaAPI.vo.EmprestimoVO;

@Service
public class EmprestimoServico {
	@Autowired
	private EmprestimoRepositorio emprestimoRepositorio;
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	@Autowired
	private LivroRepositorio livroRepositorio;
		public void save (EmprestimoVO emprestimoVO) {
		LivroAPI livro = livroRepositorio.findById(emprestimoVO.getCodLivro()).get();
		UsuarioAPI usuario = usuarioRepositorio.findById(emprestimoVO.getCodUsuario()).get();
		
		EmprestimoAPI emprestimo1 = new EmprestimoAPI();
		emprestimo1.setLivro(livro);
		emprestimo1.setUsuario(usuario);
		emprestimo1.setDataDevolucao(emprestimoVO.getDataDevolucao());
		emprestimo1.setDataSolicitacao(emprestimoVO.getDataSolicitacao());
			
		emprestimoRepositorio.save(emprestimo1);
		
	}

}
