package panelIbero;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Panel extends JPanel{
	public Panel() {
	this.setLayout(null);
	JLabel etiqueta = new JLabel("Ingresa Texto", SwingConstants.CENTER);
	etiqueta.setBounds(10, 10, 100, 30);
	this.add(etiqueta);
	
	JTextField textField = new JTextField(20);
	textField.setBounds(10, 60, 100, 20);
	this.add(textField);
	}
}
