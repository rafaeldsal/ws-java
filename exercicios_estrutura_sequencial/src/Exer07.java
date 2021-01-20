import java.util.Locale;
import java.util.Scanner;

// Faça um programa que calcule a area de um quadrado, em seguida mostre o dobro desta área para o usuário;
public class Exer07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double lado = scan.nextDouble();
		double area = lado * lado;
		double dobroArea = area * 2;
		
		System.out.printf("O dobro da área do quadrado é de %.2f", dobroArea);
		
		
		scan.close();

	}

}
