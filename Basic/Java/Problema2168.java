import java.util.Scanner;

public class Problema2168{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int[][] quadra = new int[n+1][n+1];

		for(int i=0; i < n+1; i++){
			for(int j=0; j<n+1; j++){

				int camera = input.nextInt();
				quadra[i][j] = camera; 

			}
		}
		for(int i=0; i <= n-1; i++){
			for(int j=0; j <= n-1; j++){
			
				int count=0;
				for(int k=0; k < 2; k++){
					for(int l=0; l < 2; l++){

						if(quadra[i+k][j+l] > 0){
							count++;
						}
					}
				}
				
				if(count >= 2){
					System.out.print("S");
				} else{
					System.out.print("U");
				}
			}
			System.out.println();
		}

	} 
}