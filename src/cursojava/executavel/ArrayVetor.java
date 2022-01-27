package cursojava.executavel;

public class ArrayVetor {

	public static void main(String[] args) {

		//criar array
		double[]notas=new double[4];
		
		notas[0]=9.8;
		notas[1]=10.0;
		notas[2]=7.50;
		notas[3]=5.50;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("A nota "+(i+1)+" = "+notas[i]);
		}

		

	}


}
