import java.util.Scanner;
import java.lang.Math;

public class Problema2455{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int p1 = input.nextInt();
        int c1 = input.nextInt();
        int p2 = input.nextInt();
        int c2 = input.nextInt();

        int pessoa1 = p1 * c1;
        int pessoa2 = p2 * c2;

        if(pessoa1 == pessoa2){
            System.out.println(0);

        } else if(pessoa1 > pessoa2){
            System.out.println(-1);

        } else {
            System.out.println(1);
        }
    }
}