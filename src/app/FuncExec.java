
import java.util.Locale;
import java.util.Scanner;
import entidades.Funcionario;

public class FuncExec {



    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();
        func.setNome(sc.next());
        func.setSalario(sc.nextDouble());
        func.setImposto(1000.00);
        System.out.println("Nome: " + func.getNome());
        System.out.printf("Salario %2f", func.getSalario());

        sc.close();

    }
}