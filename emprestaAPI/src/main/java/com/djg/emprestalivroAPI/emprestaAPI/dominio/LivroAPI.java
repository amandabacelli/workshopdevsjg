package com.djg.emprestalivroAPI.emprestaAPI.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class LivroAPI {
	@Id
	@GeneratedValue
	private Long codigoLivro;
	private String nomeLivro;
	private String autor;
	

	public Long getCodigoLivro() {
		return codigoLivro;
	}
	public void setCodigoLivro(Long codigoLivro) {
		this.codigoLivro = codigoLivro;
	}
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	
}
