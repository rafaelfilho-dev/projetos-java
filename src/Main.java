import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int inicio, fim, duracao;

        inicio = sc.nextInt();
        fim = sc.nextInt();

        if (inicio < fim){
            duracao = fim - inicio;
        }
        else {
            duracao = 24 - inicio + fim;
        }
        System.out.println("O JOGO DUROU "+duracao+" HORAS");

        sc.close();
    }
}