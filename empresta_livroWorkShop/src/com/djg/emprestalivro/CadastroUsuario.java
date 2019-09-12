package com.djg.emprestalivro;

import java.util.Scanner;

import com.djg.emprestalivro.dominio.Usuario;

public class CadastroUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//alocar espaços na memoria para rodar o código
		//instanciar o objeto; criar a referencia do objeto (new)
		//mesmo criado o objeto tem que criar a variavel para salvar o objeto
		//variável da classe que será setada = new objeto - instanciando o objeto nao a variavel
		//para importar as coisas automaticamente (tipo nome de variavel ou atributo) é ctrl+shift+o
		//atribuir os valores da variavel
		//Usuario usuario1 = new Usuario("Amanda","28/08/2019","Workshop");//colocar os valores que estão dentro do construtor e não precisar usar usar o comando set
		/*set é pra inputar a informação - atribuir variavel fora do contexto do usuario
		usuario1.setNomeCompleto("amanda");
		usuario1.setDataNascimento("28/08");*/
		
		//System.out.println("teste do get: " + usuario1.getNomeCompleto()); //recuperar a informação sem o get na frente vai dar erro pq não esta mais publicos
		//como estou chamando o método fora da classe Usuario. neste caso eu quero imprimir texto mais a variavel usuario1 e nome completo
			
		Scanner scanner = new Scanner(System.in);//comando para aparecer no console
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scanner.nextLine();
		System.out.println("Digite sua data de nascimento: ");
		String dataNascimento = scanner.nextLine();
		System.out.println("Digite endereco: ");
		String endereco = scanner.nextLine();
		
		Usuario usuario1 = new Usuario(nomeCompleto, dataNascimento, endereco);
		
		usuario1.imprimeUsuario(); //buscar o comportamento do usuario - selecionar o método externo de outra classe
		
	}

}
