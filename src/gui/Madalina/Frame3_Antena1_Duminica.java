package gui.Madalina;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame3_Antena1_Duminica {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3_Antena1_Duminica window = new Frame3_Antena1_Duminica();
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
	public Frame3_Antena1_Duminica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 203, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnMasterchefr = new JTextPane();
		txtpnMasterchefr.setEditable(false);
		txtpnMasterchefr.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnMasterchefr.setText("14:00 Cooking Show");
		txtpnMasterchefr.setBounds(33, 91, 108, 19);
		frame.getContentPane().add(txtpnMasterchefr);
		
		JTextPane txtpnImperiulLeilor = new JTextPane();
		txtpnImperiulLeilor.setEditable(false);
		txtpnImperiulLeilor.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnImperiulLeilor.setText("15:00 Te conosc de undeva");
		txtpnImperiulLeilor.setBounds(33, 120, 135, 19);
		frame.getContentPane().add(txtpnImperiulLeilor);
		
		JTextPane txtpnStirilePro = new JTextPane();
		txtpnStirilePro.setEditable(false);
		txtpnStirilePro.setText("19:00 Observator");
		txtpnStirilePro.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro.setBounds(33, 149, 108, 19);
		frame.getContentPane().add(txtpnStirilePro);
		
		JTextPane txtpnSurvivorRomania = new JTextPane();
		txtpnSurvivorRomania.setEditable(false);
		txtpnSurvivorRomania.setText("20:30 iUmor");
		txtpnSurvivorRomania.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnSurvivorRomania.setBounds(33, 178, 130, 19);
		frame.getContentPane().add(txtpnSurvivorRomania);
		
		JTextPane txtpnContrabanda = new JTextPane();
		txtpnContrabanda.setEditable(false);
		txtpnContrabanda.setText("00:30 iMai mult Umor");
		txtpnContrabanda.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnContrabanda.setBounds(33, 207, 130, 19);
		frame.getContentPane().add(txtpnContrabanda);
		
		JTextPane txtpnApropoTv = new JTextPane();
		txtpnApropoTv.setEditable(false);
		txtpnApropoTv.setText("00:45 Insula iubirii (R)");
		txtpnApropoTv.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnApropoTv.setBounds(33, 236, 114, 19);
		frame.getContentPane().add(txtpnApropoTv);
		
		JTextPane txtpnElysiumr = new JTextPane();
		txtpnElysiumr.setEditable(false);
		txtpnElysiumr.setText("03:00 Observator (R)");
		txtpnElysiumr.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnElysiumr.setBounds(33, 265, 114, 19);
		frame.getContentPane().add(txtpnElysiumr);
		
		JTextPane txtpnRomaniaTe_1 = new JTextPane();
		txtpnRomaniaTe_1.setEditable(false);
		txtpnRomaniaTe_1.setText("04:00 Loveste si fugi");
		txtpnRomaniaTe_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnRomaniaTe_1.setBounds(33, 294, 135, 19);
		frame.getContentPane().add(txtpnRomaniaTe_1);
		
		JTextPane txtpntirilePro = new JTextPane();
		txtpntirilePro.setEditable(false);
		txtpntirilePro.setText("06:00 Observator");
		txtpntirilePro.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpntirilePro.setBounds(33, 323, 114, 19);
		frame.getContentPane().add(txtpntirilePro);
		
		JTextPane txtpnObservator = new JTextPane();
		txtpnObservator.setEditable(false);
		txtpnObservator.setText("07:00 Observator");
		txtpnObservator.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnObservator.setBounds(33, 10, 108, 19);
		frame.getContentPane().add(txtpnObservator);
		
		JTextPane txtpnNeatzaDe = new JTextPane();
		txtpnNeatzaDe.setEditable(false);
		txtpnNeatzaDe.setText("09:00 Neatza de weekend");
		txtpnNeatzaDe.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnNeatzaDe.setBounds(33, 39, 130, 19);
		frame.getContentPane().add(txtpnNeatzaDe);
		
		JTextPane txtpnObservator_1 = new JTextPane();
		txtpnObservator_1.setEditable(false);
		txtpnObservator_1.setText("13:00 Observator");
		txtpnObservator_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnObservator_1.setBounds(33, 62, 108, 19);
		frame.getContentPane().add(txtpnObservator_1);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(122, 363, 67, 21);
		frame.getContentPane().add(btnNewButton);
	}
}
