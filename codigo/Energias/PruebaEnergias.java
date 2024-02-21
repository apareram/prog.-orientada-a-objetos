package Energias;
import javax.swing.JOptionPane;
public class PruebaEnergias {
    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog("Ingrese el valor inicial de la velocidad:");
        double v0 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Ingrese el valor final de la velocidad:");
        double vF = Double.parseDouble(input2);

        String input3 = JOptionPane.showInputDialog("Ingrese el intervalo de la velocidad:");
        double intVel = Double.parseDouble(input3);

        String input4 = JOptionPane.showInputDialog("Ingrese el valor inicial de la altura:");
        double h0 = Double.parseDouble(input4);

        String input5 = JOptionPane.showInputDialog("Ingrese el valor final de la altura:");
        double hF = Double.parseDouble(input5);

        String input6 = JOptionPane.showInputDialog("Ingrese el intervalo de la altura:");
        double intAlt = Double.parseDouble(input6);

        String input7 = JOptionPane.showInputDialog("Ingrese la masa del objeto:");
        double masa = Double.parseDouble(input7);

        Energias energy = new Energias(masa);

        double[] arrCinc = energy.arrCinc(v0, vF, intVel);
        double[] arrPot = energy.arrPot(h0, hF, intAlt);
        double eTotal = energy.eToto(arrCinc, arrPot);

        energy.printArr(arrCinc);
        energy.printArr(arrPot);
        
        String mensaje = "Energía Cinética: " + energy.sumaArr(arrCinc) +
                         "\nEnergía Potencial: " + energy.sumaArr(arrPot) +
                         "\nEnergía Total: " + eTotal;
        JOptionPane.showMessageDialog(null, mensaje);

    }
}