package textosP1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.Normalizer;
import java.util.ArrayList;

public class ManipulaTextos {
    
    public ArrayList<String> leerArchivo(String ruta) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<String> archTxt = new ArrayList<String>();

        try {
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                archTxt.add(linea);
            }

            fr.close();
        } catch (Exception e) {
            System.out.println("Excepcion leyendo fichero" + e);
        }

        return archTxt;
    }

    public ArrayList<String> limpiaTextos(ArrayList<String> txtSucio) {
        for (int i = 0; i < txtSucio.size(); i++) {
            String linea = txtSucio.get(i);
            linea = linea.replaceAll("\\d", " ");
            linea = linea.replaceAll("á", "a");
            linea = linea.replaceAll("é", "e");
            linea = linea.replaceAll("í", "i");
            linea = linea.replaceAll("ó", "o");
            linea = linea.replaceAll("ú", "u");
            linea = linea.replaceAll("\\W", " ");
            linea = linea.toLowerCase();
            txtSucio.set(i, linea);
        }
        return txtSucio;
    }

    public String quitarPalabra(String frase, String palabra) {
        return frase.replaceAll("\\b" + palabra + "\\b", "");
    }

    public String quitarPalabrasArchivo(ArrayList<String> palabras, String frase){
        for (int i = 0; i < palabras.size(); i++) {
            frase = frase.replaceAll("\\b" + palabras.get(i) + "\\b", "");
        }
        return frase;
    }

    public String quitarPCortas(String texto) {
        String[] palabras = texto.split(" ");
        String textoLimpio = "";
    
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > 3) {
                textoLimpio += palabras[i] + " ";
            }
        }
    
        return textoLimpio.trim();
    }
}