import java.io.IOException;
import java.util.Scanner;

public class Problema1012_2 {
    public static int cedulas (int n, int valor) {
        System.out.printf("%d nota(s) de R$ %d,00\n", n / valor, valor);
        return n % valor; 
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.printf("%d\n", n);

        n = cedulas(n, 100);
        n = cedulas(n, 50);
        n = cedulas(n, 20);
        n = cedulas(n, 10);
        n = cedulas(n, 5);
        n = cedulas(n, 2);
        n = cedulas(n, 1);
    }
}