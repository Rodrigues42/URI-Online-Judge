import java.util.Scanner;

public class Problema2594{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int qtdVezes = input.nextInt();
		input.nextLine();

		for(int l=0; l < qtdVezes; l++){

			char anterior = ' ';
			char posterior = ' ';

			String texto = input.nextLine();
			String palavra = input.nextLine();

			boolean continua = true, encontrou=false;
			boolean imprimiu = false;		

			for(int i=0; i < texto.length(); i++){

				if(texto.charAt(i) == palavra.charAt(0) && continua){

					boolean igual=false;
					int contador=0;

					if(i != 0){
						anterior = texto.charAt(i-1);
					
					}

					if(i == texto.length()-palavra.length()){
						posterior = ' ';
					}

					for(int j=0; j < palavra.length(); j++){

						//System.out.println(texto.charAt(i+j) + " " + palavra.charAt(contador));

						if( i+j < texto.length() && texto.charAt(i+j) == palavra.charAt(contador)){
							igual = true;
						} else {
							igual = false;
							break;
						}

						if( i != texto.length()-palavra.length() && i+j+1 < texto.length()){
							posterior = texto.charAt(i+j+1);
						}
						contador++;
					}

					if(igual && anterior == ' ' && posterior == ' '){
						
						if(imprimiu){
							System.out.print(" " + i);
							encontrou=true;
						
						} else {
							System.out.print(i);
							encontrou=true;
							imprimiu = true;
						}
					}
				}
			}

			if(encontrou){
				System.out.println();
			} else{
				System.out.println(-1);
			}
		}
	}
}