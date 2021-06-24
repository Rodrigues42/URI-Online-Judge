import java.util.Scanner;

/*
Tipos de Triângulos

Leia 3 valores de ponto flutuante A, B e C e ordene-os em 
ordem decrescente, de modo que o lado A representa o maior 
dos 3 lados. A seguir, determine o tipo de triângulo que estes 
três lados formam, com base nos seguintes casos, sempre 
escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

Entrada
A entrada contem três valores de ponto flutuante de dupla
 precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na 
entrada.
*/

public class Problema1045{
	public static void main(String args[]){

		Scanner teclado = new Scanner(System.in);

		double a, b, c, maior, menor, inter;

		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();

		if (a > b && a > c){
			maior = a;
			if (b > c){
				inter = b;
				menor = c;
			} else {
				inter = c;
				menor = b;
			}
		} else if (b > a && b > c){
			maior = b;
			if (a > c){
				inter = a;
				menor = c;		
			} else {
				inter = c;
				menor = a;
			}
		} else {
			maior = c;
			if (b > a){
				inter = b;
				menor = a;		
			} else {
				inter = a;
				menor = b;
			}
		}

		if (maior >= inter + menor){
			System.out.println("NAO FORMA TRIANGULO");

		} else {

			if (maior * maior == inter * inter + menor * menor){
			System.out.println("TRIANGULO RETANGULO");
		
			} if (maior * maior > inter * inter + menor * menor){
			System.out.println("TRIANGULO OBTUSANGULO");

			} if (maior * maior < inter * inter + menor * menor){
			System.out.println("TRIANGULO ACUTANGULO");

			} if (maior == inter && maior == menor){
			System.out.println("TRIANGULO EQUILATERO");
		
			} if (maior == inter && maior != menor || maior == menor && maior != inter || menor == inter && menor != maior) {
			System.out.println("TRIANGULO ISOSCELES");
			}
		}
	}
}