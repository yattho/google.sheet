package line;
import java.awt.*;
import javax.swing.*;

public class Location extends  JFrame{
    private static final long serialVersionUID = 1L;

	Location(){
        super("����ġ"); //Ÿ��Ʋ
        JPanel jPanel = new JPanel();



        add(jPanel);
        
        
        
        
        //������ �����ͷ� ����� ��ġ�� �ľ�
        
        
        
		setSize(350,150);
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
              (windowSize.height - frameSize.height) / 2); //ȭ�� �߾ӿ� ����
        setVisible(true);
		}
   
	public static void main(String[] args) {
        new Location();
    }
}