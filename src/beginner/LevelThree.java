package beginner;

import java.util.Scanner;

public class LevelThree {
    public static void main(String[] args){
        calculoSimples();
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
}
