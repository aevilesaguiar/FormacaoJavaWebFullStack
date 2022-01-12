package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursojava.constantes.StatusAluno;

public class Aluno {

	/*atributos*/
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;

	//lista de Disciplinas
	private List<Disciplina>disciplinas = new ArrayList<Disciplina>();
	
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}


	/*Cria os dados  na mem�ria- Padr�o do Java*/
	public Aluno() {
	}
	
	
	/*Cria os dados  na mem�ria- Padr�o do Java*/
	public Aluno(String nome) {
		this.nome = nome;
		
	}
	
	
	public Aluno(String nome, int idade) {
		this.nome=nome;
		this.idade=idade;
	}
	
	
	




	public Aluno(String nome, int idade, String serieMatriculado, double nota1, double nota2, double nota3,
			double nota4) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.serieMatriculado = serieMatriculado;

	}


	//M�todos getters e setters do objeto
	//Set � para adicionar ou receber dados para os atributos
	//Get � para resgatar ou obter o valor do atributo
	public String getNome() {
		return nome;
	}

	//recebe dados 
	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getRegistroGeral() {
		return registroGeral;
	}


	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}


	public String getNumeroCpf() {
		return numeroCpf;
	}


	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}


	public String getNomeMae() {
		return nomeMae;
	}


	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}


	public String getNomePai() {
		return nomePai;
	}


	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}


	public String getDataMatricula() {
		return dataMatricula;
	}


	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}


	public String getNomeEscola() {
		return nomeEscola;
	}


	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}


	public String getSerieMatriculado() {
		return serieMatriculado;
	}


	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}


	public double getMediaNota() {
		
		double somaNotas = 0.0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas+=disciplina.getNota();
		}
		return somaNotas/disciplinas.size();//size() retorna quantas disciplinas tem na lista
	}
	

	public boolean getAlunoAprovado() {
		
		
		double media = this.getMediaNota();
		if (media >= 70) { // Aprovado
			return true;
		} else { // Reprovado
			return false;
		}
	}

	public String getAlunoAprovado2() {
		
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;				
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}
	}

	

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", serieMatriculado="
				+ serieMatriculado +"]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(dataMatricula, dataNascimento, idade, nome, nomeEscola, nomeMae, nomePai, numeroCpf,
				registroGeral, serieMatriculado);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula)
				&& Objects.equals(dataNascimento, other.dataNascimento) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(nomeMae, other.nomeMae) && Objects.equals(nomePai, other.nomePai)
				&& Objects.equals(numeroCpf, other.numeroCpf) && Objects.equals(registroGeral, other.registroGeral)
				&& Objects.equals(serieMatriculado, other.serieMatriculado);
	}


	
	

	

}
