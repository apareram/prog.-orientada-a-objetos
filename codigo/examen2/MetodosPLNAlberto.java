package examen2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class metodosPLNAlberto {

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
            boolean contieneHandle = linea.matches(".*\\s*@\\w+.*") || linea.startsWith("@");
            if (!contieneHandle) {
                textoLimpio.add(linea);
            }
        }
        return textoLimpio;
    }
}
