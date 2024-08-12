package view;

import controller.MenorValorController;

public class MenorValorPrincipal 
{

	public static void main(String[] args) 
	{
		 MenorValorController MenV = new MenorValorController();

		 int vet[] = {10,7,4,8,5};
		 int tamanho = vet.length;
		 int primMenorVal = vet[4];

		 int menorV = MenV.RecMenorValor(vet, tamanho, primMenorVal);
		 System.out.println("O menor valor é " + menorV);	// TODO Auto-generated method stub

	}

}
