
import java.util.Scanner;

public class Exemplo024_05 {

    public static void main(String[] args) {

        String x;
        int y;
        double z;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma String: ");
        x = sc.next();
        System.out.println("Agora um Inteiro: ");
        y = sc.nextInt();
        System.out.println("Por ultimo um Double: ");
        z = sc.nextDouble();

        System.out.println("\nFoi digitado o valor da String: " + x + "\n");
        System.out.println("O valor do Inteiro é: " + y + "\n");
        System.out.printf("E o Double: %.3f ", z);

        sc.close();
    }
}
