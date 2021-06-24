import java.util.Scanner;
import java.lang.Math;

/*
Fibonacci Rápido

A fórmula de Binet é uma forma de calcular números de Fibonacci.

Sua tarefa é, dado um natural n, calcular o valor de 
Fibonacci(n) usando a fórmula acima.

Entrada
A entrada é um número natural n (0 < n ≤ 50).

Saída
A saída é o valor de Fibonacci(n) com 1 casa decimal 
utilizando a fórmula de Binet dada.
*/

public class Problema2164{

    public static double fibonacci(int numero){

        double raiz5, parte1, parte2, fibo;

        raiz5 = Math.sqrt(5);
        parte1 = (1.0 + raiz5) / 2;
        parte2 = (1.0 - raiz5) / 2;

        fibo = (Math.pow(parte1, numero) - Math.pow(parte2, numero)) / raiz5;

        return fibo;
    }

    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        int valor = entrada.nextInt();

        System.out.printf("%.1f\n", fibonacci(valor));
    }
}