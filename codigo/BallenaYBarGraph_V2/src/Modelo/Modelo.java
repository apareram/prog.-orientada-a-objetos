package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mfg.exgraf.BarChart_AWT;

import Vista.Vista;

public class Modelo {
	
	private Vista vista;
	
	public Modelo(Vista vista) {
        this.vista = vista;
    }
	
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
    
    public ArrayList<Integer> contarPalabras(ArrayList<String> lineasTexto, ArrayList<String> palabrasABuscar) {
        ArrayList<Integer> palabrasContadas = new ArrayList<>(palabrasABuscar.size());
        // Inicializar contadores a cero
        for (int i = 0; i < palabrasABuscar.size(); i++) {
            palabrasContadas.add(0);
        }

        // Procesar cada línea de texto
        for (String linea : lineasTexto) {
            // Dividir la línea en palabras individuales
            String[] palabrasDeLinea = linea.toLowerCase().split("\\P{L}+"); // Divide en cualquier cosa que no sea una letra
            // Contar cada palabra buscada en la línea actual
            for (int i = 0; i < palabrasABuscar.size(); i++) {
                String palabraBuscada = palabrasABuscar.get(i).toLowerCase();
                for (String palabra : palabrasDeLinea) {
                    if (palabra.equals(palabraBuscada)) {
                        palabrasContadas.set(i, palabrasContadas.get(i) + 1);
                    }
                }
            }
        }

        return palabrasContadas;
    }
    
    public void cargarDatosYMostrarGrafico(ArrayList<String> palabras, ArrayList<Integer> palabrasContadas) {
        try {
            vista.graphContainer.removeAll();  // Limpiar el contenedor antes de añadir el nuevo gráfico
            vista.panel1 = new BarChart_AWT("Frecuencia de Palabras", palabrasContadas, palabras);
            vista.graphContainer.add(vista.panel1.createDemoPanel());  // Añadir el gráfico al contenedor
            vista.graphContainer.revalidate();
            vista.graphContainer.repaint();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error cargando datos o creando gráfico: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
