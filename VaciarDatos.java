import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VaciarDatos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VaciarDatos window = new VaciarDatos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VaciarDatos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(244, 164, 96));
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 501, 230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblestaSeguro = new JLabel("\u00BFEST\u00C1 SEGURO?");
		lblestaSeguro.setFont(new Font("Rockwell", Font.BOLD, 25));
		lblestaSeguro.setBounds(50, 24, 339, 45);
		frame.getContentPane().add(lblestaSeguro);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(new Color(244, 164, 96));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setFont(new Font("Rockwell", Font.BOLD, 16));
		btnCancelar.setBounds(57, 109, 123, 29);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(new Color(244, 164, 96));
		btnAceptar.setFont(new Font("Rockwell", Font.BOLD, 16));
		btnAceptar.setBounds(283, 109, 123, 29);
		frame.getContentPane().add(btnAceptar);
	}
	public void setVisibility(boolean visible) {
		frame.setVisible(visible);
	}
	public void dispose() {
		this.frame.dispose();
	}


}
