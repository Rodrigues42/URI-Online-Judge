import java.io.IOException;
import java.util.Scanner;

/*
Conversão de Tempo

Leia um valor inteiro, que é o tempo de duração em segundos 
de um determinado evento em uma fábrica, e informe-o expresso 
no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), 
convertido para horas:minutos:segundos, conforme exemplo 
fornecido.
*/

public class Problema1019 {
 
    public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);

    int N, horas, minutos, segundos, variavel;

    N = entrada.nextInt();

    horas = N / 3600;
    variavel = horas * 3600;
    minutos = (N - variavel) / 60;
    variavel = minutos * 60; 
    segundos = (N  - (variavel + (horas * 3600)));

    System.out.println(horas + ":" + minutos + ":" + segundos);
    }
 
}
