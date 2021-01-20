import java.util.Locale;
import java.util.Scanner;

// Faça um programa que pergunte quanto voce ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salario no referido mês
public class Exer08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Entre com o valor ganho por hora trabalhada: ");
		double valorHora = scan.nextDouble();
		System.out.println("Entre com o número de horas trabalhadas: ");
		int horasTrabalhadas = scan.nextInt();
		
		double salarioMes = (valorHora * horasTrabalhadas) * 7 * 4;
		
		System.out.printf("No referido mês seu salário é de R$ %.2f", salarioMes);
		
		scan.close();

	}

}
