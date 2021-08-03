import java.util.Scanner;

public class Problema2436{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int l = input.nextInt();
		int c = input.nextInt();
		int a = input.nextInt();
		int b = input.nextInt();

		int[][] salao = new int[l][c];
		int y=a-1, x=b-1;

		for(int i=0; i<l; i++){
			for(int j=0; j<c; j++){

				salao[i][j] = input.nextInt();
			}
		}

		a = a - 1;
		b = b - 1;

		boolean continua = true;
		while(continua){
			
			salao[a][b] = 0;

			if( b + 1 < c && salao[a][b+1] == 1){
				b++;

			} else if(a - 1 >= 0 && salao[a-1][b] == 1){
				a--;
			
			} else if( b -1 >= 0 && salao[a][b-1] == 1){
				b--;
			
			} else if( a + 1 < l && salao[a+1][b] == 1 ){
				a++;

			} else {
				continua=false;
			}
		}

		System.out.print(a+1 + " ");
		System.out.println(b+1);

	}
}