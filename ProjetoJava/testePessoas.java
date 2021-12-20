package ProjetoJava;

import java.util.Scanner;

public class testePessoas {

	public static void main(String[] args) {
		Desempregado desempregado = new Desempregado();
		Gerente gerente = new Gerente("Gerente",9500);
		
		Scanner leia = new Scanner(System.in);
		
		
		for (int x=0;x<3;x++)
		{
		desempregado.cadastro();
		desempregado.ajuda();
		desempregado.imprimirinfo();
		}
		gerente.imprimirinfo();
		gerente.cadastro();
		gerente.ajuda();
		
				

	}

}
