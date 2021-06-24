import java.util.Scanner;

/*
Aumento de Salário

A empresa ABC resolveu conceder um aumento de salários a 
seus funcionários de acordo com a tabela abaixo:


Salário Percentual de Reajuste
0       -    400.00  | 15%
400.01  -    800.00  | 12%
800.01  -    1200.00 | 10%
1200.01 -   2000.00  | 7%
Acima de 2000.00     | 4%


Leia o salário do funcionário e calcule e mostre o novo 
salário, bem como o valor de reajuste ganho e o índice 
reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com 
duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de 
reajuste e o percentual de reajuste ganho, conforme exemplo 
abaixo.
*/

public class Problema1048{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double salario, novoSalario, reajuste;
        int porcentagem;

        salario = teclado.nextDouble();
        novoSalario = 0;
        reajuste = 0;
        porcentagem = 0;

        if (salario > 2000.00d){
            porcentagem = 4;
            novoSalario = salario + (salario * porcentagem/100);
            reajuste = novoSalario - salario;

        } else if (salario > 1200){  
            porcentagem = 7;
            novoSalario = salario + (salario * porcentagem/100);
            reajuste = novoSalario - salario;

        } else if (salario > 800){
            porcentagem = 10;
            novoSalario = salario + (salario * porcentagem/100);
            reajuste = novoSalario - salario;

        } else if (salario > 400){
            porcentagem = 12;
            novoSalario = salario + (salario * porcentagem/100);
            reajuste = novoSalario - salario;
        } else {
            porcentagem = 15;
            novoSalario = salario + (salario*porcentagem/100);
            reajuste = novoSalario - salario;
        }

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: "+ porcentagem + " %");
    }
}