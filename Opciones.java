import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Opciones {

	private JFrame frame;
	private EliminarEstudiante eliminarEstudianteWindow;
	private AgregarEstudiante agregarEstudianteWindow;
	private VaciarDatos vaciarDatosWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Opciones window = new Opciones();
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
	public Opciones() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(244, 164, 96));
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 492, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPCIONES");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 21));
		lblNewLabel.setBounds(149, 43, 237, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Eliminar un estudiante");
		btnNewButton_1.setBackground(new Color(244, 164, 96));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarEstudianteWindow = new EliminarEstudiante ();
				eliminarEstudianteWindow.setVisibility(true);
			}
		});
		btnNewButton_1.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnNewButton_1.setBounds(130, 119, 256, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Agregar un estudiante");
		btnNewButton_1_1.setBackground(new Color(244, 164, 96));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarEstudianteWindow= new AgregarEstudiante();
				agregarEstudianteWindow.setVisibility(true);
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnNewButton_1_1.setBounds(130, 189, 256, 33);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Vaciar los datos");
		btnNewButton_1_2.setBackground(new Color(244, 164, 96));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vaciarDatosWindow= new VaciarDatos();
				vaciarDatosWindow.setVisibility(true);
			}
		});
		btnNewButton_1_2.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnNewButton_1_2.setBounds(130, 267, 256, 33);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.setBackground(new Color(244, 164, 96));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Rockwell", Font.BOLD, 15));
		btnNewButton.setBounds(26, 42, 85, 27);
		frame.getContentPane().add(btnNewButton);
	}
	public void setVisibility(boolean visible) {
		frame.setVisible(visible);
	}
	public void dispose() {
		this.frame.dispose();
	}

}
