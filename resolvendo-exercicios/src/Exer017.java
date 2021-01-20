import java.util.Scanner;

public class Exer017 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int horaInicial = scan.nextInt();
		int horaFinal = scan.nextInt();
		int duracao = 0;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		scan.close();
	}

}
