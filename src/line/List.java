package line;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class List extends  JFrame implements KeyListener{
    private static final long serialVersionUID = 1L;
    JPanel panel;
    JTextField field;
    JTextArea area;
    
	List(){
        panel = new JPanel(new GridLayout(0, 2));
        panel.add(new JLabel("�ֹ���ȣ�� �Է��Ͻÿ�: "));
        field = new JTextField(10);
        panel.add(field);
        area = new JTextArea(3, 30);
        add(panel, BorderLayout.NORTH);
        add(area, BorderLayout.CENTER);
        field.addKeyListener((KeyListener) this);
        setTitle("���");
	 
        
        
        //�����ؼ� ����� �����͸� �ҷ����� �۾�
        // �����͸� ������ ������ġ ��Ÿ����
        // ���� ��ī���� �ֹ���ȣ �˻����
        
        
        
        setSize(400, 500);
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
              (windowSize.height - frameSize.height) / 2);
        setVisible(true);
		}
   
	public static void main(String[] args) {
        new List();
    }
	
	public void keyTyped(KeyEvent e) {
		display(e, "Key Typed");
	}
	public void keyPressed(KeyEvent e) {
		display(e, "Key pressed");
	}
	public void keyReleased(KeyEvent e) {
		display(e, "Key Released");
	}
	protected void display(KeyEvent e, String s) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = "Alt: " + e.isAltDown() + "Ctrl: "
			+ e.isControlDown() + "Shift: " + e.isShiftDown();
			area.append("" + s + "����" + c + "(�ڵ�: " + keyCode + ") "
			+ modifiers + "|n");
	}
}
