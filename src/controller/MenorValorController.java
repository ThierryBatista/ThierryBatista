package controller;

public class MenorValorController 
{
	 public MenorValorController()
	 {
	 super();
	 }
  public int RecMenorValor(int[]vet, int tamanho, int primMenorVal )
  // Esta function tem como objetivo comparar todos os itens do vetor para armazenar a o menor valor na variável primMenorVal
  // O ponto de parada ocorre quando o valor da primeira posição do vetor é verificado, finalizando a recursividade
    {
	  if (tamanho == 1)
	  {
	  return primMenorVal;
	  }
	  else
	  {
	   if (primMenorVal > vet[tamanho - 2])
	   {
		   primMenorVal = vet[tamanho - 2];
	   }
	   else
	   {
		   if (primMenorVal > vet[tamanho - 1])
		   {
			   primMenorVal = vet[tamanho - 1];
		   } 
	   }
	   return RecMenorValor(vet, tamanho - 1, primMenorVal);
	  }
	 }
}   
		
	


	