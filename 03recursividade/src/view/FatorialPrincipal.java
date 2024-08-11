package view;

import controller.FatorialController;

public class FatorialPrincipal
{
 public static void main(String Args[])
 {
 
 FatorialController FatC = new FatorialController();
 int numero = 5;
 int fatorial = FatC.RecFatorial(numero);
 System.out.println("O fatorial de " + numero + " é " + fatorial);
 }
}