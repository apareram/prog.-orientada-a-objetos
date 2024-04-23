package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import com.kennycason.kumo.WordFrequency;
import com.mfg.exgraf.BarChart_AWT;
import com.mfg.nu.aislada.JPanelDemo;

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
    
    public ArrayList<String> limpiaTextos(ArrayList<String> textoSucio) {
        ArrayList<String> textoLimpio = new ArrayList<>();
        for (String elemento : textoSucio) {
            // Replaces non-letter characters excluding those with diacritical marks (accents)
            String linea = elemento.replaceAll("[^\\p{L}]", " ");  // \p{L} matches any kind of letter from any language
            // Convert to lowercase to standardize the case
            linea = linea.toLowerCase();
            // Add the cleaned line to the clean text list
            textoLimpio.add(linea.trim());  // trim() to remove leading and trailing spaces
        }
        return textoLimpio;
    }

    
    public ArrayList<String> quitarArrobas(ArrayList<String> texto) {
        ArrayList<String> textoLimpioLimpio = new ArrayList<>();
        for (String linea : texto) {
            boolean contieneHandle = linea.matches(".*\\s*@\\w+.*") || linea.startsWith("@");
            if (!contieneHandle) {
            	textoLimpioLimpio.add(linea);
            }
        }
        return textoLimpioLimpio;
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
            // Filtrar y contar cada palabra buscada en la línea actual
            for (int i = 0; i < palabrasABuscar.size(); i++) {
                String palabraBuscada = palabrasABuscar.get(i).toLowerCase();
                for (String palabra : palabrasDeLinea) {
                    if (!palabra.isEmpty() && palabra.equals(palabraBuscada)) {  // Check if the word is not empty
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
    
    public List<WordFrequency> generarFrecuenciasDePalabras(ArrayList<String> lineasTexto) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String linea : lineasTexto) {
            String[] palabras = linea.split("\\P{L}+");
            for (String palabra : palabras) {
                if (!palabra.isEmpty()) { 
                    palabra = palabra.toLowerCase();
                    frequencyMap.put(palabra, frequencyMap.getOrDefault(palabra, 0) + 1);
                }
            }
        }

        List<WordFrequency> frequencies = new ArrayList<>();
        frequencyMap.forEach((word, freq) -> frequencies.add(new WordFrequency(word, freq)));
        return frequencies;
    }
    
    public void cargarDatosYMostrarNube(List<WordFrequency> frequencies) {
        try {
            JPanelDemo panelDemo = new JPanelDemo(frequencies);
            vista.nubeContainer.removeAll();
            vista.nubeContainer.add(panelDemo);
            vista.nubeContainer.revalidate();
            vista.nubeContainer.repaint();
        } catch (IOException ex) {
        	ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error creating word cloud: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
