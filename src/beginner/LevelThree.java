package beginner;

import java.util.Scanner;

public class LevelThree {
    public static void main(String[] args){
        formulaDeBhaskara();
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

    public static void formulaDeBhaskara(){
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double delta = B * B - 4 * A * C;

        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double sqrtDelta = Math.sqrt(delta);
            double R1 = (-B + sqrtDelta) / (2 * A);
            double R2 = (-B - sqrtDelta) / (2 * A);

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }
        sc.close();

    }
}
