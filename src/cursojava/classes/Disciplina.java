package cursojava.classes;

import java.util.Arrays;
import java.util.Objects;

/**
 * Classe que representa uma Disciplina
 */
public class Disciplina {

	// cada disciplina terá 4 notas durante o ano
	private String disciplina;
	private double[] nota= new double[3];

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}



	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}
	
	public double getMediaNotas() {
		double somaTotal=0.0;
		
		for (int i = 0; i < nota.length; i++) {
			somaTotal+=nota[i];
		}
		return somaTotal/nota.length;
	}
	
	

	@Override
	public String toString() {
		return "Disciplina [disciplina=" + disciplina + ", nota=" + Arrays.toString(nota) + ", getDisciplina()="
				+ getDisciplina() + ", getNota()=" + Arrays.toString(getNota()) + ", getMediaNotas()=" + getMediaNotas()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(disciplina);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina) && Arrays.equals(nota, other.nota);
	}

	
}
