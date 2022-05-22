package gui.Madalina;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame3_ProTv_Joi {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3_ProTv_Joi window = new Frame3_ProTv_Joi();
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
	public Frame3_ProTv_Joi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 206, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnStirilePro = new JTextPane();
		txtpnStirilePro.setEditable(false);
		txtpnStirilePro.setText("07:00 Stirile Pro Tv");
		txtpnStirilePro.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro.setBounds(10, 10, 106, 19);
		frame.getContentPane().add(txtpnStirilePro);
		
		JTextPane txtpnVorbesteLumea = new JTextPane();
		txtpnVorbesteLumea.setEditable(false);
		txtpnVorbesteLumea.setText("10:30 Vorbeste lumea");
		txtpnVorbesteLumea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnVorbesteLumea.setBounds(10, 28, 114, 19);
		frame.getContentPane().add(txtpnVorbesteLumea);
		
		JTextPane txtpnStirilePro_1 = new JTextPane();
		txtpnStirilePro_1.setEditable(false);
		txtpnStirilePro_1.setText("13:00 Stirile Pro Tv");
		txtpnStirilePro_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro_1.setBounds(10, 46, 106, 19);
		frame.getContentPane().add(txtpnStirilePro_1);
		
		JTextPane txtpnLectiiDe = new JTextPane();
		txtpnLectiiDe.setEditable(false);
		txtpnLectiiDe.setText("14:00 Lectii de viata");
		txtpnLectiiDe.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnLectiiDe.setBounds(10, 66, 106, 19);
		frame.getContentPane().add(txtpnLectiiDe);
		
		JTextPane txtpnLaMaruta = new JTextPane();
		txtpnLaMaruta.setEditable(false);
		txtpnLaMaruta.setText("15:00 La Maruta");
		txtpnLaMaruta.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnLaMaruta.setBounds(10, 84, 106, 19);
		frame.getContentPane().add(txtpnLaMaruta);
		
		JTextPane txtpnStirilePro_2 = new JTextPane();
		txtpnStirilePro_2.setEditable(false);
		txtpnStirilePro_2.setText("17:00 Stirile Pro Tv");
		txtpnStirilePro_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro_2.setBounds(10, 101, 106, 19);
		frame.getContentPane().add(txtpnStirilePro_2);
		
		JTextPane txtpnCeSpun = new JTextPane();
		txtpnCeSpun.setEditable(false);
		txtpnCeSpun.setText("18:00 Ce spun romanii");
		txtpnCeSpun.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnCeSpun.setBounds(10, 120, 114, 19);
		frame.getContentPane().add(txtpnCeSpun);
		
		JTextPane txtpnStirilePro_3 = new JTextPane();
		txtpnStirilePro_3.setEditable(false);
		txtpnStirilePro_3.setText("19:00 Stirile Pro Tv");
		txtpnStirilePro_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro_3.setBounds(10, 139, 106, 19);
		frame.getContentPane().add(txtpnStirilePro_3);
		
		JTextPane txtpnSurvivorRomania = new JTextPane();
		txtpnSurvivorRomania.setEditable(false);
		txtpnSurvivorRomania.setText("20:30 Las Firbinti");
		txtpnSurvivorRomania.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnSurvivorRomania.setBounds(10, 159, 106, 19);
		frame.getContentPane().add(txtpnSurvivorRomania);
		
		JTextPane txtpnStirilePro_4 = new JTextPane();
		txtpnStirilePro_4.setEditable(false);
		txtpnStirilePro_4.setText("23:30 Stirile Pro Tv");
		txtpnStirilePro_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro_4.setBounds(10, 198, 106, 19);
		frame.getContentPane().add(txtpnStirilePro_4);
		
		JTextPane txtpnFuriaUnui = new JTextPane();
		txtpnFuriaUnui.setEditable(false);
		txtpnFuriaUnui.setText("00:00 Search and Destroy");
		txtpnFuriaUnui.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnFuriaUnui.setBounds(10, 218, 136, 19);
		frame.getContentPane().add(txtpnFuriaUnui);
		
		JTextPane txtpnSuperspeedr = new JTextPane();
		txtpnSuperspeedr.setEditable(false);
		txtpnSuperspeedr.setText("02:00 Lectii de viata (R)");
		txtpnSuperspeedr.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnSuperspeedr.setBounds(10, 235, 121, 19);
		frame.getContentPane().add(txtpnSuperspeedr);
		
		JTextPane txtpnVorbesteLumea_1 = new JTextPane();
		txtpnVorbesteLumea_1.setEditable(false);
		txtpnVorbesteLumea_1.setText("03:00 Vorbeste lumea (R)");
		txtpnVorbesteLumea_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnVorbesteLumea_1.setBounds(10, 262, 136, 19);
		frame.getContentPane().add(txtpnVorbesteLumea_1);
		
		JTextPane txtpnCeSpun_1 = new JTextPane();
		txtpnCeSpun_1.setEditable(false);
		txtpnCeSpun_1.setText("05:00 Ce spun romanii (R)");
		txtpnCeSpun_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnCeSpun_1.setBounds(10, 281, 147, 19);
		frame.getContentPane().add(txtpnCeSpun_1);
		
		JTextPane txtpnStirilePro_5 = new JTextPane();
		txtpnStirilePro_5.setEditable(false);
		txtpnStirilePro_5.setText("06:00 Stirile Pro Tv");
		txtpnStirilePro_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro_5.setBounds(10, 302, 106, 19);
		frame.getContentPane().add(txtpnStirilePro_5);
		
		JTextPane txtpnImperiulLeilor = new JTextPane();
		txtpnImperiulLeilor.setText("21:30 Masterchef");
		txtpnImperiulLeilor.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnImperiulLeilor.setBounds(10, 178, 106, 19);
		frame.getContentPane().add(txtpnImperiulLeilor);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(115, 396, 67, 21);
		frame.getContentPane().add(btnNewButton);
	}

}
