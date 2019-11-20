import java.util.Scanner;

public class Exemplo024_01{

    public static void main(String[] args) {

        String x;
        
        Scanner sc = new Scanner(System.in);
        x = sc.next();
        System.out.println("Foi digitado o valor: " + x);

        sc.close();
    }
}