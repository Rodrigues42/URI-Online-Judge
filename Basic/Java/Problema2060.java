import java.util.Scanner;

/*Desafio de Bino

Bino e Cino são colegas inseparáveis. Bino gosta de criar 
desafios matemáticos para Cino resolver. Desta vez, Bino gerou 
uma lista de números e perguntou ao Cino quantos números da 
lista são múltiplos de 2, 3, 4 e 5.

Esse desafio pode parecer simples, porém, quando a lista 
contém muitos números, Cino se confunde e acaba errando 
alguns cálculos. Para ajudar Cino, faça um programa para 
resolver o desafio de Bino.

Entrada
A primeira linha da entrada consiste em um inteiro 
N (1 ≤ N ≤1000), representando a quantidade de números na 
lista de Bino.

A segunda linha contém N inteiros Li (1 ≤ Li ≤ 100), 
representando os números da lista de Bino.

Saída
Imprima a quantidade de números múltiplos de 2, 3, 4 e 5 
presentes na lista. Observe a formatação da saída nos 
exemplos, pois ela deve ser seguida rigorosamente.*/

public class Problema2060{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int multiplo2=0, multiplo3=0, multiplo4=0, multiplo5=0;

		int n = input.nextInt();

		for (int i=0; i < n; i++){

			int numero = input.nextInt();

			if (numero % 2 == 0){
				multiplo2++;

				if (numero % 4 == 0) {
					multiplo4++;
				} 

			} if (numero % 3 == 0) {
				multiplo3++;
			
			} if (numero % 5 == 0){
				multiplo5++;
			} 
		}

	System.out.println(multiplo2+" Multiplo(s) de 2\n"+
						multiplo3+" Multiplo(s) de 3\n"+
						multiplo4+" Multiplo(s) de 4\n"+
						multiplo5+" Multiplo(s) de 5");
	}
}