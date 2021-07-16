import java.util.Scanner;

public class Problema1185{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		float[][] matriz = new float[12][12];

		char operacao = input.nextLine().charAt(0);

		int count=0, contador=11;
		float numero,soma=0;

		for(int i=0; i < 12; i++){
			for(int j=0; j < 12; j++){
				
				numero = input.nextFloat();

				matriz[i][j] = numero;

				if(j < contador){
					soma += numero;
					count++;
				}
			}

			contador--;	
		}

		float media = soma/count;

		if(operacao == 'S'){
			System.out.printf("%.1f\n", soma);
		} else{
			System.out.printf("%.1f\n", media);
		}
	}
}