import java.util.Locale;
import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double valor1 = scan.nextDouble();
		double valor2 = scan.nextDouble();
		
		if (valor1 > valor2) {
			System.out.printf("%.2f MAIOR QUE %.2f", valor1, valor2);
		} else {
			System.out.printf("%.2f MENOR QUE %.2f", valor1, valor2);
		}
		
		scan.close();
	}

}
