package UD21.Act6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Ex6 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblPesokg;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Ex6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
	
		setVisible(true);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Altura(metros)");
		lblNewLabel.setBounds(42, 36, 88, 27);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(137, 39, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblPesokg = new JLabel("Peso(Kg)");
		lblPesokg.setBounds(263, 36, 88, 27);
		contentPane.add(lblPesokg);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(328, 39, 86, 20);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Calcular IMC");
		btnNewButton.setBounds(63, 86, 135, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("IMC");
		lblNewLabel_1.setBounds(263, 90, 35, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(308, 90, 146, 19);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setBorder(BorderFactory.createLineBorder(Color.black));
		

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent f) {
			
				double altura = Double.parseDouble(textField.getText());
				
				double peso = Double.parseDouble(textField_1.getText());
				
				double imc = peso/(altura * altura) ;
				
				String IMC= String.valueOf(imc);
				
				lblNewLabel_2.setText(IMC);
				
				
			}
		});
		
		
		
		
	}
}
