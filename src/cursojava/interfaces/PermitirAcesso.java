package cursojava.interfaces;

/*Interface sr� o contrato de autentica��o*/
public interface PermitirAcesso {
	


	public boolean autenticar(String login, String senha);/* apenas declara��o do m�todo */
	public boolean autenticar();

}
