import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class Alumnos {

	private JFrame frame;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alumnos window = new Alumnos();
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
	public Alumnos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(244, 164, 96));
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 783, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Alumnos = new JLabel("ALUMNOS");
		Alumnos.setFont(new Font("Rockwell", Font.BOLD, 21));
		Alumnos.setBounds(149, 47, 212, 21);
		frame.getContentPane().add(Alumnos);
		
		table = new JTable();
		table.setForeground(new Color(244, 164, 96));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(160);
		table.getColumnModel().getColumn(1).setPreferredWidth(122);
		table.setBounds(149, 198, 482, 194);
		frame.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.setBackground(new Color(244, 164, 96));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Rockwell", Font.BOLD, 15));
		btnNewButton.setBounds(21, 31, 85, 27);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBackground(new Color(244, 164, 96));
		textField.setBounds(151, 96, 480, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
	public void setVisibility(boolean visible) {
		frame.setVisible(visible);
	}
	public void dispose() {
		this.frame.dispose();
	}
}
