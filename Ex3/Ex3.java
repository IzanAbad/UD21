package UD21.Ex3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ex3 extends JFrame {


	/**
	 * Launch the application.
	 */
	private JPanel contentPane;
	private JButton boton;
	private JButton boton2;
	private JLabel etiqueta0;
	private JLabel etiqueta;
	private JLabel etiqueta2;
	private String texto="Has pulsado: ";
	private int cont1=0;
	private int cont2=0;


	/**
	 * Create the frame.
	 */
	public Ex3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
	
		setVisible(true);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		boton = new JButton("Boton 1");
		contentPane.add(boton);
		boton.setBounds(200,40,100,20);
		
		etiqueta0=new JLabel();
		etiqueta0.setBounds(20,40,200,20);
		contentPane.add(etiqueta0);
		
		etiqueta=new JLabel();
		etiqueta.setBounds(200,10,200,20);
		contentPane.add(etiqueta);
		
		
		etiqueta2=new JLabel();
		etiqueta2.setBounds(300,10,200,20);
		contentPane.add(etiqueta2);
		
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont1++;
				etiqueta.setText(texto+cont1);
			}
		});
		
		boton2 = new JButton("Boton 2");
		contentPane.add(boton2);
		boton2.setBounds(300,40,100,20);
		
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent f) {
				cont2++;
				etiqueta2.setText(texto+cont2);
				
			}
		});
		
	
		
	}

}
