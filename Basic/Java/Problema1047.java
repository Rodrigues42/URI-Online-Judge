import java.util.Scanner;

/*
Tempo de Jogo com Minutos

Leia a hora inicial, minuto inicial, hora final e minuto 
final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração 
máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e 
fim do jogo.

Saída
Mostre a seguinte mensagem: 
“O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .

*/

public class Problema1047{
	public static void main(String args[]){

		Scanner teclado = new Scanner(System.in);

		int horaIni, minuIni, horaFinal, minutoFinal, hora, minuto;

		horaIni = teclado.nextInt();
		minuIni = teclado.nextInt();
		horaFinal = teclado.nextInt();
		minutoFinal = teclado.nextInt();
		
		if (horaFinal - horaIni == 0){
			if (minutoFinal - minuIni == 0){
				hora = 24;
				minuto = 0;
				
			} else if (minutoFinal - minuIni < 0){
				hora = 23;
				minuto = 60 - minuIni + minutoFinal;
			
			} else {
				hora = 0;
				minuto = minutoFinal - minuIni;
			}	
	
		} else if (horaFinal - horaIni == 1) {

			if (minutoFinal - minuIni == 0) {
				hora = horaFinal - horaIni;
				minuto = 0;

			} else if (minutoFinal - minuIni < 0) {
				hora = 0;
				minuto = 60 - minuIni + minutoFinal;
			
			} else {
				hora = 0;
				minuto = minutoFinal - minuIni;
			}

		} else if (horaFinal - horaIni > 1){
			
			if (minutoFinal - minuIni < 0) {
				hora = horaFinal - horaIni - 1;
				minuto = 60 - minuIni + minutoFinal;
			
			} else {
				hora = horaFinal - horaIni;
				minuto = minutoFinal - minuIni;
			}

		} else {

			if (horaFinal - horaIni < -1){
				hora = 24 - horaIni + horaFinal;

				if (minutoFinal - minuIni < 0) {
					hora -= 1;
					minuto = 60 - minuIni + minutoFinal;
				
				} else {
					hora = 24 - horaIni + horaFinal;
					minuto = minutoFinal - minuIni;
				}

			}else if (minutoFinal - minuIni < 0) {
				hora = 23;
				minuto = 60 - minuIni + minutoFinal;
				
			} else {
				hora = 24 - horaIni + horaFinal;
				minuto = minutoFinal - minuIni;
			}

		}

	System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
		
	}
}