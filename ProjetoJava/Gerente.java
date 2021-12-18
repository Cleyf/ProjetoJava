package ProjetoJava;

import java.util.Scanner;

public class Gerente extends Pessoas {
private String profi;
private float sal;
Scanner leia = new Scanner(System.in);
int resp;
public Gerente(String profi, float sal)
{
	super("Maria Jose","36987452121",45);
	this.profi= profi;
	this.sal = sal;
}

@Override
public void cadastro()
{
	System.out.println("\nVocê possui casa própria?");
	String resp = leia.next();
	System.out.println("Você não receberá ajuda da equipe GEN,"
			+ " pos buscamos atender pessoas com vulnerabilidade");
}

@Override
public void ajuda() 
{
	for(int x=0;x<10;x++)
	{
		System.out.println("\n");
	}
	
	System.out.println("\nVenha você tambem fazer parte desse projeto");
	System.out.println("\n(1) Para doar 5 reais");
	System.out.println("\n(2) Para doar 10 reais");
	System.out.println("\n(3) Para doar 20 reais");
	System.out.println("\n(4) Para outro valor:");
	System.out.println("\n(5) Para Sair");
	System.out.println("\nDigite sua resposta");
	resp = leia.nextInt();
	switch (resp)
	{
	case 1:
		System.out.println("\nVocê doou R$5:00 Reais");
		System.out.println("\nMuito Obrigado");
		System.out.println("\nAJUDE-NOS DIVULGANDO NOSSO TRABALHO");
		System.out.println("COMPARTILHE NOSSAS REDES SOCIAIS");
		System.out.println("@THATIPIRESSS");
	break;
	case 2:
		System.out.println("\nVocê doou R$10:00 Reais");
		System.out.println("\nMuito Obrigado");
		System.out.println("\nAJUDE-NOS DIVULGANDO NOSSO TRABALHO");
		System.out.println("COMPARTILHE NOSSAS REDES SOCIAIS");
		System.out.println("@THATIPIRESSS");
	break;
	case 3:
		System.out.println("\nVocê doou R$20:00 Reais");
		System.out.println("\nMuito Obrigado");
		System.out.println("\nAJUDE-NOS DIVULGANDO NOSSO TRABALHO");
		System.out.println("COMPARTILHE NOSSAS REDES SOCIAIS");
		System.out.println("@THATIPIRESSS");
		break;
	case 4:
		System.out.println("\nQuanto deseja doar hoje?");
		float valor = leia.nextFloat();
		System.out.println("\nVocê doou R$"+valor+"Reais");
		System.out.println("Muito Obrigado");
		System.out.println("\nAJUDE-NOS DIVULGANDO NOSSO TRABALHO");
		System.out.println("COMPARTILHE NOSSAS REDES SOCIAIS");
		System.out.println("@THATIPIRESSS");
		break;
	case 5:
		System.out.println("Muito Obrigado!!!");
		System.out.println("\nAJUDE-NOS DIVULGANDO NOSSO TRABALHO");
		System.out.println("COMPARTILHE NOSSAS REDES SOCIAIS");
		System.out.println("@THATIPIRESSS");
		break;
		default:
		System.out.println("Opção Inválida");
	}

}	
	@Override
	public void imprimirinfo()
	{
		System.out.println("\nNOME:"+getNome()+"\nCPF:"+getCpf()+"\nIdade:"
				+getIdade()+"\nPROFISSÃO: "+profi+"\nSÁLARIO:"+sal);
	}

	public String getProfi() {
		return profi;
	}

	public void setProfi(String profi) {
		this.profi = profi;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public int getResp() {
		return resp;
	}

	public void setResp(int resp) {
		this.resp = resp;
	}
	

}
