import java.util.Locale;
import java.util.Scanner;

// Faça um programa qye peça a temperatura em graus Fahrenheit, transforme e mostra a temperatura em Celsius C = 5 * ((F-32) / 9)
public class Exer09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double tempF = scan.nextDouble();
		double tempC = 5 * ((tempF - 32) / 9);
		
		System.out.printf("%.2f Graus Fahrenheit para Celsius equivale a %.2f Graus", tempF, tempC);
		
		scan.close();

	}

}
