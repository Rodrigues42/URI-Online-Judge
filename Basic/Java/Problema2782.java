import java.util.Scanner;

public class Problema2782{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] lista = new int[n+1];
        int escadinhas=1;

        for(int i=0; i < n; i++){
            lista[i] = input.nextInt();
        }

        if (n != 1 || n != 2){

            int diferenca = lista[1] - lista[0];
        
            for(int j=1; j < n-1; j++){
                
                if(lista[j+1] - lista[j] != diferenca){
                    escadinhas++;
                    diferenca = lista[j+1] - lista[j];
                }
            }

        } else {
            System.out.println(1);
        }
        System.out.println(escadinhas);
    }
}