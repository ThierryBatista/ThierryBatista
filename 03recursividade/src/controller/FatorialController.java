package controller;

public class FatorialController
{
 public FatorialController()
 {
 super();
 }
 public int RecFatorial(int numero)
 {
 //ponto de parada da função é após esta chegar a 1, pois desta forma toda formará a seguencia de 1 até 5
	 if (numero == 1)
	  {
	   return 1;
	  }
	  else
	  {
//assim que a recursiva terminar, toda a sequência se multiplicará(por conta da equação n * (n-1)) resultando no fatorial de 5	  
	  return numero * RecFatorial(numero - 1);
	  }
	 }
	}
