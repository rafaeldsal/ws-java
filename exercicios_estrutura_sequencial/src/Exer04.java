import java.util.Locale;
import java.util.Scanner;

// Fa�a um programa que pe�a 4 notas bimestrais e mostre a m�dia
public class Exer04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("A m�dia � de %.2f", media);
		
		scan.close();

	}

}
