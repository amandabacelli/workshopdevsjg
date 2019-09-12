package com.djg.emprestalivro.dominio;

public class Livros {
	private String codigoLivro;
	private String nomeLivro;
	private String autor;
	
	public Livros(String nomeLivro, String autor) {
		super();
		this.nomeLivro = nomeLivro;
		this.autor = autor;
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
	public void imprimeLivro() {
		System.out.println("Codigo do Livro: " + codigoLivro);
		System.out.println("Nome do Livro: " + nomeLivro);
		System.out.println("Autor do Livro: " + autor);
	}
	

}
