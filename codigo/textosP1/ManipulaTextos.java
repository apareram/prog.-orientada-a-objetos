package textosP1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
}