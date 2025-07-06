package beginner;

import java.util.Locale;
import java.util.Scanner;

public class LevelTwo {
    public static void main(String[] args){
        salarioComBonus();
    }

    public static void media1(){
        Locale.setDefault(Locale.US);
        double A, B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();

        double media = (A * 3.5 + B * 7.5) / 11;

        System.out.printf("MEDIA = %.5f",media);
    }

    public static void salario(){
        int id, numeroHoras;
        double valorHora;
        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        numeroHoras = sc.nextInt();
        valorHora = sc.nextDouble();

        System.out.println("NUMBER = "+id);
        System.out.printf("SALARY = U$ %.2f", numeroHoras * valorHora);
    }
}
