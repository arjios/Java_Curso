
import java.util.Scanner;

public class Exemplo025_03 {

    public static void main(String[] args) {

        String s1, s2, s3;
        int x;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        x = sc.nextInt();
        sc.nextLine();  // Caso não faça o nextLine sozinho uma linha é pulada
        System.out.println("Digite um Texto: ");
        s1 = sc.nextLine();
        System.out.println("Agora outro texto: ");
        s2 = sc.nextLine();
        System.out.println("Por ultimo mais um texto: ");
        s3 = sc.nextLine();

        System.out.println("\nFoi digitado o numero: " + x);
        System.out.println("Foram digitados os seguintes textos:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
