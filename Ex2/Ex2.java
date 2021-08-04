package UD21.UD21_Ex2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ex2 extends JFrame {

	private JPanel contentPane;
	private JButton boton;
	private JButton boton2;
	private JLabel etiqueta0;
	private JLabel etiqueta;
	private JLabel etiqueta2;
	private String texto="Has pulsado: ";


	/**
	 * Create the frame.
	 */
	public Ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
	
		setVisible(true);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		boton = new JButton("Boton 1");
		contentPane.add(boton);
		boton.setBounds(200,40,100,20);
		
		etiqueta0=new JLabel("Has pulsado: ");
		etiqueta0.setBounds(20,40,200,20);
		contentPane.add(etiqueta0);
		
		etiqueta=new JLabel("Boton 1");
		etiqueta.setBounds(100,40,200,20);
		contentPane.add(etiqueta);
		etiqueta.setVisible(false);
		
		etiqueta2=new JLabel("Boton 2");
		etiqueta2.setBounds(100,40,200,20);
		contentPane.add(etiqueta2);
		etiqueta2.setVisible(false);
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiqueta2.setVisible(false);
				etiqueta.setVisible(true);
			}
		});
		
		boton2 = new JButton("Boton 2");
		contentPane.add(boton2);
		boton2.setBounds(300,40,100,20);
		
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent f) {
			
				etiqueta.setVisible(false);
				etiqueta2.setVisible(true);
			}
		});
		
	
		
	}

}
