package line;
import java.awt.*;
import javax.swing.*;

public class Location extends  JFrame{
    private static final long serialVersionUID = 1L;

	Location(){
        super("현위치"); //타이틀
        JPanel jPanel = new JPanel();



        add(jPanel);
        
        
        
        
        //연동된 데이터로 저장된 위치를 파악
        
        
        
		setSize(350,150);
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
              (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setVisible(true);
		}
   
	public static void main(String[] args) {
        new Location();
    }
}