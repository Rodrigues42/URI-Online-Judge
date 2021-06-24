import java.io.IOException;
import java.util.Scanner;

/*
Salário com Bônus

Faça um programa que leia o nome de um vendedor, o seu 
salário fixo e o total de vendas efetuadas por ele no mês 
(em dinheiro). Sabendo que este vendedor ganha 15% de comissão 
sobre suas vendas efetuadas, informar o total a receber no 
final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) 
e 2 valores de dupla precisão (double) com duas casas decimais, 
representando o salário fixo do vendedor e montante total das 
vendas efetuadas por este vendedor, respectivamente.

Saída
Imprima o total que o funcionário deverá receber, 
conforme exemplo fornecido.

TOTAL = R$ xxx.xx
*/

public class Problema1009 {
 
    public static void main(String[] args) throws IOException {

    String nome;
    double salario, vendas, salarioFinal;
    Scanner entrada = new Scanner(System.in);

    nome = entrada.nextLine();
    salario = entrada.nextDouble();
    vendas = entrada.nextDouble();

    salarioFinal = (vendas * 0.15) + salario;

    System.out.print("TOTAL = R$ ");
    System.out.printf("%.2f\n", salarioFinal);

    }
 
}