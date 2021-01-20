import java.util.Locale;
import java.util.Scanner;

// Faça um programa que converta metros para centimetros
public class Exer05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
			
		double metros = scan.nextDouble();
		
		double centimetros = metros * 100;
		
		System.out.printf("%.2f metros equivale a %.2f centimetros.", metros, centimetros);
		scan.close();

	}

}
