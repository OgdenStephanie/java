package youtube;

import java.sql.*;
import javax.swing.*;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

import java.awt.Font;
import java.awt.Frame;

import org.omg.CORBA.INITIALIZE;

public class YoutubeUI extends JApplet {
	private JTextField textField;
	private JLabel lblNewLabel;

	/**
	 * Create the applet.
	 */
	Connection connection=null;
	private JPasswordField passwordField;
	
	
	public YoutubeUI() {
		getContentPane().setBackground(SystemColor.controlShadow);
		getContentPane().setForeground(SystemColor.windowText);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("For Lecture Videos");
		lblNewLabel.setBounds(134, 56, 188, 22);
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.BOLD, 17));
		getContentPane().add(lblNewLabel);
		
		JLabel lblEnterLogin = new JLabel("USER NAME:");
		lblEnterLogin.setBounds(81, 109, 107, 21);
		lblEnterLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterLogin.setForeground(SystemColor.info);
		getContentPane().add(lblEnterLogin);
		
		textField = new JTextField();
		textField.setBounds(244, 109, 131, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setBounds(81, 136, 107, 21);
		lblPassword.setForeground(SystemColor.info);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent argo) {
				try
				{
					String query="select * from User_Login where Username=? and Password=? ";
					PreparedStatement pat= connection.prepareStatement(query);
					pat.setString(1, textField.getText());
					pat.setString(2, passwordField.getText());
					ResultSet rs=pat.executeQuery();
					int count=0;
					
					while(rs.next()){
						
						count=count+1;
						
					}
					if(count==1){
						JOptionPane.showMessageDialog(null, "Username and Password is correct");
						setVisible(false);
						Course course=new Course();
						course.setVisible(true);
						
						
						
					}
					else if(count>1)
					{
						JOptionPane.showMessageDialog(null, "Duplicate Username and Password is correct");
					}
					else{
						JOptionPane.showMessageDialog(null, "Username and Password is incorrect try again");
					}
					rs.close();
					pat.close();
					}
				
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
					
				}
				
			}
		});
		btnLogin.setBounds(173, 192, 89, 23);
		getContentPane().add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(244, 140, 131, 20);
		getContentPane().add(passwordField);
			
				
			connection=Sqlite_connection.dbConnector();	
				
				
	}


	protected Component Course() {
		// TODO Auto-generated method stub
		return null;
	}
}
