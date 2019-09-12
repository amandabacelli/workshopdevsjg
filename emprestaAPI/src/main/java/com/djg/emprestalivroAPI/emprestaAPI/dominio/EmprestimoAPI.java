package com.djg.emprestalivroAPI.emprestaAPI.dominio;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class EmprestimoAPI {
	@Id
	@GeneratedValue
	private Long codigoEmprestimo;
	@ManyToOne //muitos livros para 1 usuario - indica que é uma tabela e desta tabela 	que será puxada as informações
	private UsuarioAPI usuario;//puxa as informações da classe UsuarioAPI
	@ManyToOne //muitos livros para 1 emprestimo
	private LivroAPI livro; //tem qe indicar que tmb é uma tabela
	private LocalDate dataSolicitacao;
	private LocalDate dataDevolucao;
	
	public Long getCodigoEmprestimo() {
		return codigoEmprestimo;
	}
	public void setCodigoEmprestimo(Long codigoEmprestimo) {
		this.codigoEmprestimo = codigoEmprestimo;
	}
	public UsuarioAPI getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioAPI usuario) {
		this.usuario = usuario;
	}
	public LivroAPI getLivro() {
		return livro;
	}
	public void setLivro(LivroAPI livro) {
		this.livro = livro;
	}
	public LocalDate getDataSolicitacao() {
		return dataSolicitacao;
	}
	public void setDataSolicitacao(LocalDate dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
}
	
	