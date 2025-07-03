import java.util.Scanner;

public class LevelOne {
    public static void main(String [] args){
        somaSimples();
    }

    public static void somaSimples(){
        int A, B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        System.out.println("SOMA = "+ (A+B));
    }
}
