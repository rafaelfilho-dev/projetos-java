import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salary, amount;
        salary = sc.nextDouble();

        if(salary <= 2000.00){
            System.out.println("ISENTO");
        }

        else if (salary <= 3000.00){
            salary -= 2000;
            amount = salary * 0.08;
            System.out.printf("R$%.2f",amount);
        }

        else if (salary <= 4500.00){
            salary -= 3000;
            amount = (salary * 0.18) + (1000 * 0.08);
            System.out.printf("R$%.2f",amount);
        }

        else {
            salary -= 4500;
            amount = (salary * 0.28) + (1000 * 0.08) + (1500 * 0.18);
            System.out.printf("R$%.2f",amount);
        }
        sc.close();
    }
}