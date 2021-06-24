import java.io.IOException;
import java.util.Scanner;

/*
Notas e Moedas

Leia um valor de ponto flutuante com duas casas decimais. 
Este valor representa um valor monetário. A seguir, 
calcule o menor número de notas e moedas possíveis no qual o
valor pode ser decomposto. As notas consideradas 
são de 100, 50, 20, 10, 5, 2. As moedas possíveis 
são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir 
mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto 
flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas 
necessárias para trocar o valor inicial, conforme exemplo 
fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
*/

public class Problema1021 {

    static void notas_moedas(double valor) {

        int nota100, nota50, nota20, nota10, nota5, nota2;
        double moeda1, moeda050, moeda025, moeda010, moeda005, moeda001, variavel;

        nota100 = (int) (valor) / 100;
        variavel = (int) (valor) - (nota100 * 100);
        nota50 = (int) (variavel) / 50; 
        variavel = (int) (variavel) - (nota50 * 50);
        nota20 = (int) (variavel) / 20; 
        variavel = (int) (variavel) - (nota20 * 20);
        nota10 = (int) (variavel) / 10; 
        variavel = (int) (variavel) - (nota10 *10);
        nota5 = (int) (variavel) / 5; 
        variavel = (int) (variavel) - (nota5 * 5);
        nota2 = (int) (variavel) / 2; 
        variavel = (int) (variavel) - (nota2 * 2);
        moeda1 = (int) (variavel) / 1;
        variavel =  variavel - (moeda1 * 1);

        variavel = valor - ((nota100*100 + nota50*50 + nota20*20 + nota10*10 + nota5*5 + nota2*2 + moeda1 * 1));

        moeda050 = variavel / 0.50;
        variavel = variavel - ((int) (moeda050) * 0.50);
        moeda025 = variavel / 0.25;
        variavel = variavel - ((int) (moeda025) * 0.25);
        moeda010 = variavel / 0.10;
        variavel = variavel - ((int) (moeda010) * 0.10);
        moeda005 = variavel / 0.05;
        variavel = variavel - ((int) (moeda005) * 0.05);
        moeda001 = variavel / 0.009999999999999995;

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int) (moeda1) + " moeda(s) de R$ 1.00");
        System.out.println((int) (moeda050) + " moeda(s) de R$ 0.50");
        System.out.println((int) (moeda025) + " moeda(s) de R$ 0.25");
        System.out.println((int) (moeda010) + " moeda(s) de R$ 0.10");
        System.out.println((int) (moeda005) + " moeda(s) de R$ 0.05");
        System.out.println((int) (moeda001) + " moeda(s) de R$ 0.01");

    }
 
    public static void main(String[] args) throws IOException {
        
        Scanner entrada = new Scanner(System.in);

        double dinheiro;

        dinheiro = entrada.nextDouble();

        notas_moedas(dinheiro);
    }
 
}