package gui.Madalina;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame3_ProTv_Sambata {
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3_ProTv_Sambata window = new Frame3_ProTv_Sambata();
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
	public Frame3_ProTv_Sambata() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 217, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnStirilePro = new JTextPane();
		txtpnStirilePro.setEditable(false);
		txtpnStirilePro.setText("07: 00 Stirile Pro Tv");
		txtpnStirilePro.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro.setBounds(10, 10, 106, 19);
		frame.getContentPane().add(txtpnStirilePro);
		
		JTextPane txtpnVorbesteLumea = new JTextPane();
		txtpnVorbesteLumea.setEditable(false);
		txtpnVorbesteLumea.setText("10:00 I Like IT");
		txtpnVorbesteLumea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnVorbesteLumea.setBounds(10, 45, 114, 19);
		frame.getContentPane().add(txtpnVorbesteLumea);
		
		JTextPane txtpnStirilePro_1 = new JTextPane();
		txtpnStirilePro_1.setEditable(false);
		txtpnStirilePro_1.setText("10:30 Superspeed");
		txtpnStirilePro_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro_1.setBounds(10, 74, 106, 19);
		frame.getContentPane().add(txtpnStirilePro_1);
		
		JTextPane txtpnLectiiDe = new JTextPane();
		txtpnLectiiDe.setEditable(false);
		txtpnLectiiDe.setText("11:00 O fetita americana");
		txtpnLectiiDe.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnLectiiDe.setBounds(10, 103, 136, 19);
		frame.getContentPane().add(txtpnLectiiDe);
		
		JTextPane txtpnLaMaruta = new JTextPane();
		txtpnLaMaruta.setEditable(false);
		txtpnLaMaruta.setText("13:00 Corky");
		txtpnLaMaruta.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnLaMaruta.setBounds(10, 132, 106, 19);
		frame.getContentPane().add(txtpnLaMaruta);
		
		JTextPane txtpnStirilePro_2 = new JTextPane();
		txtpnStirilePro_2.setEditable(false);
		txtpnStirilePro_2.setText("14:45 Romanii au talent (R)");
		txtpnStirilePro_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro_2.setBounds(10, 173, 136, 19);
		frame.getContentPane().add(txtpnStirilePro_2);
		
		JTextPane txtpnCeSpun = new JTextPane();
		txtpnCeSpun.setEditable(false);
		txtpnCeSpun.setText("22:00 Motivat sa ucida");
		txtpnCeSpun.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnCeSpun.setBounds(10, 270, 114, 19);
		frame.getContentPane().add(txtpnCeSpun);
		
		JTextPane txtpnStirilePro_3 = new JTextPane();
		txtpnStirilePro_3.setEditable(false);
		txtpnStirilePro_3.setText("19:00 Stirile Pro Tv");
		txtpnStirilePro_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro_3.setBounds(10, 202, 106, 19);
		frame.getContentPane().add(txtpnStirilePro_3);
		
		JTextPane txtpnSurvivorRomania = new JTextPane();
		txtpnSurvivorRomania.setEditable(false);
		txtpnSurvivorRomania.setText("20:00 Curierul 3");
		txtpnSurvivorRomania.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnSurvivorRomania.setBounds(10, 241, 106, 19);
		frame.getContentPane().add(txtpnSurvivorRomania);
		
		JTextPane txtpnStirilePro_4 = new JTextPane();
		txtpnStirilePro_4.setEditable(false);
		txtpnStirilePro_4.setText("02:00 Las fierbinti (R)");
		txtpnStirilePro_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro_4.setBounds(10, 329, 114, 19);
		frame.getContentPane().add(txtpnStirilePro_4);
		
		JTextPane txtpnFuriaUnui = new JTextPane();
		txtpnFuriaUnui.setEditable(false);
		txtpnFuriaUnui.setText("06:00 Lectii de viata (R)");
		txtpnFuriaUnui.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnFuriaUnui.setBounds(10, 358, 136, 19);
		frame.getContentPane().add(txtpnFuriaUnui);
		
		JTextPane txtpnImperiulLeilor = new JTextPane();
		txtpnImperiulLeilor.setText("00:15 Search and Destroy (R)");
		txtpnImperiulLeilor.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnImperiulLeilor.setBounds(10, 300, 136, 19);
		frame.getContentPane().add(txtpnImperiulLeilor);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(137, 397, 67, 21);
		frame.getContentPane().add(btnNewButton);
	}

}
