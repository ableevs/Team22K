package rgr;
import static org.junit.Assert.assertNotNull;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import  org.junit.Test;

public class InfoTest {

	@Test
	public void test() {
		
		JFrame info_pane = new JFrame(); // Создание графического окна
		info_pane.setTitle("Информация");
		info_pane.setBounds(800, 300, 500, 300);
		info_pane.setResizable(false); // Фиксированный размер окна
		
		JPanel sec_panel = new JPanel(); // Панель - используется для организации компонентов в окне
        sec_panel.setLayout(null); // Устанавливается менеджер компоновки
        info_pane.add(sec_panel);
        
        // Добавляются члены группы
        JLabel text = new JLabel("Номера зачетных книжек ");
        text.setBounds(30, 0, 400, 30);
        JLabel moder = new JLabel("Модератор: Ахметов Марсель Булатович - 19130148");
        moder.setBounds(30, 30, 400, 30);
        JLabel first = new JLabel("Первый участник: Аблеев Шамиль Ильдарович - 19130607");
        first.setBounds(30, 60, 400, 30);
        JLabel second = new JLabel("Второй участник: Ибатуллина Алина Ильшатовна - 19130642");
        second.setBounds(30, 90, 400, 30);
        JLabel third = new JLabel("Третий участник: Шаихов Халил Ильясович - 19130163");
        third.setBounds(30, 120, 400, 30);
        
        // Кнопка возврата
        JButton button_back = new JButton("Назад");
        button_back.setBounds(270, 200, 100, 40);
        button_back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                info_pane.dispose(); // Закрытие окна информации
            }
        });
        
        sec_panel.add(button_back);
        sec_panel.add(text);
        sec_panel.add(moder);
        sec_panel.add(first);
        sec_panel.add(second);
        sec_panel.add(third);
        info_pane.setVisible(true);
        assertNotNull(info_pane);
        info_pane.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
