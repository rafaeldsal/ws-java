import java.util.Locale;
import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		int codPeca1, codPeca2, qtdPeca1, qtdPeca2;
		double valorPeca1, valorPeca2, valorTotal;
		
		codPeca1 = scan.nextInt();
		qtdPeca1 = scan.nextInt();
		valorPeca1 = scan.nextDouble();
		
		codPeca2 = scan.nextInt();
		qtdPeca2 = scan.nextInt();
		valorPeca2 = scan.nextDouble();

		valorTotal = qtdPeca1 * valorPeca1 + qtdPeca2 * valorPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		
		scan.close();
	}

}
