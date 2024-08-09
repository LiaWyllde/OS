package view;
import java.util.Scanner;
import controller.ClasseMetodos;

public class Principal {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		ClasseMetodos classe = new ClasseMetodos();
	
		int n = 0;
		while (n <= 0 || n > 100) {
			System.out.println("Escolha o tamanho do vetor com até 100 posições.");
			n = scan.nextInt();
		}
		
		int[] vetNumeros = new int[n];
		classe.carregaVetor(vetNumeros);
		
		scan.close();
	}

}
