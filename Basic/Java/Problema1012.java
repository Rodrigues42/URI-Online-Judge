import java.io.IOException;
import java.util.Scanner;

/*
Área

Escreva um programa que leia três valores com ponto flutuante 
de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores com um dígito 
após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. 
Cada linha corresponde a uma das áreas descritas acima, 
sempre com mensagem correspondente e um espaço entre os 
dois pontos e o valor. O valor calculado deve ser apresentado 
com 3 dígitos após o ponto decimal.
*/

public class Problema1012 {
 
    public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);

    double A, B, C, PI, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

    PI = 3.14159;
    A = entrada.nextDouble();
    B = entrada.nextDouble();
    C = entrada.nextDouble();

    areaTriangulo = (A * C)/2;
    areaCirculo = PI * (C * C);
    areaTrapezio = ((A + B)*C)/2;
    areaQuadrado = B * B;
    areaRetangulo = A * B;


    System.out.print("TRIANGULO: ");
    System.out.printf("%.3f\n", areaTriangulo);
    System.out.print("CIRCULO: ");
    System.out.printf("%.3f\n", areaCirculo);
    System.out.print("TRAPEZIO: ");
    System.out.printf("%.3f\n", areaTrapezio);
    System.out.print("QUADRADO: ");
    System.out.printf("%.3f\n", areaQuadrado);
    System.out.print("RETANGULO: ");
    System.out.printf("%.3f\n", areaRetangulo);

    }
 
}
