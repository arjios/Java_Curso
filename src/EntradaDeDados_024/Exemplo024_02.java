// Entrada de dados Numerico Inteiro

import java.util.Scanner;

public class Exemplo024_02{

    public static void main(String[] args) {

        int x;
        
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("Foi digitado o valor: " + x);

        sc.close();
    }
}