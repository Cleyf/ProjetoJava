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
		System.out.println("\nDigite sua op��o:");
		op = leia.nextInt();
		System.out.println("\n************************************");
		switch (op)
		{
		case 1:
			System.out.println("\nA f�milia mora de aluguel");
			System.out.println("\n (1) = SIM");
			System.out.println("\n (2) = N�O");
			op2 = leia.nextInt();
			System.out.println("\nQual � a renda total da fam�lia");
			renda = leia.nextFloat();
			if (renda>2500 && op2==2)
			{
				System.out.println("\nVoc� n�o receber� o benef�cio");
			}
			else
			{
				System.out.println("\n Voc�s ir�o ganhar uma cesta b�sica, "
						+ "ser�o acompanhados pela equipe GEN ");
				System.out.println("Nome para cadastrar");
				String setNome= leia.next();
				registro.add(setNome);
			}
			break;
		case 2:
			System.out.println("\nA f�milia mora de aluguel");
			System.out.println("\n (1) = SIM");
			System.out.println("\n (2) = N�O");
			op2 = leia.nextInt();
			System.out.println("\nQual � a renda total da fam�lia");
			renda = leia.nextFloat();
			if (op2==2 && renda>3000)
			{
				System.out.println("\nVoc� n�o receber� o benef�cio");
			}
			else
			{
				System.out.println("\n Voc�s ir�o ganhar uma cesta b�sica, "
						+ "ser�o acompanhados pela equipe GEN ");
				System.out.println("Nome para cadastrar");
				String setNome= leia.next();
				registro.add(setNome);
			}
			break;
		case 3:
			System.out.println("\nA f�milia mora de aluguel");
			System.out.println("\n (1) = SIM");
			System.out.println("\n (2) = N�O");
			op2 = leia.nextInt();
			System.out.println("\nQual � a renda total da fam�lia");
			renda = leia.nextFloat();
			if (op2==2 && renda>5000)
			{
				System.out.println("\nVoc� n�o receber� o benef�cio");
			}
			else
			{
				System.out.println("\n Voc�s ir�o ganhar uma cesta b�sica, "
						+ "ser�o acompanhados pela equipe GEN ");
				System.out.println("Nome para cadastrar");
				String setNome= leia.next();
				registro.add(setNome);
			}
			break;
		default:
			System.out.println("Tente novamento, com uma op��o v�lida");
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
