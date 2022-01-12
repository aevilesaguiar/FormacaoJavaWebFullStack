package principio.responsabilidade;

public class ContaBancaria {
	
	//o objeto tem que fazer o processamento dentro dele proprio desde de que o que ele precisa est� dentro dele
	private String descricao;
	private double saldo = 8000;
	
	public void soma100Reais() {
			saldo +=100;
	}
	
	public void diminui100reais() {
		saldo-=100;
	}
	
	public void sacarDinheiro(double saque) {
		saldo -= saque;
	}
	
	
	public void depositarDinheiro(double deposito) {
		saldo +=deposito;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
	

}
