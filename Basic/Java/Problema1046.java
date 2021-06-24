import java.util.Scanner;

/*
Tempo de Jogo

Leia a hora inicial e a hora final de um jogo. 
A seguir calcule a duração do jogo, sabendo que o mesmo 
pode começar em um dia e terminar em outro, tendo uma duração 
mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a 
hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.
*/

public class Problema1046{
	public static void main(String args[]){

		Scanner teclado = new Scanner(System.in);

		int a, b, horas;

		a = teclado.nextInt();
		b = teclado.nextInt();

		if (a == b){
			horas = 24;

		} else if (a > b){
			horas = 24 - a + b;

		} else{
			horas = b - a;
		}

		System.out.println("O JOGO DUROU "+horas+" HORA(S)");
	}
}