package panelIbero;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class Panel2 extends JPanel{
	public Panel2() {
		this.setLayout(new GridLayout (2,2));
		Panel panel1 = new Panel();
		panel1.setBackground(Color.YELLOW);
		
		Panel panel2 = new Panel();
		panel2.setBackground(Color.GREEN);
		
		Panel panel3 = new Panel();
		panel3.setBackground(Color.GREEN);
		
		Panel panel4 = new Panel();
		panel4.setBackground(Color.YELLOW);
		
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
	}
}
