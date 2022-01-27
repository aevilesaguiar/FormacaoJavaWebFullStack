package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso{

	private String registroEducacao;
	private String tempoDirecaoString;
	private String titulacao;
	
	private String login;
	private String senha;
	
	
	
	public Diretor(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public Diretor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Diretor(String registroEducacao, String tempoDirecaoString, String titulacao) {
		super();
		this.registroEducacao = registroEducacao;
		this.tempoDirecaoString = tempoDirecaoString;
		this.titulacao = titulacao;
	}

	public String getRegistroEducacao() {
		return registroEducacao;
	}
	
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	
	public String getTempoDirecaoString() {
		return tempoDirecaoString;
	}
	
	public void setTempoDirecaoString(String tempoDirecaoString) {
		this.tempoDirecaoString = tempoDirecaoString;
	}
	
	public String getTitulacao() {
		return titulacao;
	}
	
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecaoString=" + tempoDirecaoString
				+ ", titulacao=" + titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento="
				+ dataNascimento + ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae="
				+ nomeMae + ", nomePai=" + nomePai + "]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3589.00;
	}

	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

	@Override
	public boolean autenticar(String login, String senha) {
		this.login=login;
		this.senha=senha;
		return autenticar();
				
	}

	@Override
	public boolean autenticar() {
		
		return login.equals("flavio")&& senha.equals("123");
	}

	
	
	
	
}
