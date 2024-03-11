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

    public ArrayList<String> limpiaTextos(ArrayList<String> textoSucio) {
        ArrayList<String> textoLimpio = new ArrayList<>();
    	for(String elemento : textoSucio) {
    		//Quita dígitos
    		String linea = elemento.replaceAll("\\d", " ");
    		//Quita caracteres
    		linea = linea.replaceAll("á", "a");
    		linea = linea.replaceAll("é", "e");
    		linea = linea.replaceAll("í", "i");
    		linea = linea.replaceAll("ó", "o");
    		linea = linea.replaceAll("ú", "u");
    		linea = linea.replaceAll("\\W", " ");
    		//Todo a minusculas
    		linea = linea.toLowerCase();
    		textoLimpio.add(linea);
    	}
		return textoLimpio;
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

    public ArrayList<String> quitarPCortasArrayList(ArrayList<String> texto) {
        ArrayList<String> textoLimpio = new ArrayList<>();
        for (int i = 0; i < texto.size(); i++) {
            String linea = texto.get(i);
            String[] palabras = linea.split(" ");
            String lineaLimpia = "";
            for (int j = 0; j < palabras.length; j++) {
                if (palabras[j].length() > 3) {
                    lineaLimpia += palabras[j] + " ";
                }
            }
            textoLimpio.add(lineaLimpia.trim());
        }
        return textoLimpio;
    }

    public ArrayList<String> quitarPalabrasArchivoAL(ArrayList<String> aQuitar, ArrayList<String> frases) {
    	ArrayList<String> hold = new ArrayList<String>();
    	String mientras = null;
    	for(int i = 0; i < frases.size(); i++) {
			mientras = frases.get(i);
    		for(int j = 0; j < aQuitar.size(); j++) {
            	mientras = mientras.replaceAll("\\b" + aQuitar.get(j) + "\\b", "");
    		}
    		hold.add(mientras);
    	}
    	return hold;
    }
}