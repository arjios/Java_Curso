// entrada com caractere

import java.util.Scanner;

public class Exemplo024_04{

    public static void main(String[] args) {

        char x;
        
        Scanner sc = new Scanner(System.in);
        x = sc.next().charAt(0);
        System.out.println("Foi digitado o valor: " + x);

        sc.close();
    }
}
