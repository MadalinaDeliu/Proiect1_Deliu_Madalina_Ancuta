package gui.Madalina;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;

public class Frame3_KanalD_Vineri {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3_KanalD_Vineri window = new Frame3_KanalD_Vineri();
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
	public Frame3_KanalD_Vineri() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 372, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnSportDieta = new JTextPane();
		txtpnSportDieta.setText("07:00 Stirile Kanal D");
		txtpnSportDieta.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnSportDieta.setEditable(false);
		txtpnSportDieta.setBounds(10, 10, 146, 19);
		frame.getContentPane().add(txtpnSportDieta);
		
		JTextPane txtpnMireasaDin = new JTextPane();
		txtpnMireasaDin.setText("08:00 Dimineata cu noi");
		txtpnMireasaDin.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnMireasaDin.setEditable(false);
		txtpnMireasaDin.setBounds(10, 41, 146, 19);
		frame.getContentPane().add(txtpnMireasaDin);
		
		JTextPane txtpnRoventurar = new JTextPane();
		txtpnRoventurar.setText("10:00 Casa iubirii");
		txtpnRoventurar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnRoventurar.setEditable(false);
		txtpnRoventurar.setBounds(10, 70, 146, 19);
		frame.getContentPane().add(txtpnRoventurar);
		
		JTextPane txtpnApelLa = new JTextPane();
		txtpnApelLa.setText("12:00 Stirile Kanal D");
		txtpnApelLa.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnApelLa.setEditable(false);
		txtpnApelLa.setBounds(10, 99, 146, 19);
		frame.getContentPane().add(txtpnApelLa);
		
		JTextPane txtpnStirileKanal = new JTextPane();
		txtpnStirileKanal.setText("13:00 In cautarea adevarului");
		txtpnStirileKanal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirileKanal.setEditable(false);
		txtpnStirileKanal.setBounds(10, 128, 146, 19);
		frame.getContentPane().add(txtpnStirileKanal);
		
		JTextPane txtpnInCautarea = new JTextPane();
		txtpnInCautarea.setText("15:00 Teo Show");
		txtpnInCautarea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnInCautarea.setEditable(false);
		txtpnInCautarea.setBounds(10, 157, 146, 19);
		frame.getContentPane().add(txtpnInCautarea);
		
		JTextPane txtpnAstaiRomania = new JTextPane();
		txtpnAstaiRomania.setText("17:00 Casa iubirii");
		txtpnAstaiRomania.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnAstaiRomania.setEditable(false);
		txtpnAstaiRomania.setBounds(10, 186, 146, 19);
		frame.getContentPane().add(txtpnAstaiRomania);
		
		JTextPane txtpnCasaIubirii = new JTextPane();
		txtpnCasaIubirii.setText("19:00 Stirile Kanal D");
		txtpnCasaIubirii.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnCasaIubirii.setEditable(false);
		txtpnCasaIubirii.setBounds(10, 215, 146, 19);
		frame.getContentPane().add(txtpnCasaIubirii);
		
		JTextPane txtpnStirileKanal_1 = new JTextPane();
		txtpnStirileKanal_1.setText("20:00 Ma numesc Zuleya");
		txtpnStirileKanal_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirileKanal_1.setEditable(false);
		txtpnStirileKanal_1.setBounds(10, 244, 146, 19);
		frame.getContentPane().add(txtpnStirileKanal_1);
		
		JTextPane txtpnCasaIubirii_1 = new JTextPane();
		txtpnCasaIubirii_1.setText("22:30 Jocul cuvintelor cu Dan Negru");
		txtpnCasaIubirii_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnCasaIubirii_1.setEditable(false);
		txtpnCasaIubirii_1.setBounds(10, 273, 191, 19);
		frame.getContentPane().add(txtpnCasaIubirii_1);
		
		JTextPane txtpnStradaSperantei = new JTextPane();
		txtpnStradaSperantei.setText("00:30 Stirile Kanal  D (R)");
		txtpnStradaSperantei.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStradaSperantei.setEditable(false);
		txtpnStradaSperantei.setBounds(10, 302, 146, 19);
		frame.getContentPane().add(txtpnStradaSperantei);
		
		JTextPane txtpnDe = new JTextPane();
		txtpnDe.setText("01:00 Ma numesc Zuleya (R)");
		txtpnDe.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnDe.setEditable(false);
		txtpnDe.setBounds(10, 331, 191, 19);
		frame.getContentPane().add(txtpnDe);
		
		JTextPane txtpnStirileKanal_2 = new JTextPane();
		txtpnStirileKanal_2.setText("04:00 Pastila de ras (R)");
		txtpnStirileKanal_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirileKanal_2.setEditable(false);
		txtpnStirileKanal_2.setBounds(10, 360, 146, 19);
		frame.getContentPane().add(txtpnStirileKanal_2);
		
		JTextPane txtpnAstaiRomania_1 = new JTextPane();
		txtpnAstaiRomania_1.setText("04:15 Stirile Kanal D (R)");
		txtpnAstaiRomania_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnAstaiRomania_1.setEditable(false);
		txtpnAstaiRomania_1.setBounds(10, 387, 146, 19);
		frame.getContentPane().add(txtpnAstaiRomania_1);
		
		JTextPane txtpnCasaIubirii_2 = new JTextPane();
		txtpnCasaIubirii_2.setText("05:00 In cautarea adevarului (R)");
		txtpnCasaIubirii_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnCasaIubirii_2.setEditable(false);
		txtpnCasaIubirii_2.setBounds(10, 416, 146, 19);
		frame.getContentPane().add(txtpnCasaIubirii_2);
		
		JTextPane txtpnPastilaDe = new JTextPane();
		txtpnPastilaDe.setText("06:30 Teleshopping");
		txtpnPastilaDe.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnPastilaDe.setEditable(false);
		txtpnPastilaDe.setBounds(10, 446, 146, 19);
		frame.getContentPane().add(txtpnPastilaDe);
		
		JTextPane txtpnStirileKanal_3 = new JTextPane();
		txtpnStirileKanal_3.setText("06:45 Pastila de ras (R)");
		txtpnStirileKanal_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirileKanal_3.setEditable(false);
		txtpnStirileKanal_3.setBounds(10, 475, 146, 19);
		frame.getContentPane().add(txtpnStirileKanal_3);
	}

}
