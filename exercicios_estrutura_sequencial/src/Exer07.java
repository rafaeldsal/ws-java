import java.util.Locale;
import java.util.Scanner;

// Fa�a um programa que calcule a area de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio;
public class Exer07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double lado = scan.nextDouble();
		double area = lado * lado;
		double dobroArea = area * 2;
		
		System.out.printf("O dobro da �rea do quadrado � de %.2f", dobroArea);
		
		
		scan.close();

	}

}
