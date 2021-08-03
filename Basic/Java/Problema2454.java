import java.util.Scanner;

public class Problema2454{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int p = input.nextInt();
		int r = input.nextInt();


		if(p == 0){
			System.out.println("C");
		
		} else {

			if( r == 0 ){
				System.out.println("B");
			
			} else {
				System.out.println("A");
			}
		}
	}
}