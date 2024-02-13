package OperacionesNumericas;
import javax.swing.JOptionPane;

public class PurbaOperacionesNumericas {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Ingrese el primer valor:");
        double a = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Ingrese el segundo valor:");
        double b = Double.parseDouble(input2);

        String input3 = JOptionPane.showInputDialog("Ingrese el tercer valor:");
        double c = Double.parseDouble(input3);

        OperacionesNumericas operaciones = new OperacionesNumericas(a, b, c);
        String mensaje = "Suma: " + operaciones.suma() +
        "\nResta: " + operaciones.resta() +
        "\nMultiplicacion: " + operaciones.mult() +
        "\nDivisión: " + operaciones.div() +
        "\nPotnecia: " + operaciones.pot();
        JOptionPane.showMessageDialog(null, mensaje);

    OperacionesNumericas operaciones2 = new OperacionesNumericas();
    String mensaje2 = "Suma: " + operaciones2.suma(a, b, c) +
        "\nResta: " + operaciones2.resta(a, b, c) +
        "\nMultiplicacion: " + operaciones2.mult(a, b, c) +
        "\nDivisión: " + operaciones2.div(a, b) +
        "\nPotnecia: " + operaciones2.pot(a, b);
        JOptionPane.showMessageDialog(null, mensaje2);

    }
}
