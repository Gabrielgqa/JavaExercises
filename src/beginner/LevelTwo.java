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

    public static void salarioComBonus(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[][] notas = new double[N][3];
        for (int i =0; i<N; i++){
            for (int j=0; j<3; j++){
                notas[i][j] = sc.nextDouble();
            }
        }
        for (int i =0; i<N; i++){
            double media = (notas[i][0] * 2 + notas[i][1] * 3 + notas[i][2] * 5)/10;
            System.out.printf("%.1f\n", media);
        }
    }
}
