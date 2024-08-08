package view;
import controller.ClasseMetodos;

public class Principal {
	
	public static void main(String[] Args) {
		
		ClasseMetodos classe = new ClasseMetodos();
		
		int[] vetorMil = new int[999];
		int[] vetorDezMil = new int [9999];
		int[] vetorCemMil = new int [99999];
		
		double tempo = classe.percorrerVetor(vetorMil);
		System.out.println("O tempo para percorrer o vetor com 1000 posições é de: " + tempo + "s.");
		
		tempo = classe.percorrerVetor(vetorDezMil);
		System.out.println("O tempo para percorrer o vetor com 10000 posições é de: " + tempo + "s.");
		
		tempo = classe.percorrerVetor(vetorCemMil);
		System.out.println("O tempo para percorrer o vetor com 100000 posições é de: " + tempo + "s.");
		
	}
}
