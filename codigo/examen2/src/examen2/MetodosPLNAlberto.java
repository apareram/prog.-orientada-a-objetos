package examen2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class MetodosPLNAlberto {
	public ArrayList<String> recibeRutaAlberto(String ruta) {
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

    public void imprimirArrayList(ArrayList<String> texto) {
        for (int i = 0; i < texto.size(); i++) {
            System.out.println(texto.get(i));
        }
    }

    
    public ArrayList<String> quitaUsuarioAlberto(ArrayList<String> texto) {
        ArrayList<String> textoLimpio = new ArrayList<>();
        for (String linea : texto) {
            boolean contieneHandle = /*linea.matches(".*\\s*@\\w+.*") ||*/ linea.startsWith("@");
            if (!contieneHandle) {
                textoLimpio.add(linea);
            }
        }
        return textoLimpio;
    }
    
    public ArrayList<String> quitaFraseAlberto(ArrayList<String> texto) {
        ArrayList<String> textoLimpio = new ArrayList<>();
        for (String linea : texto) {
            boolean comienzaConFrase = linea.matches("hace \\d+ meses.*");
            if (!comienzaConFrase) {
                textoLimpio.add(linea);
            }
        }
        return textoLimpio;
    }
    
    public ArrayList<String> quitaCAlberto(ArrayList<String> texto) {
        ArrayList<String> textoLimpio = new ArrayList<>();
        for (int i = 0; i < texto.size(); i++) {
            String linea = texto.get(i);
            String[] palabras = linea.split(" ");
            String lineaLimpia = "";
            for (int j = 0; j < palabras.length; j++) {
                if (palabras[j].length() > 2) {
                    lineaLimpia += palabras[j] + " ";
                }
            }
            textoLimpio.add(lineaLimpia.trim());
        }
        return textoLimpio;
    }
}
