package CalcularEnergias;

import java.util.ArrayList;

public class CalcularEnergias {
    private double masa;

    public CalcularEnergias(double masa) {
        this.masa = masa;
    }

    public ArrayList<Double> energiaCinetica(double limInferior, double limSuperior, double incrementos) {
        ArrayList<Double> eC = new ArrayList<Double>();

        for (double i = limInferior; i <= limSuperior; i += incrementos) {
            eC.add(0.5 * masa * Math.pow(i, 2));
        }
        return eC;
    }
}
