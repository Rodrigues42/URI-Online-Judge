import java.io.IOException;
import java.util.Scanner;


/*
Cédulas

Leia um valor inteiro. A seguir, calcule o menor número de 
notas possíveis (cédulas) no qual o valor pode ser decomposto.
 As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
 A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de 
notas de cada tipo necessárias, conforme o exemplo fornecido.
Não esqueça de imprimir o fim de linha após cada linha, caso
contrário seu programa apresentará a mensagem:
 “Presentation Error”.
*/

public class Problema1018 {
 
    public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);

    int A, nota100, nota50, nota20, nota10, nota5, nota2, nota1;

    A = entrada.nextInt();

    nota100 = A / 100;
    nota50 = (A - (100 * nota100)) / 50;
    nota20 = (A - ((100 * nota100) + (50 * nota50)))/ 20;
    nota10 = (A - ((100 * nota100) + (50 * nota50) + (20 * nota20))) / 10;
    nota5 = (A - ((100 * nota100) + (50 * nota50) + (20 * nota20) + (10 * nota10))) / 5;
    nota2 = (A - ((100 * nota100) + (50 * nota50) + (20 * nota20) + (10 * nota10) + (5 * nota5))) / 2;
    nota1 = (A - ((100 * nota100) + (50 * nota50) + (20 * nota20) + (10 * nota10) + (5 * nota5) + (2 * nota2))) / 1;
    
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
