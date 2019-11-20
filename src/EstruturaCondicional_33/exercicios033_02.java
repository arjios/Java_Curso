import java.util.Scanner;

public class exercicios033_02 {

    public static void main(String[] args) {
        int hora = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora: ");
        hora = sc.nextInt();
        if(hora < 12) {
            System.out.println("Bom dia!");
        } 
        else { 
            if(hora < 18) {
                System.out.println("Boa tarde!");
            }
            else {
                System.out.println("Boa noite!");
            }
        }
        sc.close();
    }
}