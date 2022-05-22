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

import org.jfree.ui.RefineryUtilities;

import javax.swing.JTextArea;

public class Frame2_ProTv {

	private JFrame frame;
	static Grafic_ProTv chart = new Grafic_ProTv("Grafic audienta", "Grafic de audienta ProTv");


	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				      chart.pack( );        
				      RefineryUtilities.centerFrameOnScreen( chart );        
				      chart.setVisible( true );
					Frame2_ProTv window = new Frame2_ProTv();
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
	public Frame2_ProTv() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.DARK_GRAY);
		frame.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.setBounds(100, 100, 664, 380);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Luni");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(36, 138, 85, 21);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3_ProTv_Luni fr = new Frame3_ProTv_Luni();
				fr.NewScreen();
				//frame.setVisible(false);
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("Marti");
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setBounds(134, 184, 85, 21);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3_ProTv_Marti fr = new Frame3_ProTv_Marti();
				fr.NewScreen();
				//frame.setVisible(false);
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Miercuri");
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setBounds(270, 219, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3_ProTv_Miercuri fr = new Frame3_ProTv_Miercuri();
				fr.NewScreen();
				//frame.setVisible(false);
			}
		});
		
		JButton btnNewButton_3 = new JButton("Joi");
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.setBounds(134, 261, 85, 21);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3_ProTv_Joi fr = new Frame3_ProTv_Joi();
				fr.NewScreen();
				//frame.setVisible(false);
			}
		});
		
		JButton btnNewButton_4 = new JButton("Vineri");
		btnNewButton_4.setBackground(Color.CYAN);
		btnNewButton_4.setBounds(401, 184, 85, 21);
		frame.getContentPane().add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3_ProTv_Vineri fr = new Frame3_ProTv_Vineri();
				fr.NewScreen();
				//frame.setVisible(false);
			}
		});
		
		JButton btnNewButton_5 = new JButton("Sambata");
		btnNewButton_5.setBackground(Color.CYAN);
		btnNewButton_5.setBounds(512, 138, 85, 21);
		frame.getContentPane().add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3_ProTv_Sambata fr = new Frame3_ProTv_Sambata();
				fr.NewScreen();
				//frame.setVisible(false);
			}
		});
		
		JButton btnNewButton_6 = new JButton("Duminica");
		btnNewButton_6.setBackground(Color.CYAN);
		btnNewButton_6.setBounds(401, 261, 100, 21);
		frame.getContentPane().add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame3_ProTv_Duminica fr = new Frame3_ProTv_Duminica();
				fr.NewScreen();
				//frame.setVisible(false);
			}
		});
		
		JTextArea txtrProgramTv = new JTextArea();
		txtrProgramTv.setBackground(Color.CYAN);
		txtrProgramTv.setEditable(false);
		txtrProgramTv.setFont(new Font("Times New Roman", Font.BOLD, 25));
		txtrProgramTv.setText("Program TV");
		txtrProgramTv.setBounds(270, 43, 142, 39);
		frame.getContentPane().add(txtrProgramTv);
		
		JButton btnNewButton_7 = new JButton("Back");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.toBack();
				Frame1 fr = new Frame1();
				fr.main(null);
				chart.setVisible( false );
				frame.setVisible(false);

				frame.toFront();
			}
		});
		btnNewButton_7.setBounds(10, 10, 85, 21);
		frame.getContentPane().add(btnNewButton_7);
	}
}
