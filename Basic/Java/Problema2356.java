import java.util.Scanner;

public class Problema2356{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		while(input.hasNext()){

			String d = input.nextLine();
			String s = input.nextLine();

			boolean contem = false;

			for(int i=0; i < d.length(); i++){
				
				String sequencia = "";
				
				if(d.charAt(i) == s.charAt(0)){

					sequencia += d.charAt(i);

					for(int j=1; j < s.length(); j++){

						if( i + j < d.length() && d.charAt(i+j) == s.charAt(j) ){

							sequencia += d.charAt(i+j);
						}
					}

					if(sequencia.equals(s)){
						contem = true;
						break;
					}
				}
			}

			if(contem){
				System.out.println("Resistente");
			} else {
				System.out.println("Nao resistente");
			}
		}
	}
}