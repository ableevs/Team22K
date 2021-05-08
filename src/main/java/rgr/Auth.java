package rgr;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Auth {
	public Auth() {
		
		JFrame main_auth= new JFrame("Authorisation ");
		main_auth.setTitle("Authorisation");
		main_auth.setBounds(400,200,400, 230);
		main_auth.setResizable(false);
		
		JPanel auth_panel =new JPanel();
		auth_panel.setLayout(null);
		main_auth.add(auth_panel);
		
		JLabel login = new JLabel("Login"); // Отображение текста или изображения
		login.setBounds(40,50,310,30);
		auth_panel.add(login);
		JLabel password = new JLabel("Password"); // Отображение текста или изображения
		password.setBounds(40,90,350,30);
		auth_panel.add(password);
		
		        JTextField field5=new JTextField();
	        field5.setBounds(230, 50, 150, 30);
	     	        auth_panel.add(field5);
	        
	        JPasswordField field6 =new JPasswordField();
	        field6.setBounds(230, 90, 150, 30);
	       	        auth_panel.add(field6);
	       	        	       	        
	        JButton button_auth = new JButton("Войти"); // добавляем кнопку
	        button_auth.setBounds(145, 140, 100, 40);
			auth_panel.add(button_auth);
			main_auth.setVisible(true);
			
			ActionListener authActionListener = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if (field5.getText().trim().equals(Clients.admin)  && field6.getText().trim().equals(Clients.adminPassword)) {
						Rgr rgr = new Rgr();
						main_auth.setVisible(false);
					}
					else if (field5.getText().trim().equals(Clients.dev1)  && field6.getText().trim().equals(Clients.dev1Password)) {
						Rgr rgr = new Rgr();
						main_auth.setVisible(false);
					}
					else if (field5.getText().trim().equals(Clients.dev2) && field6.getText().trim().equals(Clients.dev2Password)) {
						Rgr rgr = new Rgr();
						main_auth.setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "Логин или пароль неверный!");
					}
				}
				      
	        	

};
 button_auth.addActionListener(authActionListener);
}
}