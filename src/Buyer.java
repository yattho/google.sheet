package line;
//
//public class Buyer extends  JFrame{
//    private static final long serialVersionUID = 1L;
//
//	Buyer(){
//    	super("��ǰ ��ġ �˻�"); //Ÿ��Ʋ
//        JPanel jPanel = new JPanel(new GridLayout(3, 2));
//    	JLabel idLabel = new JLabel("�ֹ��� ��ȣ ");
//    	JTextField idText = new JTextField();
//
//    	
//    	add(jPanel);
//    	add(idLabel);
//    	add(idText);
//    	
//
//        setSize(350, 150);
//        this.setLocationRelativeTo(null);		
//		
//		this.setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
//
//
//        Dimension frameSize = getSize();
//        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
//        setLocation((windowSize.width - frameSize.width) / 2,
//                (windowSize.height - frameSize.height) / 2); //ȭ�� �߾ӿ� ����
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setVisible(true);
//		}
//	}
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
 
public class Buyer extends JFrame{    
    private static final long serialVersionUID = 1L;
	 Label lblId;
     TextField txtId;
     Button checkBtn;
     
     Buyer(){
    	 super("��ǰ ��ġ �˻�");
          GridLayout gu = new GridLayout(3,2);
          setLayout(gu);
          lblId = new Label("�ֹ��� ��ȣ");
          txtId = new TextField();
          checkBtn = new Button("�˻�");

         
          add(lblId);
          add(txtId);
          add(checkBtn);
          
         
          checkBtn.addActionListener(new ActionListener() {
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				new Location();
  				setVisible(false);
  			}
  		});
          
          
          
          setSize(150, 200);
          Dimension frameSize = getSize();
          Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
          setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setVisible(true);
     }
     
	public static void main(String[] args) {
          new Buyer();
     }
}