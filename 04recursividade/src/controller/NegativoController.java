package controller;

public class NegativoController
{
 public NegativoController()
 {
 super();
 }
 public double RecSomaNegativ(double[]vet, int tamanho, int cta)
 {
 
 //ao longo da recursiva o programa, sempre que verifica se o conteúdo daquela posição do vetor é negativo, adiciona 1 ao contador
// quando a variável "tamanho" chega a 0, o código retorna o valor do contador	 
	 
  if (tamanho == 0)
  {
  return cta;
  }
  else
  {
   if (vet[tamanho - 1] < 0)
   {
   cta = cta + 1;
   }
   return RecSomaNegativ(vet, tamanho - 1, cta);
  }
 }
}