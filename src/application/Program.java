package application;

import java.util.Scanner;

import entities.Calculator;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Calculator calc = new Calculator();

    int opcao = -1;

    while (opcao != 0) {
      System.out.println("\nCalculadora!");
      System.out.println("Escolha a operacao desejada:");
      System.out.println("1 - Soma");
      System.out.println("2 - Subtracao");
      System.out.println("3 - Multiplicacao");
      System.out.println("4 - Divisao");
      System.out.println("0 - Sair");
      opcao = sc.nextInt();
    
        if (opcao == 0) {
        System.out.println("Encerrando..");
        break;
       } 
       else if (opcao > 4 || opcao < 0) {
        System.out.println("OPCAO INVALIDA! ");
        continue;
       } 
    
         System.out.println("Digite dois numeros: ");
         double a = sc.nextDouble();
         double b = sc.nextDouble();

         double resultado = 0;
         try {
         switch (opcao) {
          case 1: resultado = calc.somar(a, b);
          break;
          case 2: resultado = calc.subtrair(a, b);
          break;
          case 3: resultado = calc.multiplicar(a, b);
          break;
          case 4: resultado = calc.dividir(a, b);
          break;
       }
        System.out.println("Resultado: " + resultado);
      } 
      catch(IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
     
         
       }
    sc.close();
  }
}
