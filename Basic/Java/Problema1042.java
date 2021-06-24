import java.util.Scanner;

/*
Sort Simples

Leia 3 valores inteiros e ordene-os em ordem crescente.
No final, mostre os valores em ordem crescente, uma linha 
em branco e em seguida, os valores na sequência como foram 
lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.
*/

public class Problema1042{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int lista[];
        int a, b, c;

        lista = new int[3];

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        if (a < b && a < c){
            System.out.println(a);
            if (b < c){
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);                
            }
        } else{
            if (b < a && b < c){
                System.out.println(b);
                if (a < c){
                    System.out.println(a);
                    System.out.println(c);
                } else {
                    System.out.println(c);
                    System.out.println(a);                
                }
            } else {
                System.out.println(c);
                if (b < a){
                    System.out.println(b);
                    System.out.println(a);
                } else {
                    System.out.println(a);
                    System.out.println(b);                
                }
            } 
        }       
        System.out.println("");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}