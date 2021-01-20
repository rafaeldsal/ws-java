import java.util.Locale;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double largura = scan.nextDouble();
		double comprimento = scan.nextDouble();
		double precoM = scan.nextDouble();

		double area = largura * comprimento;
		double preco = area * precoM;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		scan.close();
	}
}
