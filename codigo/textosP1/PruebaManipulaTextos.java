package textosP1;

import java.util.ArrayList;

public class PruebaManipulaTextos {
    public static void main(String[] args) {
        String ruta = ("/Users/aparera/Desktop/_/ibero/10th/prog. orientada a objetos/codigo/textosP1/TextoALimpiarM.csv");

        ManipulaTextos leer = new ManipulaTextos();

        ArrayList<String> archivo = leer.leerArchivo(ruta);

        System.out.println("\nContenido del archivo de texto: ");
        for (int i = 0; i < archivo.size(); i++) {
            System.out.println((i + 1) + ". " + archivo.get(i));
        }
    }
}