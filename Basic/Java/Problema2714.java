import java.util.Scanner;

public class Problema2714{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int consultas = input.nextInt();
        String var = input.nextLine();

        for(int i=0; i < consultas; i++){

            String ra = input.nextLine();
            String senha = "";
            boolean contar = false;

            if(ra.length() == 20 && ra.charAt(0) == 'R' && ra.charAt(1) == 'A'){

                if(ra.charAt(2) == '0'){

                    for(int j=3; j < ra.length(); j++){

                        if(ra.charAt(j) != '0' || contar){
                            contar = true;
                            senha += ra.charAt(j);
                        }
                    }

                } else {
                    
                   for(int j=2; j < ra.length(); j++){

                        senha += ra.charAt(j);
                    }
                }

                System.out.println(senha);

            } else {
                System.out.println("INVALID DATA");
            }

        }

    }
}