import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		char x;
		x = scan.next().charAt(0);
		
		System.out.println("Você digitou: " + x);
		
		scan.close();

	}

}
