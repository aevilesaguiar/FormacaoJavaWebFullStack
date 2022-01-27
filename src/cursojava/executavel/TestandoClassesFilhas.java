package cursojava.executavel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setNome("Ana Paula");
		aluno.setDataNascimento("14/02/2000");
		aluno.setIdade(22);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Flavio Tavares");
		diretor.setIdade(36);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Fabiana");
		secretario.setIdade(18);
		
		System.out.println(aluno.maiorDeIdade()+ " - "+ aluno.msgMaiorIdade());
		System.out.println(secretario.maiorDeIdade());
		System.out.println(diretor.maiorDeIdade());
		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		

		System.out.println("Salario é ="+aluno.salario());
		System.out.println("Salario é ="+secretario.salario());
		System.out.println("Salario é ="+diretor.salario());
		
		teste(aluno);
		teste(secretario);
		teste(diretor);
		
		
	}
	
	public static void teste( Pessoa pessoa) {
		System.out.println("Essa pessoa é demais ="
				+pessoa.getNome()+ " e o salario é de= "
				+pessoa.salario());
	}

}
