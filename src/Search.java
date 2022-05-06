package line;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Search extends  JFrame{
    private static final long serialVersionUID = 1L;
	 Label lblId;
     TextField txtId;
     Button searchBtn;

     Search(){
        super("검색");
        GridLayout gu = new GridLayout(3,2);
        setLayout(gu);
        lblId = new Label("주문자 번호");
        txtId = new TextField();
        searchBtn = new Button("확인");
        
        add(lblId);
        add(txtId);
        add(searchBtn);

        
        
        searchBtn.addActionListener(new ActionListener() {
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				new Location();
  				setVisible(false);
				
			}
		});
        
		setSize(350,150);
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
              (windowSize.height - frameSize.height) / 2);
        setVisible(true);
		}
   
	public static void main(String[] args) {
        new Search();
    }
}