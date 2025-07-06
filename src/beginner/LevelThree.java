package beginner;

import java.util.Scanner;

public class LevelThree {
    public static void main(String[] args){
        oMaior();
    }

    public static void calculoSimples(){
        int cod1, quantidade1, cod2, quantidade2;
        double valor1, valor2;

        Scanner sc = new Scanner(System.in);
        cod1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        valor1 = sc.nextDouble();
        cod2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        valor2 = sc.nextDouble();

        double valorTotal = quantidade1*valor1 + quantidade2*valor2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
    }

    public static void oMaior(){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maior + " eh o maior");

        sc.close();
    }
}
