
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int amin = Integer.parseInt(sc.next());
		int amax = Integer.parseInt(sc.next());
		
		int total=0;
		for(int i=0; i<8;i++) {
		  int altura = Integer.parseInt(sc.next());
		  if (altura>= amin && altura <=amax ) total++;
		}
		System.out.println(total);
			
		
		sc.close();
	}
}
