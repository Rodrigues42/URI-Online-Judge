import java.io.IOException;
import java.util.Scanner;

/*
Diferença

Leia quatro valores inteiros A, B, C e D. A seguir, 
calcule e mostre a diferença do produto de A e B pelo 
produto de C e D segundo a fórmula: 
DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, 
conforme exemplo abaixo, com um espaço em branco antes e 
depois da igualdade.
*/

public class Problema1007 {
 
    public static void main(String[] args) throws IOException {

    int A, B, C, D, DIFERENCA;
    Scanner entrada = new Scanner(System.in);

    A = entrada.nextInt();
    B = entrada.nextInt();
    C = entrada.nextInt();
    D = entrada.nextInt();

    DIFERENCA = A * B  - C * D;

    System.out.println("DIFERENCA = " + DIFERENCA);

    }
 
}