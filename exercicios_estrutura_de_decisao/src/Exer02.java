import java.util.Scanner;

// Faça um programa que peça um valor e mostre na tela se o valor e positivo ou negativo
public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valor = scan.nextInt();
		
		if(valor > 0) {
			System.out.println("POSITIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		scan.close();

	}

}
