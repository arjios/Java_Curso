
package entidades;

import java.util.Scanner;

public class Retangulo {

    public double altura;
    public double largura;

    public double areaRetangulo() {
        return altura * largura;
    }

    public double perimetroRetangulo() {
        return 2 * (altura + largura);
    }

    public double diagonalRetangulo() {
        return Math.sqrt(((altura * altura) + (largura * largura)));
    }

}