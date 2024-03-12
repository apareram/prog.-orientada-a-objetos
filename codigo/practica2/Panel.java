package practica2;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Panel extends JPanel {
    public Panel() {
        this.setLayout(null);

        // Crea un subpanel con color de fondo amarillo
        JPanel yellowBox = new JPanel();
        yellowBox.setBackground(Color.YELLOW);
        yellowBox.setBounds(10, 10, 150, 150); // Tamaño de 100x100 píxeles (cuadrado)
        this.add(yellowBox);

        // Agrega componentes al subpanel
        JLabel etiqueta = new JLabel("Ingresa Texto", SwingConstants.CENTER);
        etiqueta.setBounds(10, 10, 100, 30); // Posiciona la etiqueta dentro del subpanel
        yellowBox.add(etiqueta);

        JTextField textField = new JTextField();
        textField.setBounds(10, 40, 100, 100); // Posiciona el campo de texto dentro del subpanel
        yellowBox.add(textField);

    }
}