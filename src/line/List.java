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
        panel.add(new JLabel("주문번호를 입력하시오: "));
        field = new JTextField(10);
        panel.add(field);
        area = new JTextArea(3, 30);
        add(panel, BorderLayout.NORTH);
        add(area, BorderLayout.CENTER);
        field.addKeyListener((KeyListener) this);
        setTitle("목록");
	 
        
        
        //연동해서 저장된 데이터를 불러오는 작업
        // 데이터를 누르면 현재위치 나타내기
        // 맨위 빈카으로 주문번호 검색기능
        
        
        
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
			area.append("" + s + "문자" + c + "(코드: " + keyCode + ") "
			+ modifiers + "|n");
	}
}
