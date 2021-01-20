import java.util.Scanner;

// Faça um programa que peça um número e então mostre a mensagem "O número informado foi: ";
public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valor = scan.nextInt();
		
		System.out.println("O número informado foi " + valor);
		
		scan.close();

	}

}
