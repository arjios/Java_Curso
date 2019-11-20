import java.util.Locale;

public class Exercicio_001 {

    public static void main(String args[]){
        String produto1 = "Computer";
        String produto2 = "Office Desk";

        int age = 30;
        int code = 5690;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products: \n");
        System.out.printf("%s, which price is $ %.2f \n", produto1, price1);
        System.out.printf("%s, which price is $ %.2f \n", produto2, price2);
        System.out.println("\n\nRecord is: " + age + " years old, code " + code + " and gender is " + gender);
        System.out.printf("Measure with eigth decimal places: %.8f \n", measure);
        System.out.printf("Rounded (with three decimal places): %.3f \n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point %.3f \n", measure);
        
    }
}