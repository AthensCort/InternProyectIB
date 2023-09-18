import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Edit {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit window = new Edit();
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
	public Edit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(244, 164, 96));
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 401, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(new Color(244, 164, 96));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setFont(new Font("Rockwell", Font.BOLD, 15));
		btnCancelar.setBounds(63, 303, 123, 29);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(new Color(244, 164, 96));
		btnAceptar.setFont(new Font("Rockwell", Font.BOLD, 15));
		btnAceptar.setBounds(224, 303, 123, 29);
		frame.getContentPane().add(btnAceptar);
		
		JLabel lblNewLabel = new JLabel("Nueva asignaci\u00F3n");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 21));
		lblNewLabel.setBounds(88, 25, 217, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNombreActividad = new JLabel("Nombre actividad");
		lblNombreActividad.setFont(new Font("Rockwell", Font.BOLD, 15));
		lblNombreActividad.setBounds(53, 77, 217, 26);
		frame.getContentPane().add(lblNombreActividad);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Rockwell", Font.BOLD, 15));
		lblTipo.setBounds(53, 148, 217, 26);
		frame.getContentPane().add(lblTipo);
		
		JLabel lblNombreActividad_1_1 = new JLabel("Fecha");
		lblNombreActividad_1_1.setFont(new Font("Rockwell", Font.BOLD, 15));
		lblNombreActividad_1_1.setBounds(53, 213, 217, 26);
		frame.getContentPane().add(lblNombreActividad_1_1);
		
		textField = new JTextField();
		textField.setBounds(53, 113, 279, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(53, 174, 279, 29);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(53, 248, 279, 29);
		frame.getContentPane().add(textField_2);
	}
	public void setVisibility(boolean visible) {
		frame.setVisible(visible);
	}
	public void dispose() {
		this.frame.dispose();
	}

}
