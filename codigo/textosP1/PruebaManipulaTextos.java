package textosP1;

import java.util.ArrayList;

public class PruebaManipulaTextos {
    public static void main(String[] args) {
        String ruta = ("/Users/aparera/Desktop/_/ibero/10th/prog. orientada a objetos/codigo/textosP1/TextoALimpiarM.csv");
        String ruta2 = ("/Users/aparera/Desktop/_/ibero/10th/prog. orientada a objetos/codigo/textosP1/palabrasAquitar.txt");
        String frase = ("Hola a mis compañeros de programación orientada a objetos");
        String frase2 = ("Hola a mis compañeros de programación orientada a objetos");
        String palabra = ("Hola");

        ManipulaTextos leer = new ManipulaTextos();

        ArrayList<String> archivo = leer.leerArchivo(ruta);

        System.out.println("\nContenido del archivo de texto: ");
        for (int i = 0; i < archivo.size(); i++) {
            System.out.println((i + 1) + ". " + archivo.get(i));
        }

        ArrayList<String> archivoLimpio = leer.leerArchivo(ruta);
        leer.limpiaTextos(archivoLimpio);
        System.out.println("\nContenido del archivo de texto limpio: ");
        for (int i = 0; i < archivoLimpio.size(); i++) {
            System.out.println((i + 1) + ". " + archivoLimpio.get(i));
        }

        System.out.println("\nFrase intacta: " + frase + "\n");
        frase = leer.quitarPalabra(frase, palabra);
        System.out.println("\nFrase modificada: " + frase + "\n");

        ArrayList<String> palabrasQuit = leer.leerArchivo(ruta2);
        System.out.println("\nFrase intacta: " + frase2 + "\n");
        System.out.println("\nPalabras a quitar: ");
        for (int i = 0; i < palabrasQuit.size(); i++) {
            System.out.println((i + 1) + ". " + palabrasQuit.get(i));
        }
        frase2 = leer.quitarPalabrasArchivo(palabrasQuit, frase2);
        System.out.println("\nFrase modificada: " + frase2 + "\n");
    }
}