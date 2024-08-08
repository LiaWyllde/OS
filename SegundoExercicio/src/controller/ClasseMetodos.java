package controller;

public class ClasseMetodos {
	
	public int quantiaElementos(String texto) {
		
		int numero = 0;
		
		String[] vetorTexto = texto.split(";");
		
		for (String item : vetorTexto) {numero++;}
		
		return numero;
	}
	
	
}
