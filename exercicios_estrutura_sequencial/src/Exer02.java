import java.util.Scanner;

// Fa�a um programa que pe�a um n�mero e ent�o mostre a mensagem "O n�mero informado foi: ";
public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valor = scan.nextInt();
		
		System.out.println("O n�mero informado foi " + valor);
		
		scan.close();

	}

}
