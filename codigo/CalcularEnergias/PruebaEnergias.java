package CalcularEnergias;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PruebaEnergias {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Ingrese el valor inicial de la velocidad:");
        double limInferior = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Ingrese el valor final de la velocidad:");
        double limSuperior = Double.parseDouble(input2);

        String input3 = JOptionPane.showInputDialog("Ingrese el intervalo de la velocidad:");
        double incrementos = Double.parseDouble(input3);

        String input4 = JOptionPane.showInputDialog("Ingrese la masa del objeto:");
        double masa = Double.parseDouble(input4);

        CalcularEnergias calcular = new CalcularEnergias(masa); 

        ArrayList<Double> eCin = calcular.energiaCinetica(limInferior, limSuperior, incrementos);

        System.out.println("Energías cinéticas: ");
        
        for (int i = 0; i < eCin.size(); i++) {
            System.out.println((i + 1) + ". " + eCin.get(i));
        }
    } 
}