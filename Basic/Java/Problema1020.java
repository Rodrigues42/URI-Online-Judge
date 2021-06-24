import java.io.IOException;
import java.util.Scanner;

/*
Idade em Dias

Leia um valor inteiro correspondente à idade de uma 
pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano 
com 365 dias e todo mês com 30 dias. Nos casos de teste nunca 
haverá uma situação que permite 12 meses e alguns dias, 
como 360, 363 ou 364. Este é apenas um exercício com 
objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.
*/


public class Problema1020 {
 
    public static void main(String[] args) throws IOException {

    Scanner entrada = new Scanner(System.in);

    int idade, anos, meses, dias, variavel;

    idade = entrada.nextInt();

    anos = idade / 365;
    variavel = anos * 365;
    meses = (idade - variavel) / 30;
    variavel = meses * 30;
    dias = (idade - (variavel + (anos * 365)));

    System.out.println(anos + " ano(s)");
    System.out.println(meses + " mes(es)");
    System.out.println(dias + " dia(s)");

    }
 
}
