package controller;

public class Exercicio2 {

	public Exercicio2() {
		super();
	}
	public int findLessValue (int[] vt, int size, int lessAtual) {
		if (size == 0) {
			return lessAtual; //se o vetor só possue um espaço (de índice 0), só é necessário retornar o valor nesta posição, pois é o único, com esta sendo a Condição de Parada
		}
		
		else if(vt[size - 1] < lessAtual) { //o vetor precisa ser determinado por [size - 1] pois o índice começa a ser contado do zero, se não o sistema tentaria ler uma posição inexistente
			lessAtual = vt[size - 1]; //se o  valor no vetor for menor que o menor valor atual, este se tornará o novo menor valor para as próximas comparações.
		}
		
		return findLessValue(vt, size - 1, lessAtual); //retorna o valor, o tamanho menos uma posição para ir decrescendo até a Condição de Parada e o menor valor atualmente;
	}

}
