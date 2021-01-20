import java.util.Locale;
import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
		int horasTrabalhadas = scan.nextInt();
		System.out.print("Informe quanto ganhar por hora: ");
		double valorHora = scan.nextDouble();
		
		double salarioBruto = horasTrabalhadas * valorHora;
		// Descontos
		double descontoIR = salarioBruto * 0.11;
		double INSS = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double salarioLiquido = salarioBruto - (descontoIR + INSS + sindicato);
		
		System.out.println("===========================================");
		System.out.printf("+ Salário Bruto: R$ %.2f%n", salarioBruto);
		System.out.println("- IR (11%): R$ " + descontoIR);
		System.out.println("- INSS (8%): R$ " +  INSS);
		System.out.println("- Sindicato (5%): R$ " + sindicato);
		System.out.println("= Salário Liquido: R$ " + salarioLiquido);		
		System.out.println("===========================================");
		
		scan.close();

	}

}
/* Faça um programa que pergunte quanto você ganha por hora e o numero de horas trabalhadas no mês.
 * Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
 * 8% para o INSS e 5% para o sindicato, faça um programa que nos dê
 * a. Salário bruto;
 * b. quanto pagou de INSS;
 * c. quanto pagou ao sindicato;
 * d. o salário liquido;
 * e. calcule os descontos e o salário liquido conforme a tabela abaixo: 
 * + Salário Bruto: R$
 * - IR (11%): R$
 * - INSS (8%): R$
 * - Sindicato (5%): 
 * = Salário Liquido: R$
 */