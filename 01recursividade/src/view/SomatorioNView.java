package view;

import controller.SomatorioNController;

public class SomatorioNView 
{
	public static void main(String[] args) 
	{
	SomatorioNController SomN = new SomatorioNController();
		
	int numero = 8;
	int soma = 0;
    soma = SomN.RecSoma(numero, soma);
    System.out.println(soma);
	}

}
