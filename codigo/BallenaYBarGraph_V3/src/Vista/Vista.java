package Vista;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.mfg.exgraf.BarChart_AWT;
import com.mfg.nu.aislada.JPanelDemo;

public class Vista extends JFrame {
    public BarChart_AWT panel1;  // Panel para el gráfico
    public JPanelDemo panel2;
    public PanelRutas panel3;
    public PanelBotones panel4;
    public JPanel graphContainer;  // Contenedor donde se colocará el gráfico
    public JPanel nubeContainer;

    public Vista() throws IOException {
        setLayout(new GridLayout(2, 2));
        setSize(1000, 700);
        setLocation(250, 250);

        nubeContainer = new JPanel(); 
        panel3 = new PanelRutas();
        panel4 = new PanelBotones();
        graphContainer = new JPanel();  // Inicializar el contenedor del gráfico

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cuenta palabras");

        this.add(panel3);
        this.add(graphContainer);  // Usar este JPanel para la gráfica
        this.add(panel4);
        this.add(nubeContainer);
    }
}
