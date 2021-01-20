import java.util.Locale;
import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			int valor1 = input.nextInt();
			int valor2 = input.nextInt();
			
			if (valor2 == 0) {
				System.out.println("Divisão Impossível");
			} else {
				double div = (double) valor1 / valor2;
				System.out.printf("%.1f%n", div);
			}
		}
		
		input.close();

	}

}
