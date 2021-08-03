import java.util.Scanner;

public class Problema2031{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int rodadas = input.nextInt();

		String jogador1, jogador2;

		for(int i=0; i < rodadas; i++){

			jogador1 = input.next();
			String enter = input.nextLine();
			jogador2 = input.next();

			String a, pe, pa;

			a = "ataque";
			pe = "pedra";
			pa = "papel";

			if(jogador1.equals(a) && jogador2.equals(a)){
				System.out.println("Aniquilacao mutua");
			
			} else if(jogador1.equals(pe) && jogador2.equals(pe)){
				System.out.println("Sem ganhador");
			
			} else if(jogador1.equals(pa) && jogador2.equals(pa)){
				System.out.println("Ambos venceram");
			
			} else if(jogador1.equals(a) && jogador2.equals(pe)){
				System.out.println("Jogador 1 venceu");
			
			} else if(jogador1.equals(pe) && jogador2.equals(a)){
				System.out.println("Jogador 2 venceu");
			
			} else if(jogador1.equals(pe) && jogador2.equals(pa)){
				System.out.println("Jogador 1 venceu");
			
			} else if(jogador1.equals(pa) && jogador2.equals(pe)){
				System.out.println("Jogador 2 venceu");
			
			} else if(jogador1.equals(pa) && jogador2.equals(a)){
				System.out.println("Jogador 2 venceu");
			
			} else if(jogador1.equals(a) && jogador2.equals(pa)){
				System.out.println("Jogador 1 venceu");
			}				
		}
	}
}