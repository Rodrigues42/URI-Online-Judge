import java.util.Scanner;

/*Dígitos Diferentes

Os habitantes de Nlogônia são muito supersticiosos. 
Uma de suas crenças é que os números das casas de rua que 
têm um dígito repetido traz sorte ruim para os moradores. 
Portanto, eles nunca iriam viver em uma casa que tem o 
número 838 ou 1004, por exemplo.

A rainha de Nlogônia ordenou a construção de uma nova 
avenida à beira-mar e quer atribuir para as novas casas 
apenas números sem dígitos repetidos, para evitar 
desconforto entre os seus súditos. Você foi nomeado por 
Sua Majestade para escrever um programa que, dado dois 
inteiros N e M, determine a quantidade máxima possível de 
casas que podem assumir um número entre N e M inclusive, 
sem que ocorram dígitos repetidos nestes números.

Entrada
Cada teste é descrito usando uma linha. A linha contém 
dois inteiros N e M, conforme descrito acima (1 ≤ N ≤ M ≤ 5000).

Saída
Para cada caso de teste imprima um valor inteiro que 
representa a quantidade máxima possível de números de casa 
entre N e M inclusive, sem dígitos repetidos.
 */

public class Problema1285{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		while(input.hasNext()){

			int[] digitos = new int[10];
			int n, m, contador=0;


			n = input.nextInt();
			m = input.nextInt();

			for(int i=n; i<=m; i++){

				String x = Integer.toString(i);
				digitos = new int[10];

				for(int j=0; j <x.length(); j++){

					if (x.charAt(j) == '0'){
						digitos[0]++;

					} else if(x.charAt(j) == '1'){
						digitos[1]++;

					} else if(x.charAt(j) == '2'){
						digitos[2]++;

					} else if(x.charAt(j) == '3'){
						digitos[3]++;

					} else if(x.charAt(j) == '4'){
						digitos[4]++;

					} else if(x.charAt(j) == '5'){
						digitos[5]++;

					} else if(x.charAt(j) == '6'){
						digitos[6]++;

					} else if(x.charAt(j) == '7'){
						digitos[7]++;

					} else if(x.charAt(j) == '8'){
						digitos[8]++;

					} else{
						digitos[9]++;
					}
				}

				boolean repetidos = false; 

				for(int f=0; f < digitos.length; f++){

					if(digitos[f] > 1){
						repetidos = true;
						break;
					}
				}

				if(repetidos == false){
					contador++;
				}

			} System.out.println(contador);
		}
	}
}