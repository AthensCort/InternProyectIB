import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class Materias {

	private JFrame frame;
	private JTable table;
	private Edit editWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Materias window = new Materias();
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
	public Materias() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBackground(new Color(244, 164, 96));
		frame.setBounds(100, 100, 832, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.setBackground(new Color(244, 164, 96));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Rockwell", Font.BOLD, 15));
		btnNewButton.setBounds(42, 38, 85, 27);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("MATERIAS");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 22));
		lblNewLabel.setBounds(147, 96, 275, 33);
		frame.getContentPane().add(lblNewLabel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(194);
		table.setBounds(380, 89, 292, 351);
		frame.getContentPane().add(table);
		
		JButton btnNewButton_1 = new JButton("Espa\u00F1ol");
		btnNewButton_1.setBackground(new Color(244, 164, 96));
		btnNewButton_1.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnNewButton_1.setBounds(147, 153, 151, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Matematicas");
		btnNewButton_1_1.setBackground(new Color(244, 164, 96));
		btnNewButton_1_1.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnNewButton_1_1.setBounds(147, 196, 151, 33);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Historia");
		btnNewButton_1_1_1.setBackground(new Color(244, 164, 96));
		btnNewButton_1_1_1.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnNewButton_1_1_1.setBounds(147, 239, 151, 33);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Ciencias");
		btnNewButton_1_1_1_1.setBackground(new Color(244, 164, 96));
		btnNewButton_1_1_1_1.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnNewButton_1_1_1_1.setBounds(147, 286, 151, 33);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_2 = new JButton("Civica");
		btnNewButton_1_1_1_2.setBackground(new Color(244, 164, 96));
		btnNewButton_1_1_1_2.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnNewButton_1_1_1_2.setBounds(147, 331, 151, 33);
		frame.getContentPane().add(btnNewButton_1_1_1_2);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBackground(new Color(244, 164, 96));
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editWindow= new Edit();
				editWindow.setVisibility(true);
			}
		});
		btnEditar.setFont(new Font("Rockwell", Font.BOLD, 15));
		btnEditar.setBounds(711, 32, 85, 33);
		frame.getContentPane().add(btnEditar);
	}
	public void setVisibility(boolean visible) {
		frame.setVisible(visible);
	}
	public void dispose() {
		this.frame.dispose();
	}

}
