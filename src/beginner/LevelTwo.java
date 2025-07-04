package beginner;

import java.util.Locale;
import java.util.Scanner;

public class LevelTwo {
    public static void main(String[] args){
        media1();
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
}
