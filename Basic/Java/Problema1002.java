import java.io.IOException;
import java.util.Scanner;

/*

Área do Círculo

A fórmula para calcular a área de uma circunferência é: 
area = π . raio2. Considerando para este problema que 
π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado
 e multiplicando por π.

Entrada
A entrada contém um valor de ponto flutuante (dupla precisão),
 no caso, a variável raio.

Saída
Apresentar a mensagem "A=" seguido pelo valor da variável area, 
onforme exemplo abaixo, com 4 casas após o ponto decimal. 
Utilize variáveis de dupla precisão (double). Como todos 
os problemas, não esqueça de imprimir o fim de linha após o 
resultado, caso contrário, você receberá "Presentation Error".

*/

public class Problema1002 {
 
    	public static void main(String[] args) throws IOException {
 
	Scanner entrada = new Scanner(System.in); 	
	
	double raio, quadrado, n, A;
	
	n = 3.14159;
	raio = entrada.nextDouble();
	quadrado = raio * raio; 	

	A = quadrado * n;
    	
	System.out.print("A=");
	System.out.printf("%.4f\n", A);
 
    }
 
}