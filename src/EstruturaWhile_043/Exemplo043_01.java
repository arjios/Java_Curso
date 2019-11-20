import java.util.Scanner;

public class Exemplo043_01 {

    public static void main(String[] args) {

        int soma = 0;
        int x=0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        while(x != 0) {
            soma += x;
            x = sc.nextInt();
        }
        System.out.println("Soma: " + soma);
        sc.close();
    }
}