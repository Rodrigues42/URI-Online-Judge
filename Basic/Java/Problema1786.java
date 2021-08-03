import java.util.Scanner;

public class Problema1786{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while(input.hasNext()){

			String cpf = input.nextLine();

			int digito1=0, digito2=0, contador=0;
			String cpfComple="";

			for(int i=0; i < cpf.length(); i++){

				digito1 += (i+1) * Character.getNumericValue(cpf.charAt(i));
			}

			digito1 = digito1 % 11;

			String digito1S;
			if(digito1 == 10 ){
				digito1S = "0";
			} else {
				digito1S = String.valueOf(digito1);
			}

			for(int i=9; i > 0; i--){

				digito2 += i * Character.getNumericValue(cpf.charAt(contador));
				contador++;
			}

			digito2 = digito2 % 11;

			String digito2S;
			if(digito2 == 10 ){
				digito2S = "0";
			} else {
				digito2S = String.valueOf(digito2);
			}

			int count=1;
			for(int i=0; i < cpf.length(); i++){

				cpfComple += cpf.charAt(i);
				
				if(count == 3 && i < 8){
					cpfComple += '.';
					count = 0;
				}
				count++;
			}

			System.out.println(cpfComple +"-"+digito1S+digito2S);
		}
	}
}