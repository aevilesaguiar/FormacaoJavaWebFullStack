package cursojava.interfaces;

/*Interface srá o contrato de autenticação*/
public interface PermitirAcesso {
	


	public boolean autenticar(String login, String senha);/* apenas declaração do método */
	public boolean autenticar();

}
