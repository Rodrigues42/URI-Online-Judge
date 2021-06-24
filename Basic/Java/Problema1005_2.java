import java.io.IOException;
import java.util.Scanner;

public class Problema1005_2 {

    public static double media(double A, double B){

        double media = (A * 3.5 + B * 7.5) / 11;

        return media;

    }
 
    public static void main(String[] args) throws IOException {

        double A, B;

        Scanner entrada = new Scanner(System.in);

        A = entrada.nextDouble();
        B = entrada.nextDouble();

        double media = media(A, B);

        System.out.print("MEDIA = ");
        System.out.printf("%.5f\n", media);
    }
 
}