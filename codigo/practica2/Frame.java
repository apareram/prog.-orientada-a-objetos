package practica2;

import javax.swing.JFrame;

public class Frame extends JFrame {
    public Frame() {
        // Establece el título del marco
        setTitle("frame");
        // Establece el tamaño del marco
        setSize(700, 500);
        // Establece la ubicación del marco
        setLocation(250, 250);
        // Establece la operación de cierre por defecto
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel1 = new Panel();
        panel1.setBounds(200, 150, 250, 100);
        this.add(panel1);

        Panel panel2 = new Panel();
        panel2.setBounds(400, 300, 250, 100);
        this.add(panel2);

        Panel panel3 = new Panel();
        panel3.setBounds(350, 33, 250, 100);
        this.add(panel3);
    }
}