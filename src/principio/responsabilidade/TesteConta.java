package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {

		ContaBancaria bancaria = new ContaBancaria();
		
		bancaria.setDescricao("Conta bancaria da Aeviles");
		System.out.println(bancaria);
		
		bancaria.diminui100reais();
		System.out.println(bancaria);
		
		bancaria.depositarDinheiro(1500);

		System.out.println(bancaria);
		
		bancaria.sacarDinheiro(1200);
		
		System.out.println(bancaria);
	}

}
