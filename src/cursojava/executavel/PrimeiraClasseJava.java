package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		//new Aluno() é uma instancia, ou seja criação de objeto
		//aluno1 é uma referencia para o objeto aluno
		
		String nome = JOptionPane.showInputDialog("Nome:");
		String idade = JOptionPane.showInputDialog("Idade:");
		/*String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento:");
		String registroGeral = JOptionPane.showInputDialog("Registro Geral:");
		String cpf = JOptionPane.showInputDialog("CPF:");
		String nomeMae = JOptionPane.showInputDialog("Mae:");
		String nomePai = JOptionPane.showInputDialog("Pai:");
		String dataMatricula = JOptionPane.showInputDialog("Matricula:");
		String escola = JOptionPane.showInputDialog("Escola:");*/
		String serie = JOptionPane.showInputDialog("Serie:");
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.parseInt(idade));
		/*aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(escola);*/
		aluno1.setSerieMatriculado(serie);
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Projetos");
		disciplina2.setNota(90);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Didática");
		disciplina3.setNota(90);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Didática");
		disciplina4.setNota(90);

		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);

		
		System.out.println("Nome:"+aluno1.getNome());
		System.out.println("Idade:"+aluno1.getIdade());/*
		System.out.println("Data Nascimento:"+aluno1.getDataNascimento());
		System.out.println("RG:"+aluno1.getRegistroGeral());
		System.out.println("CPF:"+aluno1.getNumeroCpf());
		System.out.println("Mãe:"+aluno1.getNomeMae());
		System.out.println("Pai:"+aluno1.getNomePai());
		System.out.println("Matricula:"+aluno1.getDataMatricula());
		System.out.println("Nome Escola:"+aluno1.getNomeEscola());*/
		System.out.println("Serie:"+aluno1.getSerieMatriculado());
		System.out.println("Média: "+aluno1.getMediaNota());
		System.out.println("Resultado = "+ (aluno1.getAlunoAprovado()?"Aprovado":"Reprovado"));
		
		System.out.println("=========================================================");

		
		
		Aluno aluno = new Aluno();
		System.out.println(aluno1.toString());
		


		

		
}
}