package com.djg.emprestalivro.dominio;

public class Usuario {
	//objeto eh o usuario
	//criação de atributos para criar o usuario (caracteristica)
	//indicação de atributo = String
	private String codigoUsuario; //private = encapsulamento do dado
	private String nomeCompleto;
	private String dataNascimento;
	private String endereco;
	

	
	public Usuario(String nomeCompleto, String dataNascimento, String endereco) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}


	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) { //necessário para atribuir um valor fora da classe (fora do contexto)
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

	
	
	//criar metodo (void)
	public void imprimeUsuario() {
		//para imprimir no console
		//para duplicar o comando usa ctrl+alt+setaparabaixo
		System.out.println("codigo: " + codigoUsuario);//(descrição do texto + atributo (definido na string))
		System.out.println("Nome: " + nomeCompleto);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("endereco: " + endereco);
		
		//para testar usa o método main "testausuario"
	
	}
		
}
