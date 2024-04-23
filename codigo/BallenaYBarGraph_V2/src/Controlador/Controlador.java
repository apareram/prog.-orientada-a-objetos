package Controlador;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador implements ActionListener {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
       this.modelo = modelo;
       this.vista = vista;
       
       vista.panel3.botonCargar1.addActionListener(this);
       vista.panel3.botonCargar2.addActionListener(this);
       vista.panel4.botonGrafica.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.panel3.botonCargar1) {
            try {
                String ruta1 = vista.panel3.caja1.getText();
                System.out.println(ruta1);
                ArrayList<String> texto = new ArrayList<String>();
                texto = modelo.cargarLineasDeTexto(ruta1);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Sin texto / Dato incorrecto", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if (e.getSource() == vista.panel3.botonCargar2) {
            try {
                String ruta2 = vista.panel3.caja2.getText();
                ArrayList<String> palabrasBuscar = new ArrayList<String>();
                palabrasBuscar = modelo.cargarPalabrasABuscar(ruta2);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Sin texto / Dato incorrecto", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if (e.getSource() == vista.panel4.botonGrafica) {
            String ruta1 = vista.panel3.caja1.getText();
            ArrayList<String> texto = modelo.cargarLineasDeTexto(ruta1);
            String ruta2 = vista.panel3.caja2.getText();
            ArrayList<String> palabrasBuscar = modelo.cargarPalabrasABuscar(ruta2);
            ArrayList<Integer> cuntPalabras = modelo.contarPalabras(texto, palabrasBuscar);
            modelo.cargarDatosYMostrarGrafico(palabrasBuscar, cuntPalabras);
        }
    }
}