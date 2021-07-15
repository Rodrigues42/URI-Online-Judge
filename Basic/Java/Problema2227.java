import java.util.Scanner;

public class Problema2227{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int a = input.nextInt(); 
        int v = input.nextInt(); 
        
        int n=1;
        while(a != 0 && v != 0){

            int[] listaAero = new int[a];

            for(int i=0; i < v; i++){

                int x = input.nextInt();
                int y = input.nextInt();

                listaAero[x-1]++;
                listaAero[y-1]++;
            }

            int maior = listaAero[0];

            for(int j=1; j < a; j++){

                if(listaAero[j] > maior){
                    maior = listaAero[j];
                }
            }

            System.out.println("Teste "+n);

            for(int k=0; k < a; k++){

                if(listaAero[k] == maior){
                    System.out.print(k+1+" ");
                }
            }

            n++;
            System.out.println();
            System.out.println();
            a = input.nextInt(); 
            v = input.nextInt(); 
        }
    }
}