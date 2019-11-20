
import java.util.Scanner;

public class Exemplo025_02 {

    public static void main(String[] args) {

        String s1, s2, s3;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Texto: ");
        s1 = sc.nextLine();
        System.out.println("Agora outro texto: ");
        s2 = sc.nextLine();
        System.out.println("Por ultimo mais um texto: ");
        s3 = sc.nextLine();

        System.out.println("\n\nForam digitados os seguintes textos:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
