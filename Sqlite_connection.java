package youtube;
import java.sql.*;
import javax.swing.*;
public class Sqlite_connection {
	Connection conn=null;
	public static Connection dbConnector()
		{
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\HERO\\workspace\\Java Applet\\youtube.sqlite");
			
			JOptionPane.showMessageDialog(null, "Connection Successful");
			
			
			return conn;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		
	}
}
