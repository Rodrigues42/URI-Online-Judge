import java.util.Scanner;

public class Problema1188{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		char operacao = input.nextLine().charAt(0);

		double[][] matriz = new double[12][12];
		double soma=0, aumentar=1, contador=0;

		for(int i=0; i < 12; i++){
			for(int j=0; j < 12; j++){

				matriz[i][j] = input.nextDouble();
			}
		}

		for(int i=11; i > 6; i--){
			for(int j=i; j > aumentar; j--){

				soma += matriz[i][j-1];
				contador++;

			}
			aumentar++;
		}

		if(operacao == 'S'){
			System.out.printf("%.1f\n", soma);
		} else {
			System.out.printf("%.1f\n", soma/contador);	
		}
	}
}