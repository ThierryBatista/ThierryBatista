package view;

import controller.NegativoController;

public class NegativoPrincipal
{
 public static void main(String Args[])
 {
 NegativoController Neg = new NegativoController();

 double vet[] = {5, -9, 6, -3, 4, 8, 3, -2};
 int tamanho = vet.length;
 int cta = 0;
 double total = Neg.RecSomaNegativ(vet, tamanho, cta);
 System.out.println("O total de números negativos é " + total);
 }
}