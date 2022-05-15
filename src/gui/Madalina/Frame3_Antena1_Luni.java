package gui.Madalina;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;

public class Frame3_Antena1_Luni {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3_Antena1_Luni window = new Frame3_Antena1_Luni();
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
	public Frame3_Antena1_Luni() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 191, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnStirilePro = new JTextPane();
		txtpnStirilePro.setEditable(false);
		txtpnStirilePro.setText("08:00 Neatza cu Razvan si Dani");
		txtpnStirilePro.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro.setBounds(10, 10, 167, 19);
		frame.getContentPane().add(txtpnStirilePro);
		
		JTextPane txtpnVorbesteLumea = new JTextPane();
		txtpnVorbesteLumea.setEditable(false);
		txtpnVorbesteLumea.setText("12:00 Observator");
		txtpnVorbesteLumea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnVorbesteLumea.setBounds(10, 39, 129, 19);
		frame.getContentPane().add(txtpnVorbesteLumea);
		
		JTextPane txtpnStirilePro_1 = new JTextPane();
		txtpnStirilePro_1.setEditable(false);
		txtpnStirilePro_1.setText("14:00 Drama: Povesti de familie");
		txtpnStirilePro_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro_1.setBounds(10, 68, 167, 19);
		frame.getContentPane().add(txtpnStirilePro_1);
		
		JTextPane txtpnLectiiDe = new JTextPane();
		txtpnLectiiDe.setEditable(false);
		txtpnLectiiDe.setText("15:00 Mireasa");
		txtpnLectiiDe.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnLectiiDe.setBounds(10, 97, 106, 19);
		frame.getContentPane().add(txtpnLectiiDe);
		
		JTextPane txtpnLaMaruta = new JTextPane();
		txtpnLaMaruta.setEditable(false);
		txtpnLaMaruta.setText("17:00 Observator");
		txtpnLaMaruta.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnLaMaruta.setBounds(10, 126, 106, 19);
		frame.getContentPane().add(txtpnLaMaruta);
		
		JTextPane txtpnStirilePro_2 = new JTextPane();
		txtpnStirilePro_2.setEditable(false);
		txtpnStirilePro_2.setText("18:00 Pretul cel bun");
		txtpnStirilePro_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro_2.setBounds(10, 155, 106, 19);
		frame.getContentPane().add(txtpnStirilePro_2);
		
		JTextPane txtpnCeSpun = new JTextPane();
		txtpnCeSpun.setEditable(false);
		txtpnCeSpun.setText("19:00 Observator");
		txtpnCeSpun.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnCeSpun.setBounds(10, 184, 129, 19);
		frame.getContentPane().add(txtpnCeSpun);
		
		JTextPane txtpnStirilePro_3 = new JTextPane();
		txtpnStirilePro_3.setEditable(false);
		txtpnStirilePro_3.setText("20:30 Insula iubirii");
		txtpnStirilePro_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro_3.setBounds(10, 213, 106, 19);
		frame.getContentPane().add(txtpnStirilePro_3);
		
		JTextPane txtpnSurvivorRomania = new JTextPane();
		txtpnSurvivorRomania.setEditable(false);
		txtpnSurvivorRomania.setText("00:00 Observator");
		txtpnSurvivorRomania.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnSurvivorRomania.setBounds(10, 242, 106, 19);
		frame.getContentPane().add(txtpnSurvivorRomania);
		
		JTextPane txtpnStirilePro_4 = new JTextPane();
		txtpnStirilePro_4.setEditable(false);
		txtpnStirilePro_4.setText("00:30 Rocky");
		txtpnStirilePro_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro_4.setBounds(10, 271, 106, 19);
		frame.getContentPane().add(txtpnStirilePro_4);
		
		JTextPane txtpnFuriaUnui = new JTextPane();
		txtpnFuriaUnui.setEditable(false);
		txtpnFuriaUnui.setText("02:30 Observator");
		txtpnFuriaUnui.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnFuriaUnui.setBounds(10, 294, 106, 19);
		frame.getContentPane().add(txtpnFuriaUnui);
		
		JTextPane txtpnSuperspeedr = new JTextPane();
		txtpnSuperspeedr.setEditable(false);
		txtpnSuperspeedr.setText("03:30 Drama: Povesti de familie (R)");
		txtpnSuperspeedr.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnSuperspeedr.setBounds(10, 321, 176, 19);
		frame.getContentPane().add(txtpnSuperspeedr);
		
		JTextPane txtpnVorbesteLumea_1 = new JTextPane();
		txtpnVorbesteLumea_1.setEditable(false);
		txtpnVorbesteLumea_1.setText("04:15 Surorile");
		txtpnVorbesteLumea_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnVorbesteLumea_1.setBounds(10, 349, 129, 19);
		frame.getContentPane().add(txtpnVorbesteLumea_1);
		
		JTextPane txtpnCeSpun_1 = new JTextPane();
		txtpnCeSpun_1.setEditable(false);
		txtpnCeSpun_1.setText("05:00 Pretul cel bun (R)");
		txtpnCeSpun_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnCeSpun_1.setBounds(10, 378, 145, 19);
		frame.getContentPane().add(txtpnCeSpun_1);
		
		JTextPane txtpnStirilePro_5 = new JTextPane();
		txtpnStirilePro_5.setEditable(false);
		txtpnStirilePro_5.setText("06:00 Observator");
		txtpnStirilePro_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro_5.setBounds(10, 397, 106, 19);
		frame.getContentPane().add(txtpnStirilePro_5);
	}

}
