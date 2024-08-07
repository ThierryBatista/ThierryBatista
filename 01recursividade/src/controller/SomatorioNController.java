package controller;


	public class SomatorioNController
	{
		
    public SomatorioNController()
    {
	 super();
    }
    
 // a lógica por trás desta recursiva se trata de ir diminuido o número até que este chegue a 0
 // toda vez que a função se repete a variável soma se soma com a variável numero
 // assim que a variável numero chega a 0, o sistema retorna a somatória    
    
	 public int RecSoma(int numero, int soma)
	 {
	  if (numero == 0)
	  {
	  return soma; 	  
	  }
	  else
	  {
	  soma = soma + numero;
	  return RecSoma(numero - 1, soma);
	  }
	 }
	}

