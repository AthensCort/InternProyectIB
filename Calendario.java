import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calendario {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calendario window = new Calendario();
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
	public Calendario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(244, 164, 96));
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 864, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CALENDARIO");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 25));
		lblNewLabel.setBounds(181, 47, 293, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.setBackground(new Color(244, 164, 96));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Rockwell", Font.BOLD, 15));
		btnNewButton.setBounds(36, 57, 85, 24);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(36, 128, 146, 117);
		frame.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(192, 128, 146, 117);
		frame.getContentPane().add(textArea_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(348, 128, 146, 117);
		frame.getContentPane().add(textArea_1_1);
		
		JTextArea textArea_1_2 = new JTextArea();
		textArea_1_2.setBounds(504, 128, 146, 117);
		frame.getContentPane().add(textArea_1_2);
		
		JTextArea textArea_1_3 = new JTextArea();
		textArea_1_3.setBounds(36, 255, 146, 117);
		frame.getContentPane().add(textArea_1_3);
		
		JTextArea textArea_1_4 = new JTextArea();
		textArea_1_4.setBounds(192, 255, 146, 117);
		frame.getContentPane().add(textArea_1_4);
		
		JTextArea textArea_1_5 = new JTextArea();
		textArea_1_5.setBounds(660, 128, 146, 117);
		frame.getContentPane().add(textArea_1_5);
		
		JTextArea textArea_1_6 = new JTextArea();
		textArea_1_6.setBounds(348, 255, 146, 117);
		frame.getContentPane().add(textArea_1_6);
		
		JTextArea textArea_1_7 = new JTextArea();
		textArea_1_7.setBounds(504, 255, 146, 117);
		frame.getContentPane().add(textArea_1_7);
		
		JTextArea textArea_1_8 = new JTextArea();
		textArea_1_8.setBounds(660, 255, 146, 117);
		frame.getContentPane().add(textArea_1_8);
		
		JTextArea textArea_1_9 = new JTextArea();
		textArea_1_9.setBounds(36, 382, 146, 117);
		frame.getContentPane().add(textArea_1_9);
		
		JTextArea textArea_1_10 = new JTextArea();
		textArea_1_10.setBounds(192, 382, 146, 117);
		frame.getContentPane().add(textArea_1_10);
		
		JTextArea textArea_1_11 = new JTextArea();
		textArea_1_11.setBounds(348, 382, 146, 117);
		frame.getContentPane().add(textArea_1_11);
		
		JTextArea textArea_1_12 = new JTextArea();
		textArea_1_12.setBounds(504, 382, 146, 117);
		frame.getContentPane().add(textArea_1_12);
		
		JTextArea textArea_1_13 = new JTextArea();
		textArea_1_13.setBounds(660, 382, 146, 117);
		frame.getContentPane().add(textArea_1_13);
	}
	public void setVisibility(boolean visible) {
		frame.setVisible(visible);
	}
	public void dispose() {
		this.frame.dispose();
	}
}
