import java.util.Scanner;

/*
Animal

Neste problema, você deverá ler 3 palavras que definem o 
tipo de animal possível segundo o esquema abaixo, da esquerda 
para a direita.  Em seguida conclua qual dos animais seguintes
foi escolhido, através das três palavras fornecidas.


Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias 
para identificar o animal segundo a figura acima, com todas as 
letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.
*/

public class Problema1049{
	public static void main(String args[]){

		Scanner teclado = new Scanner(System.in);

		String a, b, c;

		a = teclado.nextLine();
		b = teclado.nextLine();
		c = teclado.nextLine();

		if (a.equals("vertebrado")){
			if (b.equals("ave")){
				if (c.equals("carnivoro")){
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}	

			} else {
				if (b.equals("mamifero")){
					if (c.equals("onivoro")){
						System.out.println("homem");
					
					} else{
						System.out.println("vaca");
					} 
				}
			}

		} else {
			if (b.equals("inseto")){
				if (c.equals("hematofago")){
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			
			} else {
				if (c.equals("hematofago")){
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}

			}


		}

	}
}