import java.util.Scanner;

/*
Linha na Matriz

Neste problema você deve ler um número, indicando uma linha 
da matriz na qual uma operação deve ser realizada, um caractere 
aiúsculo, indicando a operação que será realizada, e todos os
elementos de uma matriz M[12][12]. Em seguida, calcule e 
mostre a soma ou a média dos elementos que estão na área 
verde da matriz, conforme for o caso. A imagem abaixo 
ilustra o caso da entrada do valor 2 para a linha da matriz, 
demonstrando os elementos que deverão ser considerados na 
operação.


Entrada
A primeira linha de entrada contem um número L (0 ≤ L ≤ 11) indicando a linha que será considerada para operação. A segunda linha de entrada contém um único caractere Maiúsculo T ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz, sendo que a mesma é preenchida linha por linha, da linha 0 até a linha 11, sempre da esquerda para a direita.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
*/

public class Problema1181{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int numero;
        char operacao;
        float matriz[][], soma, media;

        matriz = new float[12][12];

        numero = Integer.parseInt(teclado.nextLine());
        operacao = teclado.nextLine().charAt(0);

        for (int linha = 0; linha < 12; linha++){
            for (int coluna = 0; coluna < 12; coluna++) {
                matriz[linha][coluna] = teclado.nextFloat();
            }
        }

        soma = 0;

        for (int coluna = 0; coluna < 12; coluna++){
            soma += matriz[numero][coluna];
        }

        if (operacao == 'S') {
            System.out.printf("%.1f\n", soma);
        } else {
            media = soma / 12;
            System.out.printf("%.1f\n", media);
        }
    }
}