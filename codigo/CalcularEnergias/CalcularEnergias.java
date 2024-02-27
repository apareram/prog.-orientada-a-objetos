package CalcularEnergias;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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

    public ArrayList<Double> leerArchivoTxt(String ruta) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<Double> ecTxt = new ArrayList<Double>();

        try {
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                ecTxt.add(Double.parseDouble(linea));
            }

            fr.close();
        } catch (Exception e) {
            System.out.println("Excepcion leyendo fichero" + e);
        }

        return ecTxt;
    }
}
