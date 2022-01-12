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
		
		//criar uma lista de alunos
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		
		for(int qtd = 1; qtd <= 5; qtd ++) {
			
			// new Aluno() � uma inst�ncia da classe Aluno (cria��o do objeto)
			// aluno1 � uma refer�ncia para o objeto
			
			// Entrada de dados com o teclado (Dados do aluno)
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno " + qtd + " :");
			/*String idade = JOptionPane.showInputDialog("Digite a idade do aluno:");
			String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento do aluno:");
			String rg = JOptionPane.showInputDialog("Digite o RG do aluno:");
			String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno:");
			String nomeMae = JOptionPane.showInputDialog("Digite o nome da m�e do aluno:");
			String nomePai = JOptionPane.showInputDialog("Digite o nome do pai do aluno:");
			String dataMatricula = JOptionPane.showInputDialog("Digite a data da matr�cula do aluno:");
			String serieMatriculado = JOptionPane.showInputDialog("Digite a s�rie do aluno:");
			String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola do aluno:");	*/			
			
			Aluno aluno1 = new Aluno();
			
			// Dados do aluno1
			aluno1.setNome(nome);
			/*aluno1.setIdade(Integer.valueOf(idade));
			aluno1.setDataNascimento(dataNascimento);
			aluno1.setRegistroGeral(rg);
			aluno1.setNumeroCpf(cpf);
			aluno1.setNomeMae(nomeMae);
			aluno1.setNomePai(nomePai);
			aluno1.setDataMatricula(dataMatricula);
			aluno1.setSerieMatriculado(serieMatriculado);
			aluno1.setNomeEscola(nomeEscola);*/
			
			for (int pos = 1; pos <= 1; pos++) {
				
				String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da " + pos + "� disciplina:");
				String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da " + pos + "� disciplina:");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				
				aluno1.getDisciplinas().add(disciplina);
			}
			
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			
			if (escolha == 0) { // Op��o SIM = 0
				
				int continuarRemover = 0;
				int posicao = 1;
				
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog(null, "Informe a disciplina a ser removida [1, 2, 3 ou 4]");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao ++; // Incremente 1 ao valor atual da vari�vel posicao
					continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar a remover?");
				}			
			}
			
			alunos.add(aluno1);
		}
		
		for (Aluno aluno : alunos) {/*separados em listas*/
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
			
			alunosAprovados.add(aluno);
		}else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
		
			alunosRecuperacao.add(aluno);	
		}else {
			alunosReprovados.add(aluno);
		}
			}
		
		System.out.println("---------------Lista dos aprovados-----------------------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Nome: "+ aluno.getNome()+" Resultado:"+ aluno.getAlunoAprovado2() + " com media de ="+ aluno.getMediaNota());
		}
		
		System.out.println("---------------Lista dos Reprovados-----------------------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Nome: "+ aluno.getNome()+" Resultado:"+ aluno.getAlunoAprovado2() + " com media de ="+ aluno.getMediaNota());
		}
		System.out.println("---------------Lista em recupera��o-----------------------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Nome: "+ aluno.getNome()+" Resultado:"+ aluno.getAlunoAprovado2() + " com media de ="+ aluno.getMediaNota());
		}
		
		
		}
}
