import java.util.Scanner;
import java.lang.Math;

/*
Múltiplos

Leia 2 valores inteiros (A e B). Após, o programa deve 
mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.
*/


public class Problema1042{
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        int a, b;

        a = entrada.nextInt();
        b = entrada.nextInt();

        if (a > b){
            while ( a * contador != b || a * contador < b){
                contador += 1
            } if ( a * contador == b){
                System.out.println("Sao Multiplos");

            } else {
                System.out.println('Não sao Multiplos')
            }
        }

    }
}