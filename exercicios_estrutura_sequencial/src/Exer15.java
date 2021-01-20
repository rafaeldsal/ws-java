import java.util.Locale;
import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de horas trabalhadas no m�s: ");
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
		System.out.printf("+ Sal�rio Bruto: R$ %.2f%n", salarioBruto);
		System.out.println("- IR (11%): R$ " + descontoIR);
		System.out.println("- INSS (8%): R$ " +  INSS);
		System.out.println("- Sindicato (5%): R$ " + sindicato);
		System.out.println("= Sal�rio Liquido: R$ " + salarioLiquido);		
		System.out.println("===========================================");
		
		scan.close();

	}

}
/* Fa�a um programa que pergunte quanto voc� ganha por hora e o numero de horas trabalhadas no m�s.
 * Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda,
 * 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�
 * a. Sal�rio bruto;
 * b. quanto pagou de INSS;
 * c. quanto pagou ao sindicato;
 * d. o sal�rio liquido;
 * e. calcule os descontos e o sal�rio liquido conforme a tabela abaixo: 
 * + Sal�rio Bruto: R$
 * - IR (11%): R$
 * - INSS (8%): R$
 * - Sindicato (5%): 
 * = Sal�rio Liquido: R$
 */