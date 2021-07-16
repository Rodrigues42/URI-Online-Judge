import java.util.Scanner;

public class Problema1187{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		double[][] matriz = new double[12][12];

		char operacao = input.nextLine().charAt(0);

		int count=0, contador1=11, contador2=0;
		double numero,soma=0;

		for(int i=0; i < 12; i++){
			for(int j=0; j < 12; j++){
				
				numero = input.nextDouble();

				matriz[i][j] = numero;

				if(j < contador1 && j > contador2 && i < 5){
					soma += numero;
					count++;
				}
			}

			contador1--;
			contador2++;	
		}

		double media = soma/count;

		if(operacao == 'S'){
			System.out.printf("%.1f\n", soma);
		} else{
			System.out.printf("%.1f\n", media);
		}
	}
}