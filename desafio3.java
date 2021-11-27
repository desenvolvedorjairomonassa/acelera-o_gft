import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
		float h = Float.parseFloat(sc.next());
		float p = Float.parseFloat(sc.next());    
    float media = h/p;
    System.out.printf("%.2f", media);
    //System.out.println(media);

	}
}
