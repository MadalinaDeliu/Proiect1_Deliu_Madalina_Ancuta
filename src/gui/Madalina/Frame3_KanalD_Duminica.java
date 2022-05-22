package gui.Madalina;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame3_KanalD_Duminica {
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3_KanalD_Duminica window = new Frame3_KanalD_Duminica();
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
	public Frame3_KanalD_Duminica() {
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
		txtpnSportDieta.setText("07:30 Sport, dieta si o vedeta");
		txtpnSportDieta.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnSportDieta.setEditable(false);
		txtpnSportDieta.setBounds(10, 10, 146, 19);
		frame.getContentPane().add(txtpnSportDieta);
		
		JTextPane txtpnMireasaDin = new JTextPane();
		txtpnMireasaDin.setText("08:00 Mireasa din Istabul");
		txtpnMireasaDin.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnMireasaDin.setEditable(false);
		txtpnMireasaDin.setBounds(10, 41, 146, 19);
		frame.getContentPane().add(txtpnMireasaDin);
		
		JTextPane txtpnRoventurar = new JTextPane();
		txtpnRoventurar.setText("10:30 ROventura (R)");
		txtpnRoventurar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnRoventurar.setEditable(false);
		txtpnRoventurar.setBounds(10, 70, 146, 19);
		frame.getContentPane().add(txtpnRoventurar);
		
		JTextPane txtpnApelLa = new JTextPane();
		txtpnApelLa.setText("11:30 Apel la consilier");
		txtpnApelLa.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnApelLa.setEditable(false);
		txtpnApelLa.setBounds(10, 99, 146, 19);
		frame.getContentPane().add(txtpnApelLa);
		
		JTextPane txtpnStirileKanal = new JTextPane();
		txtpnStirileKanal.setText("12:00 Stirile Kanal D");
		txtpnStirileKanal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirileKanal.setEditable(false);
		txtpnStirileKanal.setBounds(10, 128, 146, 19);
		frame.getContentPane().add(txtpnStirileKanal);
		
		JTextPane txtpnInCautarea = new JTextPane();
		txtpnInCautarea.setText("13:00 In cautarea adevarului (R)");
		txtpnInCautarea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnInCautarea.setEditable(false);
		txtpnInCautarea.setBounds(10, 157, 146, 19);
		frame.getContentPane().add(txtpnInCautarea);
		
		JTextPane txtpnAstaiRomania = new JTextPane();
		txtpnAstaiRomania.setText("14:30 Asta-i Romania!");
		txtpnAstaiRomania.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnAstaiRomania.setEditable(false);
		txtpnAstaiRomania.setBounds(10, 186, 146, 19);
		frame.getContentPane().add(txtpnAstaiRomania);
		
		JTextPane txtpnCasaIubirii = new JTextPane();
		txtpnCasaIubirii.setText("16:00 Casa iubirii");
		txtpnCasaIubirii.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnCasaIubirii.setEditable(false);
		txtpnCasaIubirii.setBounds(10, 215, 146, 19);
		frame.getContentPane().add(txtpnCasaIubirii);
		
		JTextPane txtpnStirileKanal_1 = new JTextPane();
		txtpnStirileKanal_1.setText("18:00 Stirile Kanal D");
		txtpnStirileKanal_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirileKanal_1.setEditable(false);
		txtpnStirileKanal_1.setBounds(10, 244, 146, 19);
		frame.getContentPane().add(txtpnStirileKanal_1);
		
		JTextPane txtpnCasaIubirii_1 = new JTextPane();
		txtpnCasaIubirii_1.setText("19:00 Casa iubirii");
		txtpnCasaIubirii_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnCasaIubirii_1.setEditable(false);
		txtpnCasaIubirii_1.setBounds(10, 273, 146, 19);
		frame.getContentPane().add(txtpnCasaIubirii_1);
		
		JTextPane txtpnStradaSperantei = new JTextPane();
		txtpnStradaSperantei.setText("20:00 Strada sperantei");
		txtpnStradaSperantei.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStradaSperantei.setEditable(false);
		txtpnStradaSperantei.setBounds(10, 302, 146, 19);
		frame.getContentPane().add(txtpnStradaSperantei);
		
		JTextPane txtpnDe = new JTextPane();
		txtpnDe.setText("21:30 40 de intrebari cu Denise Rifai");
		txtpnDe.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnDe.setEditable(false);
		txtpnDe.setBounds(10, 331, 191, 19);
		frame.getContentPane().add(txtpnDe);
		
		JTextPane txtpnStirileKanal_2 = new JTextPane();
		txtpnStirileKanal_2.setText("00:00 Stirile Kanal D");
		txtpnStirileKanal_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirileKanal_2.setEditable(false);
		txtpnStirileKanal_2.setBounds(10, 360, 146, 19);
		frame.getContentPane().add(txtpnStirileKanal_2);
		
		JTextPane txtpnAstaiRomania_1 = new JTextPane();
		txtpnAstaiRomania_1.setText("01:00 Asta-i Romania!");
		txtpnAstaiRomania_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnAstaiRomania_1.setEditable(false);
		txtpnAstaiRomania_1.setBounds(10, 387, 146, 19);
		frame.getContentPane().add(txtpnAstaiRomania_1);
		
		JTextPane txtpnCasaIubirii_2 = new JTextPane();
		txtpnCasaIubirii_2.setText("02:30 Casa iubirii (R)");
		txtpnCasaIubirii_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnCasaIubirii_2.setEditable(false);
		txtpnCasaIubirii_2.setBounds(10, 416, 146, 19);
		frame.getContentPane().add(txtpnCasaIubirii_2);
		
		JTextPane txtpnPastilaDe = new JTextPane();
		txtpnPastilaDe.setText("04:15 Pastila de ras (R)");
		txtpnPastilaDe.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnPastilaDe.setEditable(false);
		txtpnPastilaDe.setBounds(10, 446, 146, 19);
		frame.getContentPane().add(txtpnPastilaDe);
		
		JTextPane txtpnStirileKanal_3 = new JTextPane();
		txtpnStirileKanal_3.setText("04:30 Stirile Kanal D (R)");
		txtpnStirileKanal_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirileKanal_3.setEditable(false);
		txtpnStirileKanal_3.setBounds(10, 475, 146, 19);
		frame.getContentPane().add(txtpnStirileKanal_3);
		
		JTextPane txtpnRoventura = new JTextPane();
		txtpnRoventura.setText("05:30 ROventura (R)");
		txtpnRoventura.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnRoventura.setEditable(false);
		txtpnRoventura.setBounds(182, 10, 146, 19);
		frame.getContentPane().add(txtpnRoventura);
		
		JTextPane txtpnTeleshoping = new JTextPane();
		txtpnTeleshoping.setText("06:30 Teleshopping");
		txtpnTeleshoping.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnTeleshoping.setEditable(false);
		txtpnTeleshoping.setBounds(182, 41, 146, 19);
		frame.getContentPane().add(txtpnTeleshoping);
		
		JTextPane txtpnPastilaDe_1 = new JTextPane();
		txtpnPastilaDe_1.setText("06:45 Pastila de ras (R)");
		txtpnPastilaDe_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnPastilaDe_1.setEditable(false);
		txtpnPastilaDe_1.setBounds(182, 70, 146, 19);
		frame.getContentPane().add(txtpnPastilaDe_1);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(192, 473, 67, 21);
		frame.getContentPane().add(btnNewButton);
	}

}
