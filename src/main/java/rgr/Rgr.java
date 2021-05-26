package rgr;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Rgr {
	
	public Rgr(Boolean isAdmin) {
		

		if (isAdmin==true) {
			JOptionPane.showMessageDialog(null, "Вы зашли через Админа, действует скидка!");
		}
			
		JFrame main_GUI= new JFrame("Cost install work ");
		main_GUI.setTitle("Cost install work");
		main_GUI.setBounds(600, 200,400, 530);
		main_GUI.setResizable(false);
		
		JPanel main_panel =new JPanel();
		main_panel.setLayout(null);
		main_GUI.add(main_panel);
		
		JCheckBox sale=new JCheckBox();
		sale.setBounds(230,390,150,30);
		main_panel.add(sale);
		sale.setVisible(false);
		
		if (isAdmin==true) {
			JLabel label11 = new JLabel("Панель администратора"); // Отображение текста или изображения
			label11.setBounds(120,1,200,30);
			main_panel.add(label11);
			
			main_panel.setBackground(Color.blue);
			
			JLabel labelSale = new JLabel("Скидка"); // Отображение текста или изображения
			labelSale.setBounds(20,390,150,30);
			main_panel.add(labelSale);
							
			sale.setVisible(true);
			
		}
		
			JLabel label1 = new JLabel("Вид напольного покрытия:"); // Отображение текста или изображения
			label1.setBounds(20,30,200,30);
			main_panel.add(label1);
			
			JLabel label2 = new JLabel("Вид подложки"); // Отображение текста или изображения
			label2.setBounds(20,70,150,30);
			main_panel.add(label2);
			
			JLabel label3 = new JLabel("Площадь помещения, м^2"); // Отображение текста или изображения
			label3.setBounds(20,110,170,30);
			main_panel.add(label3);
			
			JLabel label4 = new JLabel("Периметр помещения, м"); // Отображение текста или изображения
			label4.setBounds(20,150,150,30);
			main_panel.add(label4);
			
			JLabel label5 = new JLabel("Количество углов в помещении"); // Отображение текста или изображения
			label5.setBounds(20,190,200,30);
			main_panel.add(label5);
			
			JLabel label6 = new JLabel("Теплый пол"); // Отображение текста или изображения
			label6.setBounds(20,230,150,30);
			main_panel.add(label6);
			
			JLabel label7 = new JLabel("Стоимость установки покрытия"); // Отображение текста или изображения
			label7.setBounds(20,270,200,30);
			main_panel.add(label7);
			
			JLabel label8 = new JLabel("Стоимость установки подложки"); // Отображение текста или изображения
			label8.setBounds(20,310,200,30);
			main_panel.add(label8);
			
			JLabel label9 = new JLabel("Суммарная стоимость"); // Отображение текста или изображения
			label9.setBounds(20,350,200,30);
			main_panel.add(label9);
			
			JCheckBox boxfl=new JCheckBox();
			boxfl.setBounds(230,230,150,30);
			main_panel.add(boxfl);
			
			   JTextField squareTextField =new JTextField();
			   squareTextField.setBounds(230, 110, 150, 30);
			   squareTextField.addKeyListener(new KeyAdapter() {
		        	public void keyTyped(KeyEvent e) {
		        		char c=e.getKeyChar();
		        		if((c<'0')||(c>'9'))
		        			e.consume();
		        	}
				});
		        main_panel.add(squareTextField);
		        
		        JTextField perimeterTextField=new JTextField();
		        perimeterTextField.setBounds(230, 150, 150, 30);
		        perimeterTextField.addKeyListener(new KeyAdapter() {
		        	public void keyTyped(KeyEvent e) {
		        		char c=e.getKeyChar();
		        		if((c<'0')||(c>'9'))
		        			e.consume();
		        	}
				});
		        main_panel.add(perimeterTextField);
		        
		        JTextField amountAnglesTextField=new JTextField();
		        amountAnglesTextField.setBounds(230, 190, 150, 30);
		        amountAnglesTextField.addKeyListener(new KeyAdapter() {
		        	public void keyTyped(KeyEvent e) {
		        		char c=e.getKeyChar();
		        		if((c<'0')||(c>'9'))
		        			e.consume();
		        	}
				});
		        main_panel.add(amountAnglesTextField);
		        
		        JTextField field4=new JTextField();
		        field4.setBounds(230, 270, 150, 30);
		        field4.addKeyListener(new KeyAdapter() {
		        	public void keyTyped(KeyEvent e) {
		        		e.consume();
		        	}
				});
		        main_panel.add(field4);
		        
		        JTextField field5=new JTextField();
		        field5.setBounds(230, 310, 150, 30);
		        field5.addKeyListener(new KeyAdapter() {
		        	public void keyTyped(KeyEvent e) {
		        		e.consume();
		        	}
				});
		        main_panel.add(field5);
		        
		        JTextField field6=new JTextField();
		        field6.setBounds(230, 350, 150, 30);
		        field6.addKeyListener(new KeyAdapter() {
		        	public void keyTyped(KeyEvent e) {
		        		e.consume();
		        	}
				});
		        main_panel.add(field6); // поле вывода   
		
		        
	        JButton button_rachet = new JButton("Расчитать"); // добавляем кнопку
	        button_rachet.setBounds(280, 420, 100, 40);
	        main_panel.add(button_rachet);
	        ActionListener rachetListener = new ActionListener() {
/* baseprise - цена покрытия cover price - цена подложки parse - превращаем строку в число gettext - получаем текст */
				@Override
				public void actionPerformed(ActionEvent arg0) {
					try {
						Double basePrice =Double.parseDouble(field5.getText());
						Double coverPrice =Double.parseDouble(field4.getText());
						Double perimetr= Double.parseDouble(perimeterTextField.getText());
						Double square=Double.parseDouble(squareTextField.getText());
						int count_angles=Integer.parseInt(amountAnglesTextField.getText());
						Double tmp=basePrice+coverPrice;
						if(boxfl.isSelected()) {
							tmp+=490; //если выбрана установка теплого пола
							
						}
						Double price_floor=tmp*square;
						Double plintus_price= (count_angles+perimetr)*100;
						Double total_price =(price_floor+plintus_price);
						if (isAdmin==true) {
							if(sale.isSelected()) {
								total_price=total_price*0.9;
						}
						if(perimetr==0 || square==0)
	                        total_price=0.0;
						field6.setText(total_price.toString());
					}} catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Заполнены не все поля или не в неправильном формате");
						
					}
					
				}
	        	
	        	
	        	
	        };
	        button_rachet.addActionListener(rachetListener);
	        
	        
	        JButton button_exit = new JButton("Выход"); // добавляем кнопку
	        button_exit.setBounds(5, 420, 100, 40);
			main_panel.add(button_exit);
			ActionListener exitActionListener=new ListenerButton();
			button_exit.addActionListener(exitActionListener);
			
			JMenuBar menu_bar= new JMenuBar();
	        JButton menu= new JButton("Справка");
	        ActionListener infoActionListener=new Info();
	        menu.addActionListener(infoActionListener);
	        
	        
	        
	        
	        Cover laminateCover =new Cover();
	        Cover parquetCover =new Cover();
	        Cover linoleumCover= new Cover();
	        
	        laminateCover.setName("Ламинат");
	        parquetCover.setName("Паркет");
	        linoleumCover.setName("Линолеум");
	        
	        laminateCover.setPrice("200");
	        parquetCover.setPrice("490");
	        linoleumCover.setPrice("110");
	       
	        
	        
	        String[] box1 = { // добавление массива для combo box
	        		"",
					laminateCover.getName(),
					parquetCover.getName(),
					linoleumCover.getName()
			    };
	        
	        JComboBox cb1 = new JComboBox(box1); 
	        cb1.setBounds(230,30,150,30);
	        main_panel.add(cb1);
	        
	        
	        ActionListener coverBoxListener=new ActionListener() { // обработчик нажатия на combo box
	        	public void actionPerformed(ActionEvent e) {
	        	String choose= (String)cb1.getSelectedItem();
	        	switch (choose) {
	        	case "": field4.setText(""); break;
	        	case "Ламинат": field4.setText(laminateCover.getPrice()); break;
	        	case "Паркет" : field4.setText(parquetCover.getPrice());  break;
	        	case "Линолеум": field4.setText(linoleumCover.getPrice()); break;
	        	}
	        	
	        	}
	        };
	        cb1.addActionListener(coverBoxListener);
	        
	        Base corkBase =new Base();
	        Base polyurethaneBase =new Base();
	        Base plywood =new Base();
	        Base fiberboard=new Base();
	        
	        corkBase.setName("Пробковые листы");
	        polyurethaneBase.setName("Полиуретановый лист");
	        plywood.setName("Фанера");
	        fiberboard.setName("ДВП");
	        
	        corkBase.setPrice("210");
	        polyurethaneBase.setPrice("140");
	        plywood.setPrice("400");
	        fiberboard.setPrice("105");
	        
	        
	        
	        String[] box2 = { // добавление массива 
					
					"",
			        corkBase.getName(),  
			        polyurethaneBase.getName(),
			        plywood.getName(),
			        fiberboard.getName()
			    };
	        
	      
	        JComboBox cb2 = new JComboBox(box2);// комбобокс для подложки
	        cb2.setBounds(230,70,150,30);
			main_panel.add(cb2);
			  ActionListener baseBoxListener=new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						String choose=(String)cb2.getSelectedItem();
						switch (choose) {
						case "": field5.setText("");break;
						case "Пробковые листы": field5.setText(corkBase.getPrice());break;
						case "Полиуретановый лист" : field5.setText(polyurethaneBase.getPrice());break;
						case "Фанера" : field5.setText(plywood.getPrice());break;
						case "ДВП" : field5.setText(fiberboard.getPrice());break;
							
						
						}
						
					}
		        	
		        	
		        	
		        };
		       cb2.addActionListener(baseBoxListener);	
	        
	     
	       
	        
	        menu_bar.add(menu);
	        main_GUI.setJMenuBar(menu_bar);
			main_GUI.setVisible(true); 
			 
		
	}
	public static void main (String [] args) {
		try {
			Auth auth = new Auth();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Логин или пароль неверный!");
		}
		//Rgr start =new Rgr();
		
		
	}
	
}