package com.djg.emprestalivro.dominio;

import java.time.LocalDate;

public class Emprestimo {
	public String codigoSolicitacao;
	private String usuarioSolicitante;
	private String livro;
	private LocalDate dataSolicitacao;
	private LocalDate datadevolucao;//tipo de variavel para data
	
	public Emprestimo(String usuarioSolicitante, String livro, LocalDate dataSolicitacao, LocalDate dataDevolucao2) {
		super();
		this.usuarioSolicitante = usuarioSolicitante;
		this.livro = livro;
		this.dataSolicitacao = dataSolicitacao;
		this.datadevolucao = dataDevolucao2;
	}
	
	public String getUsuarioSolicitante() {
		return usuarioSolicitante;
	}

	public void setUsuarioSolicitante(String usuarioSolicitante) {
		this.usuarioSolicitante = usuarioSolicitante;
	}


	public String getLivro() {
		return livro;
	}

	public void setLivro(String livro) {
		this.livro = livro;
	}


	public LocalDate getDataSolicitacao() {
		return dataSolicitacao;
	}


	public void setDataSolicitacao(LocalDate dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}



	public LocalDate getDatadevolucao() {
		return datadevolucao;
	}


	public void setDatadevolucao(LocalDate datadevolucao) {
		this.datadevolucao = datadevolucao;
	}

	public void imprimeEmprestimo() {
		System.out.println("codigo: " + codigoSolicitacao);
		System.out.println("usuario:  " + usuarioSolicitante);
		System.out.println("Livro:  " + livro);
		System.out.println("Data Solicitacao: " + dataSolicitacao);
		System.out.println("Data Devolucao: " + datadevolucao);
		
	}
	
	
}
