import java.util.Scanner;

//Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valor1 = scan.nextInt();
		int valor2 = scan.nextInt();
		int valor3 = scan.nextInt();
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println(valor1 + " � o maior");
		} else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println(valor2 + " � o maior");
		} else {
			System.out.println(valor3 + " � o maior");
		}
		
		scan.close();
	}

}
