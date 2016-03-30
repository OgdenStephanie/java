package youtube;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Desktop;
import java.awt.SystemColor;
import java.awt.Font;

public class Course extends JApplet {

	/**
	 * Create the applet.
	 */
	public Course() {
		getContentPane().setBackground(SystemColor.controlShadow);
		getContentPane().setLayout(null);
		
		Button button = new Button("CS313");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
				    Desktop.getDesktop().browse(new URL("https://www.youtube.com/results?search_query=CS+313").toURI());
				} catch (Exception f) {
					
					
				}
				
			}
		});
		button.setFont(new Font("Arial Black", Font.BOLD, 19));
		button.setBounds(26, 35, 103, 57);
		getContentPane().add(button);
		
		Button button_1 = new Button("CS308");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
				    Desktop.getDesktop().browse(new URL("https://www.youtube.com/results?q=CS+308+university+course").toURI());
				} catch (Exception f) {
					
					
				}
				
			}
		});
		
		button_1.setFont(new Font("Arial Black", Font.BOLD, 19));
		button_1.setBounds(158, 35, 144, 57);
		getContentPane().add(button_1);
		
		Button button_3 = new Button("CIT262");
		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
				    Desktop.getDesktop().browse(new URL("https://www.youtube.com/results?search_query=CIT+262").toURI());
				} catch (Exception f) {
					
					
				}
				
			}
		});
		
		button_3.setFont(new Font("Arial Black", Font.BOLD, 19));
		button_3.setBounds(322, 35, 103, 57);
		getContentPane().add(button_3);
		
		Button button_4 = new Button("IDS499");
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
				    Desktop.getDesktop().browse(new URL("https://www.youtube.com/results?search_query=CS+364+university+course").toURI());
				} catch (Exception f) {
					
					
				}
				
			}
		});
		
		button_4.setFont(new Font("Arial Black", Font.BOLD, 19));
		button_4.setBounds(249, 188, 132, 57);
		getContentPane().add(button_4);
		
		Button button_2 = new Button("CS364");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
				    Desktop.getDesktop().browse(new URL("https://www.youtube.com/results?search_query=IDS+499+university+course").toURI());
				} catch (Exception f) {
					
					
				}
				
			}
		});
		button_2.setFont(new Font("Arial Black", Font.BOLD, 19));
		button_2.setBounds(63, 188, 132, 57);
		getContentPane().add(button_2);

	}
}
