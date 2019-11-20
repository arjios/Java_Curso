// Entrada de dados Numerico Double
// import java.util.Locale; para utilizar um locale especifico
import java.util.Locale;
import java.util.Scanner;

public class Exemplo024_03{

    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);  define o locale especifico
        double x;
        
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble(); // Utiliza o Locale da Maquina pt-BR deve ser virgula no lugar do ponto
        System.out.println("Foi digitado o valor: " + x);            // Utiliza o locale inerno
        System.out.printf("Foi digitado o valor: %.2f%n", x);        //  Utiliza o Locale da maquina

        sc.close();
    }
}