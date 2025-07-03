import java.util.Scanner;

public class LevelOne {
    public static void main(String [] args){
        produtoSimples();
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
}
