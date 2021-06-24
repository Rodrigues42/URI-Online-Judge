import java.util.Scanner;
import java.lang.Math;

/*
Triangulo

Leia 3 valores reais (A, B e C) e verifique se eles formam 
ou não um triângulo. Em caso positivo, calcule o perímetro 
do triângulo e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B 
como base e C como altura, mostrando a mensagem

Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.
*/

public class Main{
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        double a, b, c, perimetro, area;
        boolean caso1, caso2, caso3;

        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        caso1 = ((a + b) > c);
        caso2 = ((a + c) > b);
        caso3 = ((b + c) > a);

        if ( caso1 && caso2 && caso3 ){
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            area = ((a+b)*c)/2;
            System.out.printf("Area = %.1f\n", area);
        }

    }
}