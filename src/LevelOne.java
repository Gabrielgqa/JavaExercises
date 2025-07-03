import java.util.Locale;
import java.util.Scanner;

public class LevelOne {
    public static void main(String [] args){
        diferenca();
    }

    public static void somaSimples(){
        int A, B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        System.out.println("SOMA = "+ (A+B));
    }

    public static void produtoSimples(){
        int A, B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        System.out.println("PROD = "+ (A*B));
    }

    public static void media2(){
        Locale.setDefault(Locale.US);
        double A, B, C;
        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double result = (A * 2 + B * 3 + C * 5)/10;

        System.out.printf("MEDIA = %.1f", result);
    }

    public static void diferenca(){
        int A, B, C, D;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int result = A * B - C * D;

        System.out.println("DIFERENCA = "+ result);
    }
}
