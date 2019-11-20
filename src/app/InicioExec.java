

import java.util.Scanner;

import java.util.Locale;

import entidades.Retangulo;

public class InicioExec {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo rt = new Retangulo();
        double altura, largura;
        System.out.println("Digite a altura: ");
        rt.altura = sc.nextDouble();
        System.out.println("Digite a largura");
        rt.largura = sc.nextDouble();
        System.out.printf("Area = %.2f \n", rt.areaRetangulo());
        System.out.printf("Perimetro = %.2f \n", rt.perimetroRetangulo());
        System.out.printf("Diagonal = %.2f \n", rt.diagonalRetangulo());
        sc.close();
    }
}