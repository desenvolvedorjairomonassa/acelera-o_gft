import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int k = Integer.parseInt(leitor.next());
        int l = Integer.parseInt(leitor.next());
        if ((k<9 && l>=9) || (k>=9 && l<9) ) System.out.println("final");
        else if ((k<3 && l<3 ) || (k>=3 && k<5 && l>=3 && l<5)
        || (k>=5 && k<7 && l>=5 && l<7) || (k>=7 && k<9 && l>=7 && l<9)
        || (k>=9 && k<11 && l>=9 && l<11) || (k>=11 && k<13 && l>=11 && l<13)
        || (k>=13 && k<15 && l>=13 && l<15) || (k>14 && l>14)  ) System.out.println("oitavas");
        else if ((k<5 && l<5 ) || (k>=5 && k<9 && l>=5 && l<9  ) ||
        (k>=9 && k<13 && l>=9 && l<13  )|| (k>=13 && l>=13)  ) System.out.println("quartas");
        else if ((k<9 && l<9 ) || (k>=9 && l >= 9)) System.out.println("semifinal");
    }

}
