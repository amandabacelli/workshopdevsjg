package com.djg.emprestalivroAPI.emprestaAPI.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //cria uma tabela chamada Usuario - indica que essa classe será uma tabela

public class UsuarioAPI {
	@Id //esse codigo usuario será um ID - está dando um Id para a tabela - sempre por em cima do atributo que quero transformar em ID
	@GeneratedValue //e esse ID será gerado automaticamente
	private Long codigoUsuario;//variavel tipo numero
	private String nomeCompleto;
	private String dataNascimento;
	private String endereco;
	
	
	public Long getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(Long codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
