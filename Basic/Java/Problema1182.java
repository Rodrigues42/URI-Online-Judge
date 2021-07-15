import java.util.Scanner;
import java.io.IOException;

public class Problema1182{
	public static void main(String[] args) throws IOException{

		Scanner input = new Scanner(System.in);

		int c = input.nextInt();
		input.nextLine();
		char t = input.next().charAt(0);

		float[][] matriz = new float[12][12];

		for(int i=0; i<12; i++){
			for(int j=0; j<12; j++){
				
				float numero = input.nextFloat();
				matriz[i][j] = numero;
			}
		}

		float soma=0;
		for(int l=0; l<12; l++){

			float num = matriz[l][c];
			soma += num;
		}

		if(t == 'S'){
			System.out.printf("%.1f\n", soma);
		
		} else{
			System.out.printf("%.1f\n", soma/12);
		}
	}
}