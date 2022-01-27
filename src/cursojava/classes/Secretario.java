package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

	private String registro;
	private String experiencia;
	private String nivelCargo;
	
	private String login;
	private String senha;
	
	public Secretario() {
		
	}
	
	public Secretario(String login, String senha) {
		this.login=login;
		this.senha=senha;
	}
	
	public Secretario(String registro, String experiencia, String nivelCargo) {
		super();
		this.registro = registro;
		this.experiencia = experiencia;
		this.nivelCargo = nivelCargo;
	}

	public String getRegistro() {
		return registro;
	}
	
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	public String getExperiencia() {
		return experiencia;
	}
	
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	public String getNivelCargo() {
		return nivelCargo;
	}
	
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", experiencia=" + experiencia + ", nivelCargo=" + nivelCargo
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 2000.00;
	}

	/*Esse é o método do contrato de autenticação*/


	@Override
	public boolean autenticar(String login, String senha) {
		this.login=login;
		this.senha=senha;
		return autenticar();
				
	}

	@Override
	public boolean autenticar() {
		
		return login.equals("admin")&& senha.equals("admin");
	}

	
	
}
