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
		
		JFrame info_pane = new JFrame(); // �������� ������������ ����
		info_pane.setTitle("����������");
		info_pane.setBounds(800, 300, 500, 300);
		info_pane.setResizable(false); // ������������� ������ ����
		
		JPanel sec_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
        sec_panel.setLayout(null); // ��������������� �������� ����������
        info_pane.add(sec_panel);
        
        // ����������� ����� ������
        JLabel text = new JLabel("������ �������� ������ ");
        text.setBounds(30, 0, 400, 30);
        JLabel moder = new JLabel("���������: ������� ������� ��������� - 19130148");
        moder.setBounds(30, 30, 400, 30);
        JLabel first = new JLabel("������ ��������: ������ ������ ���������� - 19130607");
        first.setBounds(30, 60, 400, 30);
        JLabel second = new JLabel("������ ��������: ���������� ����� ���������� - 19130642");
        second.setBounds(30, 90, 400, 30);
        JLabel third = new JLabel("������ ��������: ������ ����� ��������� - 19130163");
        third.setBounds(30, 120, 400, 30);
        
        // ������ ��������
        JButton button_back = new JButton("�����");
        button_back.setBounds(270, 200, 100, 40);
        button_back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                info_pane.dispose(); // �������� ���� ����������
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
