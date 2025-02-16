package view;

import controller.Exercicio2; //importando os  métodos para o viewer do exercício
import javax.swing.*;

public class Ex2viewer {

	public static void main(String[] args) {
		Exercicio2 ex2 = new Exercicio2(); // forma de chamada para os métodos da classe Exercicio2.java

		int[] vt = { 4, 7, 9, 2, 6, 3 }; // neste caso, o retorno deve ser o número 2
		int size = vt.length; // determinando o tamanho do vetor, neste caso o vetor possui um tamanho de 6
								// casas
		int lessValor = ex2.findLessValue(vt, size, vt[size - 1]); // chamando o método e entregando a
																						// partir do viewer o vetor, seu
		JOptionPane.showMessageDialog(null, "o menor valor no vetor é: " + lessValor);	// final do vetor (encontrado a																			// tamanho, e o valor no índice
																						// partir do tamanho menos 1)
																						

	}

}
