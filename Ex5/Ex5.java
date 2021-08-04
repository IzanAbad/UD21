package UD21.UD21_Act5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ex5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Ex5() {
	

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
	
		setVisible(true);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		EventosRaton eventoRaton = new EventosRaton();
		
		addMouseListener(eventoRaton);
	}
	class EventosRaton extends MouseAdapter{
		
		public void mouseClicked(MouseEvent e) {
			
			System.out.println("HAS HECHO CLICK");
		}
		public void mouseDragged(MouseEvent e) {
					
					System.out.println("Has arrastrado");
				}
		public void mouseExited(MouseEvent e) {
			
			System.out.println("Te has salido del cuadro");
		}
		public void mouseEntered(MouseEvent e) {
			
			System.out.println("Te has metido en el cuadro");
		}
		public void mousePressed(MouseEvent e) {
			
			System.out.println("Estas manteniendo el click");
		}
		public void mouseReleased(MouseEvent e) {
			
			System.out.println("Has soltado el click");
		}
		public void mouseWheelMoved(MouseWheelEvent e) {
			
			System.out.println("Estás moviendo la rueda");
		}
	}

}
