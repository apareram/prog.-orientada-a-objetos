package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelRutas extends JPanel{
	public JButton botonCargar1;
	public JButton botonCargar2;
	public JLabel etiqueta1;
	public JLabel etiqueta2;
	public JTextField caja1;
	public JTextField caja2;
	
	public PanelRutas() {
		
		this.setLayout(null);
		
		etiqueta1 = new JLabel("Ruta texto",SwingConstants.CENTER);
		etiqueta1.setBounds(0, 10, 230, 30);
		this.add(etiqueta1);
		
		caja1 = new JTextField(20);
		caja1.setBounds(250, 10, 230, 30);
		this.add(caja1);
		
		botonCargar1 = new JButton("Cargar");
		botonCargar1.setBounds(0, 50, 230, 30);
		this.add(botonCargar1);
		
		etiqueta2 = new JLabel("Ruta Palabras",SwingConstants.CENTER);
		etiqueta2.setBounds(0, 100, 230, 30);
		this.add(etiqueta2);
		
		caja2 = new JTextField(20);
		caja2.setBounds(250, 100, 230, 30);
		this.add(caja2);
		
		botonCargar2 = new JButton("Cargar");
		botonCargar2.setBounds(0, 150, 230, 30);
		this.add(botonCargar2);
	}
	public JButton getBotonCargar1() {
        return botonCargar1;
    }

    public JButton getBotonCargar2() {
        return botonCargar2;
    }

    public JTextField getCaja1() {
        return caja1;
    }

    public JTextField getCaja2() {
        return caja2;
    }
}
