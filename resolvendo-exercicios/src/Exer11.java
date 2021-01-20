import java.util.Locale;
import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double total;
		int opcao = scan.nextInt();
		int qtd = scan.nextInt();
		
		if (opcao == 1) {
			total = qtd * 4.0;
			System.out.printf("Total: R$ %.2f", total);
		} else if (opcao == 2) {
			total = qtd * 4.5;
			System.out.printf("Total: R$ %.2f", total);
		} else if (opcao == 3) {
			total = qtd * 5.0;
			System.out.printf("Total: R$ %.2f", total);
		} else if (opcao == 4) {
			total = qtd * 2.0;
			System.out.printf("Total: R$ %.2f", total);
		} else if (opcao == 5){
			total = qtd * 1.5;
			System.out.printf("Total: R$ %.2f", total);
		} else {
			System.out.println("Escolha inválida!");
		}
		
		scan.close();

	}

}
