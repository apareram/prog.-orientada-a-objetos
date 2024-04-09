package examen2;

public class PruebaMetodosAlberto {
    public static void main(String[] args) {
    
        String ruta = ("/Users/aparera/Desktop/_/ibero/10th/prog. orientada a objetos/codigo/examen2/prueba.txt");
        // se crea el objeto
        MetodosPLNAlberto prueba = new metodosPLNAlberto();
        // se crea el arrayList donse se guardara el contenido del cvs
        ArrayList<String> texto = prueba.leerArchivo(ruta);
        // se limpia el texto 
        texto = prueba.quitaUsuarioAlberto(texto);
        prueba.imprimirArrayList(texto);
    }
}
