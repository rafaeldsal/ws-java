import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int numFuncionario = scan.nextInt();
		int horasTrab = scan.nextInt();
		double salarioHora = scan.nextDouble();
		
		double salarioFunc = horasTrab * salarioHora;
		
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salarioFunc);		
		
		scan.close();
	}

}
