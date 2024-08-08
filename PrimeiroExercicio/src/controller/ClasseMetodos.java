package controller;

public class ClasseMetodos {
	
	public double percorrerVetor(int[] vetorMil){
		
		double tempoInicial = System.nanoTime();
		
		for (int i = 0 ; i < vetorMil.length ; i++) {
			vetorMil[i] = 0;}
		
		double tempoFinal = System.nanoTime();
		double tempo = (tempoFinal - tempoInicial)/Math.pow(10, 9);
		
		return tempo;
		
	}
	
}
