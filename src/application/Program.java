package application;

import java.util.Scanner;

import entities.Calculator;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Calculator calc = new Calculator();

    int opcao = -1;

    while (opcao != 0) {
        System.out.println("Calculadora!");
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
       int a = sc.nextInt();
       int b = sc.nextInt();
         if (opcao == 1) {
        System.out.println("Resultado: ");
         System.out.println(calc.somar(a, b));
      }
       else if (opcao == 2) {
        System.out.println("Resultado: ");
        System.out.println(calc.subtrair(a, b));
       }
       else if (opcao == 3) {
        System.out.println("Resultado: ");
        System.out.println(calc.multiplicar(a, b)); 
       }
       else if (opcao == 4) {
        System.out.println("Resultado: ");
        System.out.println(calc.dividir(a, b));
       }
      
       }
    sc.close();
  }
}
