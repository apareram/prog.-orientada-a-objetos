package projectoFaC.vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelResultado extends JPanel {
    public PanelResultado() {
        this.setLayout(new GridLayout(2, 1));
        // agregando las labels
        JLabel e1 = new JLabel("La temperatura en Fahrenheit es:", SwingConstants.CENTER);
        this.add(e1);
        JLabel e2 = new JLabel("Aquí la temperatura", SwingConstants.CENTER);
        this.add(e2);
    }
}
