package CalcularEnergias;

import java.util.ArrayList;

public class PruebaEnergias {
    public static void main(String[] args) {
        /*
         * String input1 =
         * JOptionPane.showInputDialog("Ingrese el valor inicial de la velocidad:");
         * double limInferior = Double.parseDouble(input1);
         * 
         * String input2 =
         * JOptionPane.showInputDialog("Ingrese el valor final de la velocidad:");
         * double limSuperior = Double.parseDouble(input2);
         * 
         * String input3 =
         * JOptionPane.showInputDialog("Ingrese el intervalo de la velocidad:");
         * double incrementos = Double.parseDouble(input3);
         * 
         * String input4 = JOptionPane.showInputDialog("Ingrese la masa del objeto:");
         * double masa = Double.parseDouble(input4);
         */
        String ruta = ("/Users/aparera/Desktop/_/ibero/10th/prog. orientada a objetos/codigo/CalcularEnergias/archivo.txt");

        CalcularEnergias calcular = new CalcularEnergias(3.2);

        ArrayList<Double> eCinTxt = calcular.leerArchivoTxt(ruta);

        ArrayList<Double> eCin = calcular.energiaCinetica(eCinTxt.get(0), eCinTxt.get(1), eCinTxt.get(2));

        System.out.println("\nContenido del archivo de texto: ");
        for (int i = 0; i < eCinTxt.size(); i++) {
            System.out.println((i + 1) + ". " + eCinTxt.get(i));
        }

        System.out.println("\nEnergías cinéticas: ");
        for (int i = 0; i < eCin.size(); i++) {
            System.out.println((i + 1) + ". " + eCin.get(i));
        }
    }
}