import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int valor = input.nextInt();
		
		int horas = valor / 3600;
		int minutos = (valor - (horas * 3600)) / 60;
		int segundos = valor % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);	
		
		
		input.close();
	}

}
