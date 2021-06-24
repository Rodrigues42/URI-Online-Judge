import java.io.IOException;
import java.util.Scanner;

public class Problema1018_2 {

    public static int cedulas100(int valor){

        int nota100 = valor / 100;
        
        return nota100;
    }
    public static int celulas50(int valor, int nota100){

        int nota50 = (valor - (100 * nota100)) / 50;

        return nota50;
    }
    public static int cedulas20(int valor, int nota100, int nota50){

        int nota20 = (valor - ((100 * nota100) + (50 * nota50)))/ 20;
        
        return nota20;
    }
    public static int cedulas10(int valor, int nota100, int nota50, int nota20){

        int nota10 = (valor - ((100 * nota100) + (50 * nota50) + (20 * nota20))) / 10;
        
        return nota10;
    }
    public static int cedulas5(int valor, int nota100, int nota50, int nota20, int nota10){

        int nota5 = (valor - ((100 * nota100) + (50 * nota50) + (20 * nota20) + (10 * nota10))) / 5;
        
        return nota5;
    }
    public static int cedulas2(int valor, int nota100, int nota50, int nota20, int nota10, int nota5){

        int nota2 = (valor - ((100 * nota100) + (50 * nota50) + (20 * nota20) + (10 * nota10) + (5 * nota5))) / 2;
        
        return nota2;
    }
    public static int cedulas1(int valor, int nota100, int nota50, int nota20, int nota10, int nota5, int nota2){

        int nota1 = (valor - ((100 * nota100) + (50 * nota50) + (20 * nota20) + (10 * nota10) + (5 * nota5) + (2 * nota2))) / 1;

        return nota1;
    }

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);

        int A, nota100, nota50, nota20, nota10, nota5, nota2, nota1;

        A = entrada.nextInt();

        nota100 = cedulas100(A);
        nota50 = celulas50(A, nota100);
        nota20 = cedulas20(A, nota100, nota50);
        nota10 = cedulas10(A, nota100, nota50, nota20);
        nota5 =  cedulas5(A, nota100, nota50, nota20, nota10);
        nota2 = cedulas2(A, nota100, nota50, nota20, nota10, nota5);
        nota1 = cedulas1(A, nota100, nota50, nota20, nota10, nota5, nota2);

        System.out.println(A);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");

    }
 
}
