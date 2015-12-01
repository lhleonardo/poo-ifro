import java.awt.Component;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Teste extends JFrame {
	public Teste() {
		JRadioButton r1 = new JRadioButton("Teste 1");
		JRadioButton r2 = new JRadioButton("Teste 1");
		JRadioButton r3 = new JRadioButton("Teste 1");

		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);

		this.getContentPane().add(r1);
		this.getContentPane().add(r2);
		this.getContentPane().add(r3);
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Teste();
	}

}
