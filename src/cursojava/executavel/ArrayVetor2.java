package cursojava.executavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class ArrayVetor2 {

	public static void main(String[] args) {

		double total=0;
		String posicoes = JOptionPane.showInputDialog("Quantas posições o array deve ter");
		//criar array
		double[]notas=new double[Integer.parseInt(posicoes)];

		 
		for (int i = 0; i < notas.length; i++) {
			String valor=JOptionPane.showInputDialog("Qual o valor da posição "+i +" =");
			notas[i]=Double.valueOf(valor);
			
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("A nota "+(i+1)+" = "+notas[i]);
			total+=notas[i];
			
		}

		double media=total/notas.length;
		System.out.println(media);

	}


}
