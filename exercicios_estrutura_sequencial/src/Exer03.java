import java.util.Scanner;

//Fa�a um programa que pe�a dois n�mero e imprima a soma
public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valor1 = scan.nextInt();
		int valor2 = scan.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.printf("A soma entre %d + %d � %d%n", valor1, valor2, soma);
		
		scan.close();

	}

}
