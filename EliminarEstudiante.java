import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class EliminarEstudiante {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarEstudiante window = new EliminarEstudiante();
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
	public EliminarEstudiante() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(244, 164, 96));
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 489, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEliminarEstudiante = new JLabel("Eliminar Estudiante");
		lblEliminarEstudiante.setFont(new Font("Rockwell", Font.BOLD, 25));
		lblEliminarEstudiante.setBounds(43, 40, 339, 45);
		frame.getContentPane().add(lblEliminarEstudiante);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(new Color(244, 164, 96));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setFont(new Font("Rockwell", Font.BOLD, 15));
		btnCancelar.setBounds(69, 445, 123, 29);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(new Color(244, 164, 96));
		btnAceptar.setFont(new Font("Rockwell", Font.BOLD, 15));
		btnAceptar.setBounds(269, 445, 123, 29);
		frame.getContentPane().add(btnAceptar);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table.setBounds(43, 117, 381, 275);
		frame.getContentPane().add(table);
	}
	public void setVisibility(boolean visible) {
		frame.setVisible(visible);
	}
	public void dispose() {
		this.frame.dispose();
	}
}
