import java.util.Locale;
import java.util.Scanner;

public class LevelOne {
    public static void main(String [] args){
        conversaoDeTempo();
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

    public static void consumo(){
        int X;
        double Y;
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        Y = sc.nextDouble();

        double result = X / Y;

        System.out.printf("%.3f km/l", result);
    }

    public static void distanciaEntreDoisPontos(){
        double x1, y1, x2, y2;

        Scanner sc = new Scanner(System.in);
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f", result);
    }

    public static void distancia(){
        int km;

        Scanner sc = new Scanner(System.in);
        km = sc.nextInt();

        System.out.printf("%d minutos", km*2);
    }

    public static void gastoDeCombustivel(){
        int hr, km;
        Scanner sc = new Scanner(System.in);
        hr = sc.nextInt();
        km = sc.nextInt();

        double result = hr * km / 12.0;

        System.out.printf("%.3f",result);
    }

    public static void conversaoDeTempo(){
        int tempo;
        Scanner sc = new Scanner(System.in);
        tempo = sc.nextInt();

        int horas = tempo / 60 / 60;
        int minutos = (tempo - horas * 60 * 60) / 60;
        int segundos = (tempo - horas * 60 * 60) - minutos * 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
