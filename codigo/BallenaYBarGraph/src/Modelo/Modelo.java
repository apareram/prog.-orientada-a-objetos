package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Modelo {
	
    public ArrayList<String> cargarLineasDeTexto(String rutaArchivo) {
        ArrayList<String> lineasTexto = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineasTexto.add(linea);
            }
            System.out.println("Archivo de texto cargado exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo de texto: " + e.getMessage());
        }
        return lineasTexto;
    }

    public ArrayList<String> cargarPalabrasABuscar(String rutaArchivo) {
        ArrayList<String> palabrasABuscar = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String palabra;
            while ((palabra = br.readLine()) != null) {
                palabrasABuscar.add(palabra);
            }
            System.out.println("Archivo de palabras a buscar cargado exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo de palabras a buscar: " + e.getMessage());
        }
        return palabrasABuscar;
    }
}
