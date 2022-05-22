package gui.Madalina;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextArea;

import org.jfree.ui.RefineryUtilities;

import pattern.Madalina.Facade;

import java.awt.Font;

public class Frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.startAplicatie();
		
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(51, 204, 153));
		frame.getContentPane().setBackground(new Color(224, 255, 255));
		frame.setBounds(10, 100, 544, 350);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("PRO TV");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    frame.toBack();
				Frame2_ProTv fr = new Frame2_ProTv();
				fr.NewScreen();
				frame.setVisible(false);
				frame.setState(java.awt.Frame.NORMAL);
			}
		});
		btnNewButton.setBounds(73, 177, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Antena 1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame2_Antena1 fr = new Frame2_Antena1();
				fr.NewScreen();
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(222, 177, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Kanal D");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame2_KanalD fr = new Frame2_KanalD();
				fr.NewScreen();
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(382, 177, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JTextArea txtrProgramTv = new JTextArea();
		txtrProgramTv.setEditable(false);
		txtrProgramTv.setBackground(new Color(0, 255, 204));
		txtrProgramTv.setFont(new Font("Times New Roman", Font.BOLD, 30));
		txtrProgramTv.setText("Program TV");
		txtrProgramTv.setBounds(178, 55, 171, 51);
		frame.getContentPane().add(txtrProgramTv);
	}
}
