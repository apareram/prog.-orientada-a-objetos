package panelIbero;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interfaz extends JFrame {
	public Interfaz() {
		//Nuevo tipo de layout, es grid, divide en matrices la pantalla
		setLayout(new GridLayout (2,2));
		setSize(600,600);
		setLocation(250,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Agregandolo
		Panel panel1 = new Panel();
		panel1.setBackground(Color.YELLOW);
		
		//Agregando la imagen 2
		ImageIcon imageIcon = new ImageIcon("/Users/aparera/Desktop/_/ibero/10th/prog. orientada a objetos/codigo/panelIbero/download.png");
        Image scaledImage = imageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
		JLabel labelWithImage = new JLabel(scaledIcon);
		
		
		//Agregando la imagen 3
		ImageIcon imageIcon2 = new ImageIcon("/Users/aparera/Desktop/_/ibero/10th/prog. orientada a objetos/codigo/panelIbero/download.png");
        Image scaledImage2 = imageIcon2.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);
		JLabel labelWithImage2 = new JLabel(scaledIcon2);
		
		Panel2 panel4 = new Panel2();

		this.add(panel1);
		this.add(labelWithImage);
		this.add(labelWithImage2);
		this.add(panel4);
	}
}

