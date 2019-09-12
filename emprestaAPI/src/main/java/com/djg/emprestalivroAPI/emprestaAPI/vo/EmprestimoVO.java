package com.djg.emprestalivroAPI.emprestaAPI.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class EmprestimoVO {

	private Long codUsuario;
	private Long codLivro; 
	private LocalDate dataSolicitacao;
	private LocalDate dataDevolucao;
	
	public Long getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(Long codUsuario) {
		this.codUsuario = codUsuario;
	}
	public Long getCodLivro() {
		return codLivro;
	}
	public void setCodLivro(Long codLivro) {
		this.codLivro = codLivro;
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
