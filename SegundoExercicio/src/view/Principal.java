package view;
import java.util.Scanner;
import controller.ClasseMetodos;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ClasseMetodos classe = new ClasseMetodos();
		
		System.out.println("Digite uma frase: ");
		String texto = scan.next();
		
		int numero = classe.quantiaElementos(texto);
		
		System.out.println(numero);
		
		scan.close();
	}
	
}
