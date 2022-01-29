package cursojava.executavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor3 {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Joao");

		double[] notasJava = { 7.8, 9.0, 10, 8.5 };
		double[] notasDados = { 8.8, 9.0, 5, 6.5 };
		double[] notasLogica = { 8.0, 9.0, 5, 8.5 };
		double[] notasbd = { 6, 9.5, 5.0, 7.5 };

		Disciplina disciplna = new Disciplina();
		disciplna.setDisciplina("Curso java");
		disciplna.setNota(notasJava);
		aluno.getDisciplinas().add(disciplna);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Estrutura de Dados");
		disciplina2.setNota(notasDados);
		aluno.getDisciplinas().add(disciplina2);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("logica de Programa��o");
		disciplina2.setNota(notasLogica);
		aluno.getDisciplinas().add(disciplina3);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("bd");
		disciplina2.setNota(notasbd);
		aluno.getDisciplinas().add(disciplina4);

		System.out.println("Nome do aluno= " + aluno.getNome());
		System.out.println("--------Disciplinas do aluno----------");
		for (Disciplina d : aluno.getDisciplinas()) {
			System.out.println("Disciplina : " + d.getDisciplina());
			System.out.println("Notas da disciplina s�o:");
			
			double notaMax=0.0;
			double notaMin=0.0;
			for (int i = 0; i < d.getNota().length; i++) {
				System.out.println("Nota " + (1 + i) + " � igual =" + d.getNota()[i]);
				
				if(i ==0) {//quando for a primeira que a variavel i percorrer ele ser� 0, e vamos aramazenar ela como nota m�xima
					notaMax=d.getNota()[i];//notamax ==nota
					notaMin=d.getNota()[i];
				}else{//sen�o
					if(d.getNota()[i]>notaMax) {//se a nota for maior nessa posi��o inicial 
						notaMax=d.getNota()[i];}
				}
				if(d.getNota()[i]<notaMin){
					notaMin=d.getNota()[i];}
			}
			System.out.println("A maior nota da disciplina " + d.getDisciplina()+" � "+notaMax );
			System.out.println("A menor nota da disciplina " + d.getDisciplina()+" � "+notaMin );
		}
fffff
	}

}
