import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private Asistencias asistenciasWindow;
	private Alumnos alumnosWindow;
	private General generalWindow;
	private Calendario calendarioWindow;
	private Materias materiasWindow;
	private Opciones opcionesWindow;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
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
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(244, 164, 96));
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 697, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Nombremaestra = new JLabel("Nombre Completo de la Maestra");
		Nombremaestra.setFont(new Font("Rockwell", Font.BOLD, 17));
		Nombremaestra.setBounds(172, 126, 291, 31);
		frame.getContentPane().add(Nombremaestra);
		
		JLabel lblListaDeActividades = new JLabel("Lista de actividades proximas");
		lblListaDeActividades.setFont(new Font("Rockwell", Font.BOLD, 17));
		lblListaDeActividades.setBounds(172, 259, 291, 31);
		frame.getContentPane().add(lblListaDeActividades);
		
		table = new JTable();
		table.setBounds(178, 22, 118, 94);
		frame.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(172, 300, 275, 132);
		frame.getContentPane().add(table_1);
		
		JButton btnNewButton_1 = new JButton("Asistencias");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asistenciasWindow = new Asistencias ();
				asistenciasWindow.setVisibility(true);
			}
			
		});
		btnNewButton_1.setFont(new Font("Rockwell", Font.BOLD, 12));
		btnNewButton_1.setBackground(new Color(244, 164, 96));
		btnNewButton_1.setBounds(526, 52, 118, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton Inicio_1 = new JButton("Inicio");
		Inicio_1.setFont(new Font("Rockwell", Font.BOLD, 12));
		Inicio_1.setBackground(new Color(244, 164, 96));
		Inicio_1.setBounds(23, 37, 118, 23);
		frame.getContentPane().add(Inicio_1);
		
		JButton Inicio = new JButton("Alumnos");
		Inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alumnosWindow = new Alumnos();
				alumnosWindow.setVisibility(true);
			}
		});
		Inicio.setFont(new Font("Rockwell", Font.BOLD, 12));
		Inicio.setBackground(new Color(244, 164, 96));
		Inicio.setBounds(23, 87, 118, 23);
		frame.getContentPane().add(Inicio);
		
		JButton General = new JButton("General");
		General.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generalWindow = new General ();
				generalWindow.setVisibility(true);
			}
		});
		General.setFont(new Font("Rockwell", Font.BOLD, 12));
		General.setBackground(new Color(244, 164, 96));
		General.setBounds(23, 142, 118, 23);
		frame.getContentPane().add(General);
		
		JButton Calendario = new JButton("Calendario");
		Calendario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calendarioWindow = new Calendario();
				calendarioWindow.setVisibility(true);
			}
		});
		Calendario.setFont(new Font("Rockwell", Font.BOLD, 12));
		Calendario.setBackground(new Color(244, 164, 96));
		Calendario.setBounds(23, 194, 118, 23);
		frame.getContentPane().add(Calendario);
		
		JButton Materias = new JButton("Materias");
		Materias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				materiasWindow = new Materias();
				materiasWindow.setVisibility(true);
			}
		});
		Materias.setFont(new Font("Rockwell", Font.BOLD, 12));
		Materias.setBackground(new Color(244, 164, 96));
		Materias.setBounds(23, 248, 118, 23);
		frame.getContentPane().add(Materias);
		
		JButton Opciones = new JButton("Opciones");
		Opciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opcionesWindow = new Opciones();
				opcionesWindow.setVisibility(true);
			}
		});
		Opciones.setFont(new Font("Rockwell", Font.BOLD, 12));
		Opciones.setBackground(new Color(244, 164, 96));
		Opciones.setBounds(23, 365, 118, 23);
		frame.getContentPane().add(Opciones);
	}
}
