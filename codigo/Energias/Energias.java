package Energias;

import javax.swing.JOptionPane;

public class Energias {
    private double masa;
    private double[] arrCinc;
    private double[] arrPot;
    private double eTotal;

    public Energias(double masa) {
        this.masa = masa;
    }

    private void calcularArrCinc(double v0, double vF, double intVel) {
        int tam = (int) ((vF - v0) / intVel) + 1;
        arrCinc = new double[tam];
        int cont = 0;

        for (double i = v0; i <= vF; i += intVel) {
            arrCinc[cont] = 0.5 * masa * Math.pow(i, 2);
            cont += 1;
        }
    }

    private void calcularArrPot(double h0, double hF, double intAlt) {
        int tam = (int) ((hF - h0) / intAlt) + 1;
        arrPot = new double[tam + 1];
        int cont = 0;

        for (double k = h0; k <= hF; k += intAlt) {
            arrPot[cont] = masa * k * 9.81;
            cont += 1;
            if(cont == tam){
                arrPot[cont] = masa * hF * 9.81;
            }
        }
    }

    public void calcularETotal(double v0, double vF, double intVel, double h0, double hF, double intAlt) {
        calcularArrCinc(v0, vF, intVel);
        calcularArrPot(h0, hF, intAlt);
        eTotal = sumaArr(arrCinc) + sumaArr(arrPot);
    }

    public double getEnergiaCineticaTotal() {
        return sumaArr(arrCinc);
    }

    public double getEnergiaPotencialTotal() {
        return sumaArr(arrPot);
    }

    public double getETotal() {
        return eTotal;
    }

    private double sumaArr(double[] arreglo) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma;
    }

    public void printArrCinc() {
        for (int i = 0; i < arrCinc.length; i++) {
            System.out.println(i+1 + ". " + arrCinc[i]);
        }
    }

    public void printArrPot() {
        for (int i = 0; i < arrPot.length; i++) {
            System.out.println(i+1 + ". " + arrPot[i]);
        }
    }
}