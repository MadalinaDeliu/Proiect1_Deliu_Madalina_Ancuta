package gui.Madalina;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame3_ProTv_Duminica {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3_ProTv_Duminica window = new Frame3_ProTv_Duminica();
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
	public Frame3_ProTv_Duminica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 231, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnMasterchefr = new JTextPane();
		txtpnMasterchefr.setEditable(false);
		txtpnMasterchefr.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnMasterchefr.setText("14:00  Masterchef (R)");
		txtpnMasterchefr.setBounds(33, 91, 130, 19);
		frame.getContentPane().add(txtpnMasterchefr);
		
		JTextPane txtpnImperiulLeilor = new JTextPane();
		txtpnImperiulLeilor.setEditable(false);
		txtpnImperiulLeilor.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnImperiulLeilor.setText("16:00 Imperiul leilor (R)");
		txtpnImperiulLeilor.setBounds(33, 120, 130, 19);
		frame.getContentPane().add(txtpnImperiulLeilor);
		
		JTextPane txtpnRomaniaTe = new JTextPane();
		txtpnRomaniaTe.setEditable(false);
		txtpnRomaniaTe.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnRomaniaTe.setText("18:00 Romania, te iubesc!");
		txtpnRomaniaTe.setBounds(33, 149, 130, 19);
		frame.getContentPane().add(txtpnRomaniaTe);
		
		JTextPane txtpnStirilePro = new JTextPane();
		txtpnStirilePro.setEditable(false);
		txtpnStirilePro.setText("19:00 Stirile PRO TV");
		txtpnStirilePro.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro.setBounds(33, 178, 108, 19);
		frame.getContentPane().add(txtpnStirilePro);
		
		JTextPane txtpnSurvivorRomania = new JTextPane();
		txtpnSurvivorRomania.setEditable(false);
		txtpnSurvivorRomania.setText("20:00 Survivor Romania");
		txtpnSurvivorRomania.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnSurvivorRomania.setBounds(33, 207, 130, 19);
		frame.getContentPane().add(txtpnSurvivorRomania);
		
		JTextPane txtpnContrabanda = new JTextPane();
		txtpnContrabanda.setEditable(false);
		txtpnContrabanda.setText("23:00 Contrabanda");
		txtpnContrabanda.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnContrabanda.setBounds(33, 236, 130, 19);
		frame.getContentPane().add(txtpnContrabanda);
		
		JTextPane txtpnApropoTv = new JTextPane();
		txtpnApropoTv.setEditable(false);
		txtpnApropoTv.setText("01:15 Apropo TV (R)");
		txtpnApropoTv.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnApropoTv.setBounds(33, 265, 114, 19);
		frame.getContentPane().add(txtpnApropoTv);
		
		JTextPane txtpnElysiumr = new JTextPane();
		txtpnElysiumr.setEditable(false);
		txtpnElysiumr.setText("02:15 Elysium (R)");
		txtpnElysiumr.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnElysiumr.setBounds(33, 294, 114, 19);
		frame.getContentPane().add(txtpnElysiumr);
		
		JTextPane txtpnRomaniaTe_1 = new JTextPane();
		txtpnRomaniaTe_1.setEditable(false);
		txtpnRomaniaTe_1.setText("04:15  Romania, te iubesc! (R)");
		txtpnRomaniaTe_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnRomaniaTe_1.setBounds(33, 323, 135, 19);
		frame.getContentPane().add(txtpnRomaniaTe_1);
		
		JTextPane txtpntirilePro = new JTextPane();
		txtpntirilePro.setEditable(false);
		txtpntirilePro.setText("06:00 \u015Etirile Pro Tv");
		txtpntirilePro.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpntirilePro.setBounds(33, 381, 114, 19);
		frame.getContentPane().add(txtpntirilePro);
		
		JTextPane txtpnCeSpun = new JTextPane();
		txtpnCeSpun.setEditable(false);
		txtpnCeSpun.setText("05:00 Ce spun rom\u00E2nii (R)");
		txtpnCeSpun.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnCeSpun.setBounds(33, 352, 135, 19);
		frame.getContentPane().add(txtpnCeSpun);
		
		JTextPane txtpnStirilePro_1 = new JTextPane();
		txtpnStirilePro_1.setEditable(false);
		txtpnStirilePro_1.setText("07:00 Stirile Pro TV");
		txtpnStirilePro_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnStirilePro_1.setBounds(33, 10, 130, 19);
		frame.getContentPane().add(txtpnStirilePro_1);
		
		JTextPane txtpnDoctorDe = new JTextPane();
		txtpnDoctorDe.setEditable(false);
		txtpnDoctorDe.setText("10:00 Doctor de bine");
		txtpnDoctorDe.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnDoctorDe.setBounds(33, 39, 130, 19);
		frame.getContentPane().add(txtpnDoctorDe);
		
		JTextPane txtpnApropoTv_1 = new JTextPane();
		txtpnApropoTv_1.setEditable(false);
		txtpnApropoTv_1.setText("13:00 Apropo Tv");
		txtpnApropoTv_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtpnApropoTv_1.setBounds(33, 62, 130, 19);
		frame.getContentPane().add(txtpnApropoTv_1);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(150, 379, 67, 21);
		frame.getContentPane().add(btnNewButton);
	}
}
