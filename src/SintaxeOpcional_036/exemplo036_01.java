import java.util.Locale;
import java.util.Scanner;

public class exemplo036_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorTarifa = 50.00;
        double valorConta = 0.0;
        int minutos = 0;
        minutos = sc.nextInt();
        if(minutos > 100) {
            valorTarifa += ((minutos - 100) * 2);
        }
        System.out.printf("O valor da conta é: %.2f%n", valorTarifa);
        sc.close();
    }
}