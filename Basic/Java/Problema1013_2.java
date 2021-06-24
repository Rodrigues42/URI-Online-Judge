import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Problema1013_2 {

    public static int maior(int A, int B, int C){

        int primeiroMaior = (A + B + Math.abs(A-B))/2;

        int finalMaior = (primeiroMaior + C + Math.abs(primeiroMaior-C))/2;

        return finalMaior;
    }
 
    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        int A, B, C;

        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();

        System.out.println(maior(A, B, C) + " eh o maior");

    }
 
}
