package controller;

public class SomaSerie
{
 public SomaSerie()
 {
 super();
 }

 public double RecSomaSerie(int numero)
 {
//O ponto de parada se da quando o numero chega a 1, realizando a somatória da função 1 / (n + (n - 1))
  if(numero == 1)
  {
  return 1;
  }
  return 1 / (numero + RecSomaSerie( numero - 1));               
  
 }
}