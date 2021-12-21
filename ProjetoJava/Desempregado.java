package ProjetoJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Desempregado extends Pessoas {
	
	ArrayList <String> registro = new ArrayList<String>();
	Scanner leia = new Scanner (System.in);
	int op, op2;
	float renda;
	public Desempregado()
	{	
		super("String","String",25);
	}
	@Override
	public void cadastro()
	{
		do
		{
		System.out.println("\n************************************");
		System.out.println("\n Informe a quantidade de pessoas:");
		System.out.println("\n************************************");
		System.out.println("\n(1) Para 2 duas pessoas ou menos ");
		System.out.println("\n(2) Para 3 pessoas");
		System.out.println("\n(3) Para 4 pessoas ou mais");
		System.out.println("\n(4) Para Sair ");
		System.out.println("\nDigite sua opção:");
		op = leia.nextInt();
		System.out.println("\n************************************");
		switch (op)
		{
		case 1:
			System.out.println("\nA fámilia mora de aluguel");
			System.out.println("\n (1) = SIM");
			System.out.println("\n (2) = NÃO");
			op2 = leia.nextInt();
			System.out.println("\nQual é a renda total da família");
			renda = leia.nextFloat();
			if (renda>2500 && op2==2)
			{
				System.out.println("\nVocê não receberá o benefício");
			}
			else
			{
				System.out.println("\n Vocês irão ganhar uma cesta básica, "
						+ "serão acompanhados pela equipe GEN ");
				System.out.println("Nome para cadastrar");
				String setNome= leia.next();
				registro.add(setNome);
			}
			break;
		case 2:
			System.out.println("\nA fámilia mora de aluguel");
			System.out.println("\n (1) = SIM");
			System.out.println("\n (2) = NÃO");
			op2 = leia.nextInt();
			System.out.println("\nQual é a renda total da família");
			renda = leia.nextFloat();
			if (op2==2 && renda>3000)
			{
				System.out.println("\nVocê não receberá o benefício");
			}
			else
			{
				System.out.println("\n Vocês irão ganhar uma cesta básica, "
						+ "serão acompanhados pela equipe GEN ");
				System.out.println("Nome para cadastrar");
				String setNome= leia.next();
				registro.add(setNome);
			}
			break;
		case 3:
			System.out.println("\nA fámilia mora de aluguel");
			System.out.println("\n (1) = SIM");
			System.out.println("\n (2) = NÃO");
			op2 = leia.nextInt();
			System.out.println("\nQual é a renda total da família");
			renda = leia.nextFloat();
			if (op2==2 && renda>5000)
			{
				System.out.println("\nVocê não receberá o benefício");
			}
			else
			{
				System.out.println("\n Vocês irão ganhar uma cesta básica, "
						+ "serão acompanhados pela equipe GEN ");
				System.out.println("Nome para cadastrar");
				String setNome= leia.next();
				registro.add(setNome);
			}
			break;
		default:
			System.out.println("Tente novamento, com uma opção válida");
		}
		}while(op !=0);
		
	}
	
	@Override
	public void ajuda()
	{
		System.out.println("\nAJUDE-NOS DIVULGANDO NOSSO TRABALHO");
		System.out.println("COMPARTILHE NOSSAS REDES SOCIAIS");
		System.out.println("@THATIPIRESSS");
	}
	@Override
	public void imprimirinfo()
	{
		System.out.println("\n");
		System.out.println("\nLista de cadastrados");
		System.out.println(registro);
	}
}
