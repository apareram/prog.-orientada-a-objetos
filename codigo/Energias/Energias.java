package Energias;

public class Energias {
    private double masa;

    public Energias(double masa) {
        this.masa = masa;
    }

    public double[] arrCinc(double v0, double vF, double intVel) {
        int tam = (int) ((vF - v0) / intVel) + 1;
        double[] arrCinc = new double[tam];
        int cont = 0;

        for (double i = v0; i <= vF; i += intVel) {
            arrCinc[cont] = 0.5 * masa * Math.pow(i, 2);
            cont += 1;
        }
        return arrCinc;
    }

    public double[] arrPot(double h0, double hF, double intAlt) {
        int tam = (int) ((hF - h0) / intAlt) + 1;
        double[] arrPot = new double[tam];
        int cont = 0;

        for (double k = h0; k <= hF; k += intAlt) {
            arrPot[cont] = masa * k * 9.81;
            cont += 1;
        }
        return arrPot;
    }

    public double eToto(double[] arrCinc, double[] arrPot) {
        return sumaArr(arrCinc) + sumaArr(arrPot);
    }

    public double sumaArr(double[] arreglo) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma;
    }

    public void printArr(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}