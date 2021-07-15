import java.util.Scanner;
import java.lang.Math;

public class Problema1547{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int qt, s;

		for(int i=1; i <= n; i++){

			qt = input.nextInt();
			s = input.nextInt();

			int[] chutes = new int[qt];
			int menor=0, jogador=0;

			for(int j=0; j < qt; j++){

				chutes[j] = input.nextInt();
			}

			for(int k=0; k < qt; k++){

				if(k == 0){
					menor = Math.abs(s - chutes[k]);
					if(chutes[k] == s){
						jogador = k;
						break;
					}

				} else if(chutes[k] == s){
					jogador = k;
					break;

				} else if(Math.abs(s - chutes[k]) < menor){

					menor = Math.abs(s - chutes[k]);
					jogador = k;
				}
			}

			System.out.println(jogador+1);
		}
	}
}