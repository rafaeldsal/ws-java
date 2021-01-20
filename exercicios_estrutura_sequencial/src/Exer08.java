import java.util.Locale;
import java.util.Scanner;

// Fa�a um programa que pergunte quanto voce ganha por hora e o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu salario no referido m�s
public class Exer08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Entre com o valor ganho por hora trabalhada: ");
		double valorHora = scan.nextDouble();
		System.out.println("Entre com o n�mero de horas trabalhadas: ");
		int horasTrabalhadas = scan.nextInt();
		
		double salarioMes = (valorHora * horasTrabalhadas) * 7 * 4;
		
		System.out.printf("No referido m�s seu sal�rio � de R$ %.2f", salarioMes);
		
		scan.close();

	}

}
