import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, trapezio, retangulo, circulo, quadrado;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = A * C / 2;
        trapezio = (A + B) * C / 2;
        retangulo = A * B;
        circulo = (Math.pow(C,2)) * 3.14159;
        quadrado = B*B;

        System.out.printf("AREA DO TRIANGULO = %.3f%n", triangulo);
        System.out.printf("AREA DO CIRCULO = %.3f%n", circulo);
        System.out.printf("AREA DO TRAPEZIO = %.3f%n", trapezio);
        System.out.printf("AREA DO QUADRADO = %.3f%n", quadrado);
        System.out.printf("AREA DO RETANGULO = %.3f%n", retangulo);


        sc.close();
    }
}