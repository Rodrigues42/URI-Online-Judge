import java.io.IOException;
import java.util.Scanner;

/*
Cálculo Simples

Neste problema, deve-se ler o código de uma peça 1, 
o número de peças 1, o valor unitário de cada peça 1, 
o código de uma peça 2, o número de peças 2 e o valor 
unitário de cada peça 2. Após, calcule e mostre o valor
 a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada 
linha haverá 3 valores, respectivamente dois inteiros e um 
valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido 
abaixo, lembrando de deixar um espaço após os dois pontos e 
um espaço após o "R$". O valor deverá ser apresentado com 2 
casas após o ponto.
*/

public class Problema1010 {
 
    public static void main(String[] args) throws IOException {

    int peca1, peca2, num_peca1, num_peca2;
    double valor1, valor2, total;
    Scanner entrada = new Scanner(System.in);

    peca1 = entrada.nextInt();
    num_peca1 = entrada.nextInt();
    valor1 = entrada.nextDouble();
    peca2 = entrada.nextInt();
    num_peca2 = entrada.nextInt();
    valor2 = entrada.nextDouble();

    total = num_peca1 * valor1 + num_peca2 * valor2;

    System.out.print("VALOR A PAGAR: R$ ");
    System.out.printf("%.2f\n", total);

    }
 
}