package entities;

public class Calculator {


  public int somar(int a, int b){
   return a + b;
  }
  public int subtrair(int a, int b) {
    return a - b;
  }
  public int multiplicar(int a, int b) {
    return a * b;
  }
  public int dividir(int a, int b){
   if (b == 0) {
    throw new IllegalArgumentException("ERRO!");
   } else {
    return a / b;
   }
  }
  }


