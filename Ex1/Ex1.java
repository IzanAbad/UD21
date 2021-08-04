package Act1.Act1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ex1 extends JFrame {

	private JPanel contentPane;
	private JLabel etiqueta;

	

	/**
	 * Create the frame.
	 */
	public Ex1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
	
		setVisible(true);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		etiqueta=new JLabel("Etiqueta");
		etiqueta.setBounds(20,10,100,100);
		contentPane.add(etiqueta);
		
		
	}

}
