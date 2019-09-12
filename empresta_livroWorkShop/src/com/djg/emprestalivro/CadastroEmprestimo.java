package com.djg.emprestalivro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.djg.emprestalivro.dominio.Emprestimo;
import com.djg.emprestalivro.dominio.Livros;
import com.djg.emprestalivro.dominio.Usuario;

public class CadastroEmprestimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//caso eu queira utilizar os valores informados anteriormente em outras classes
		//coloco aqui as variaveis e os dados (copia e cola da pagina das classes)
		Livros livro1 = new Livros("O Codigo da Vince", "Dan Bron");
		Usuario usuario1 = new Usuario("Amanda","08-28-2019","Workshop");
		
		LocalDate dataEmprestimo = LocalDate.parse("2019-08-24", DateTimeFormatter.ISO_DATE);//definir o formato da data
		LocalDate dataDevolucao = dataEmprestimo.plusDays(7);
		
		Emprestimo emprestimo1 = new Emprestimo (usuario1.getNomeCompleto(), livro1.getNomeLivro(), dataEmprestimo, dataDevolucao);
		//uso get para chamar o dado que quero utilizar
		emprestimo1.imprimeEmprestimo();

	}

}
