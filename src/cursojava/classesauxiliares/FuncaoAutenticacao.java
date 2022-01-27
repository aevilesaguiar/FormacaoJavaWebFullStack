package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*só receber quem tenha o contrato da interface de PermitirAcesso e chamar o autenticacao*/
public class FuncaoAutenticacao {
	
	
	private PermitirAcesso permitircesso;
	
	public boolean autenticar() {
		return permitircesso.autenticar();
	}

	public FuncaoAutenticacao(PermitirAcesso acesso) {
		
		this.permitircesso=acesso;
	}


	
}
