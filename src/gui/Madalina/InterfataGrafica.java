package gui.Madalina;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.peer.FramePeer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InterfataGrafica {
		 public void Frame() {
			   JFrame frame = new JFrame("My First GUI");
		       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		       frame.setSize(1000,800);
		       JButton button1 = new JButton ("Butonul 1");
		       JButton button2 = new JButton ("Butonul 2");
		       frame.getContentPane().add(button1);
		       frame.getContentPane().add(button2);
		       frame.setVisible(true);
			    }

}


