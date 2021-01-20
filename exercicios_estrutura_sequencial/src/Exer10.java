import java.util.Locale;
import java.util.Scanner;

// Faça um programa que peça a temp em graus Celsius e transforme para para graus Fahrenheit;
public class Exer10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com a temperatura em Grau Celsius: ");
		double tempC = scan.nextDouble();
		double tempF = (tempC * 9 / 5) + 32;
		
		System.out.printf("%.2f Graus Celsius para Fahrenheit equivale a %.2f Graus", tempC, tempF);
		
		scan.close();

	}

}
