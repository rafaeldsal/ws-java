import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char letra = scan.next().charAt(0);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
			letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
			System.out.println("VOGAL");
		} else {
			System.out.println("CONSOANTE");
		}
		
		scan.close();
	}

}
