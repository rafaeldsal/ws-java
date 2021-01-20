import java.util.Scanner;

//Faça um Programa que leia três números e mostre o maior deles.
public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valor1 = scan.nextInt();
		int valor2 = scan.nextInt();
		int valor3 = scan.nextInt();
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println(valor1 + " é o maior");
		} else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println(valor2 + " é o maior");
		} else {
			System.out.println(valor3 + " é o maior");
		}
		
		scan.close();
	}

}
