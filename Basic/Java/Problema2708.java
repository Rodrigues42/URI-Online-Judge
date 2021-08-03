import java.util.Scanner;

public class Problema2708{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int turistas=0, jipes=0;
        boolean continua = true;
        String direcao;
        int passageiros;
        String linha;

        while (continua) {

            linha = input.nextLine();

            if(linha.length() > 6){

                direcao = linha.substring(0, 6);
                passageiros = Integer.parseInt(linha.substring(7));
            
            } else {
                break;
            }

            if(direcao.equals("SALIDA")){
                turistas += passageiros;
                jipes++;
            
            } else if(direcao.equals("VUELTA")){
                turistas -= passageiros;
                jipes--;
            }
             
        }

        System.out.println(turistas);
        System.out.println(jipes);
    }
}