package line;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Add extends  JFrame{
	Container con = getContentPane();
    private static final long serialVersionUID = 1L;
	 Label lblno;
	 TextField txtno;
	 Label lblname;
	 TextField txtname;
	 Label lbladdress;
	 TextField txtaddress;
	 Label lblcontact;
	 TextField txtcontact;
	 Label lblcolor;
	 TextField txtcolor;
	 Label lblamount;
	 TextField txtamount;
	 Label lbldate;
	 TextField txtdate;
     Button deleteBtn;
    
	Add(){
        super("���");
        GridLayout gu = new GridLayout(3,2);
        setLayout(gu);
        setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
        lblno = new Label("�ֹ���ȣ");
        txtno = new TextField();
        lblname = new Label("�̸�");
        txtname = new TextField();
        lbladdress = new Label("�ּ�");
        txtaddress = new TextField();
        lblcontact = new Label("����ó");
        txtcontact = new TextField();
        lblcolor = new Label("����");
        txtcolor = new TextField();
        lblamount = new Label("�Ѽ���");
        txtamount = new TextField();
        lbldate = new Label("�ֹ��Ͻ�");
        txtdate = new TextField();
        deleteBtn = new Button("���");
        
        add(lblno);
        add(txtno);
        add(lblname);
        add(txtname);
        add(lbladdress);
        add(txtaddress);
        add(lblcontact);
        add(txtcontact);
        add(lblcolor);
        add(txtcolor);
        add(lblamount);
        add(txtamount);
        add(lbldate);
        add(txtdate);
        add(deleteBtn);
        
        deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "��ϵǾ����ϴ�.", "���", JOptionPane.DEFAULT_OPTION);
			}
		});
                
        
        setSize(400, 500);
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
              (windowSize.height - frameSize.height) / 2);
        setVisible(true);
		}
   
	public static void main(String[] args) {
        new Add();
    }
}