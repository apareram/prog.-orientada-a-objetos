package textosP1;

import java.util.ArrayList;

public class PruebaManipulaTextos {
    public static void main(String[] args) {
        /* 
        String ruta = ("/Users/aparera/Desktop/_/ibero/10th/prog. orientada a objetos/codigo/textosP1/TextoALimpiarM.csv");
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

        String frase3 = "Hola a mis compañeros de programacion orientada a objetos";
        System.out.println("\nFrase antes de quitar palabras cortas: " + frase3 + "\n");
        frase3 = leer.quitarPCortas(frase3);
        System.out.println("Frase después de quitar palabras cortas: " + frase3 + "\n");
        */

        // prueba final de todas las etapas
        // rutas de los archivos a quitar
        String ruta2 = ("/Users/aparera/Desktop/_/ibero/10th/prog. orientada a objetos/codigo/textosP1/palabrasAquitar.txt");
        String ruta3 = ("/Users/aparera/Desktop/_/ibero/10th/prog. orientada a objetos/codigo/textosP1/pruebaCFinal.csv");
        // se crea el objeto
        ManipulaTextos prueba = new ManipulaTextos();
        // se crea el arrayList donse se guardara el contenido del cvs
        ArrayList<String> textoPrueba = prueba.leerArchivo(ruta3);
        // se limpia el texto 
        textoPrueba = prueba.limpiaTextos(textoPrueba);
        // se crea el arrayList de las palabras a quitar y se imprimen para vizalizarlas
        ArrayList<String> palabrasQuit = prueba.leerArchivo(ruta2);
        // se quitan las palabras selccionadas y se imprime el texto sin ellas
        textoPrueba = prueba.quitarPalabrasArchivoAL(palabrasQuit, textoPrueba);
        // se quitan palabras cortas del texto
        textoPrueba = prueba.quitarPCortasArrayList(textoPrueba);
        // se imprime el texto final limpio
        System.out.println("\nContenido del archivo de texto limpio: ");
        for (int i = 0; i < textoPrueba.size(); i++) {
            System.out.println((i + 1) + ". " + textoPrueba.get(i));
        }
    }
}