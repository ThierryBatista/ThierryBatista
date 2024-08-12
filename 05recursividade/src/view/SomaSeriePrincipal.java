package view;

import controller.SomaSerie;

public class SomaSeriePrincipal
{
 public static void main (String Args[])
 {
 SomaSerie SomS = new SomaSerie();
 int numero = 5;

 
 double serie = SomS.RecSomaSerie(numero);
 System.out.println("A somatória da série é " + serie);
 }
}