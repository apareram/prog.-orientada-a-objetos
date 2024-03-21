package projectoFaC.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import projectoFaC.modelo.Modelo;
import projectoFaC.vista.Vista;

public class Controlador implements ActionListener {
    //objetos de vista y modelo
    private Modelo modelo;
    private Vista vista;

    //constructor que recibe objetos de tipo vista y controlador.
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.panelIng.boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.panelIng.boton) {
            // aquí la parte modular del MVC
            // gestiona interacción modelo/vista
            try {
                float tempC = Float.parseFloat(vista.panelIng.txtField.getText());
                modelo.setTemp(tempC);
                vista.panelRes.e2.setText(Float.toString(modelo.ConvT()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Sin texto / Dato incorrecto", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}