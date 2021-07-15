import java.util.Scanner;

public class Problema2592{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        while(n != 0){

            int[] lista = new int[n];
            int[] comparacao = new int[n]; 

            for(int i=0; i < n; i++){
                comparacao[i] = i+1;
            }

            int contador = 0;
            boolean igual, continua = true;
                
            while(continua){

                igual = true;

                for(int i=0; i < n; i++){

                    lista[i] = input.nextInt();
                }

                for(int j=0; j < n; j++){
                    
                    if(lista[j] != comparacao[j]){
                        igual = false;
                        break;
                    }
                }

                contador++;
                if(igual == true){
                    continua = false;
                    System.out.println(contador);
                }
            }

            n = input.nextInt();
        }
    }
}