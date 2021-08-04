package UD21.UD21_Act4;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Ex4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel etiqueta;
	private JButton boton;
	
	

public Ex4() {
	
	
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 300, 300);
	contentPane = new JPanel();

	setVisible(true);
	contentPane.setLayout(null);
	setContentPane(contentPane);
	
	/*---------*/
	
	
	ventana ventana = new ventana();
	
	addWindowListener(ventana);
	
	
	
}	
class ventana implements WindowListener {
	   
 

    public void windowClosed( WindowEvent evt ) {
        System.out.println( "Ventana cerrada" );
        
      
        }

    public void windowIconified( WindowEvent evt ) {
        System.out.println( "Ventana minimizada" );  
      
        
        }

    public void windowOpened( WindowEvent evt ) {
        System.out.println( "Ventana abierta" );
        
        }

    public void windowClosing( WindowEvent evt ) {
        System.out.println( "Cerrando ventana..." );
     
        }

    public void windowDeiconified( WindowEvent evt ) {
        System.out.println( "Ventana maximizada" );
        }

    public void windowActivated( WindowEvent evt ) {
        System.out.println( "Ventana activada" );
        }

    public void windowDeactivated( WindowEvent evt ) {
        System.out.println( "Ventana desactivada" );
        }

    }
	
}

