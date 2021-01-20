import java.util.Locale;
import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		double nota1 = 0.0, nota2 = 0.0, nota3 = 0.0;
		double media = 0;
		
		for (int i = 0; i < N; i++) {
			
			nota1 = scan.nextDouble();
			nota2 = scan.nextDouble();
			nota3 = scan.nextDouble();
				
			media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
			System.out.printf("%.1f%n", media);
		}		
		scan.close();
	}

}
