import java.util.Scanner;

// Faça um programa que peça dois números e imprima o maior deles;
public class Exer01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int valor1 = scan.nextInt();
		int valor2 = scan.nextInt();
		
		if (valor1 > valor2) {
			System.out.printf("%d é maior que %d%n", valor1, valor2);
		} else {
			System.out.printf("%d é maior que %d%n", valor2, valor1);
		}
		
		scan.close();

	}

}
