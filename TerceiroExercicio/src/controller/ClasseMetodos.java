package controller;
import java.util.Scanner;

public class ClasseMetodos {
	
	static Scanner scan = new Scanner(System.in);
	
	public int[] carregaVetor(int[] vetNumeros) {
		
		int n = vetNumeros.length;
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Digite um número: ");
			int numero = scan.nextInt();
			vetNumeros[i] = numero;
		}
		
		parOuImpar(vetNumeros, n);
		scan.close();
		
		return vetNumeros;
	}
	
	private void parOuImpar(int[] vetorCarregado, int n) {
		
		for (int numero : vetorCarregado) {
			
			//ímpares
			if (numero % 2 != 0) {
				System.out.println("O número " + numero + " é impar.");
			}
			//pares
			else if (numero % 10 == 0) {
				System.out.println("O número " + numero + " é par e múltiplo de 10");
			}
		}	
	}	
}
