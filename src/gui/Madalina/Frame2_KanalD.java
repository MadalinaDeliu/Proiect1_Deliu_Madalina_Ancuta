package gui.Madalina;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class Frame2_KanalD {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2_KanalD window = new Frame2_KanalD();
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
	public Frame2_KanalD() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.RED);
		frame.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.setBounds(100, 100, 722, 490);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Luni");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(63, 138, 85, 21);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3_KanalD_Luni fr = new Frame3_KanalD_Luni();
				fr.NewScreen();
				//frame.setVisible(false);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Marti");
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setBounds(63, 218, 85, 21);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3_KanalD_Marti fr = new Frame3_KanalD_Marti();
				fr.NewScreen();
				//frame.setVisible(false);
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Miercuri");
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setBounds(63, 294, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3_KanalD_Miercuri fr = new Frame3_KanalD_Miercuri();
				fr.NewScreen();
				//frame.setVisible(false);
			}
		});
		
		JButton btnNewButton_3 = new JButton("Joi");
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.setBounds(312, 218, 85, 21);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3_KanalD_Joi fr = new Frame3_KanalD_Joi();
				fr.NewScreen();
				//frame.setVisible(false);
			}
		}); 
		JButton btnNewButton_4 = new JButton("Vineri");
		btnNewButton_4.setBackground(Color.CYAN);
		btnNewButton_4.setBounds(555, 138, 85, 21);
		frame.getContentPane().add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3_KanalD_Vineri fr = new Frame3_KanalD_Vineri();
				fr.NewScreen();
				//frame.setVisible(false);
			}
		});
		
		JButton btnNewButton_5 = new JButton("Sambata");
		btnNewButton_5.setBackground(Color.CYAN);
		btnNewButton_5.setBounds(555, 218, 85, 21);
		frame.getContentPane().add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3_KanalD_Sambata fr = new Frame3_KanalD_Sambata();
				fr.NewScreen();
				//frame.setVisible(false);
			}
		}); 
		
		JButton btnNewButton_6 = new JButton("Duminica");
		btnNewButton_6.setBackground(Color.CYAN);
		btnNewButton_6.setBounds(555, 294, 85, 21);
		frame.getContentPane().add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3_KanalD_Duminica fr = new Frame3_KanalD_Duminica();
				fr.NewScreen();
				//frame.setVisible(false);
			}
		});
		
		
		JTextArea txtrProgramTv = new JTextArea();
		txtrProgramTv.setEditable(false);
		txtrProgramTv.setFont(new Font("Times New Roman", Font.BOLD, 25));
		txtrProgramTv.setText("Program TV");
		txtrProgramTv.setBounds(294, 66, 181, 49);
		frame.getContentPane().add(txtrProgramTv);
		
	}
}
