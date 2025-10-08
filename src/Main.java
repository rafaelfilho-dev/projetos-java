import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault((Locale.US));
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int a = 1; a <= N; a++){
            System.out.println(a + " " + Math.pow(a, 2) + " " + Math.pow(a,3));
        }

        sc.close();
    }
}