import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

/*
O Maior

Faça um programa que leia três valores e apresente o maior 
dos três valores lidos seguido da mensagem “eh o maior”. 
Utilize a fórmula:

Obs.: a fórmula apenas calcula o maior entre os dois
 primeiros (a e b). Um segundo passo, portanto é 
 necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a 
mensagem "eh o maior".
*/

public class Problema1013 {
 
    public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);

    int A, B, C, primeiroMaior, finalMaior;

    A = entrada.nextInt();
    B = entrada.nextInt();
    C = entrada.nextInt();

    primeiroMaior = (A + B + Math.abs(A-B))/2;

    finalMaior = (primeiroMaior + C + Math.abs(primeiroMaior-C))/2;

    System.out.println(finalMaior + " eh o maior");

    }
 
}
