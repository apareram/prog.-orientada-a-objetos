package examen2;

import java.util.ArrayList;

public class PruebaMetodosAlberto {

public static void main(String[] args) {
	    
        String ruta2 = ("/Users/aparera/Desktop/_/ibero/10th/prog. orientada a objetos/codigo/e2/ComXochlink2");
        // se crea el objeto
        MetodosPLNAlberto prueba2 = new MetodosPLNAlberto();
        // se crea el arrayList donse se guardara el contenido del cvs
        ArrayList<String> texto2 = prueba2.recibeRutaAlberto(ruta2);
        System.out.println("El tamaño del ArrayList es: " + texto2.size());
        //prueba2.imprimirArrayList(texto2);
        // se quitan lineas que empiecen con "@"
        texto2 = prueba2.quitaUsuarioAlberto(texto2);
        System.out.println("El tamaño del ArrayList es: " + texto2.size());
        //prueba2.imprimirArrayList(texto2);
        // se quitan lineas que empiecen con "hace x meses"
        texto2 = prueba2.quitaFraseAlberto(texto2);
        System.out.println("El tamaño del ArrayList es: " + texto2.size());
        //prueba2.imprimirArrayList(texto2);
        // se quitan palabras de un solo caracter
        texto2 = prueba2.quitaCAlberto(texto2);
        System.out.println("El tamaño del ArrayList es: " + texto2.size());
        prueba2.imprimirArrayList(texto2);
    }
}