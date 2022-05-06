package line;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Manager extends JFrame{
	private static final long serialVersionUID = 1L;
	Label idLabel;
	Label pwLabel;
    TextField idText;
    JPasswordField pwText;
    Button loginBtn;
    Button idpwSearchBtn;
    Button iBtn;
	
	Manager() {
		super("������ �α���");
        GridLayout gu = new GridLayout(3,2);
        setLayout(gu);
		idLabel = new Label("���̵� "); 
		pwLabel = new Label("��й�ȣ ");
		idText = new TextField();
		pwText = new JPasswordField();
		loginBtn = new Button("�α���");
		idpwSearchBtn = new Button("���̵�/��й�ȣ ã��");

		add(idLabel);
		add(pwLabel);
		add(idText);
		add(pwText);
		add(idpwSearchBtn);
		add(loginBtn);

			
		
		//�α��� ��ư�� ��������
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//���̵� ��� Ȯ�� �׽�Ʈ �ڵ�~
				String id = idText.getText().trim();
				@SuppressWarnings("deprecation")
				String pw = pwText.getText().trim();
				
				if(id.length()==0 || pw.length()==0) {
					JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��й�ȣ�� �Է� �ϼž� �˴ϴ�.", "���̵� ����� �Է�!", JOptionPane.DEFAULT_OPTION);
					return;
				}
				
				if(id.equals("1234") && pw.equals("0000")) {
					JOptionPane.showMessageDialog(null, "�α��� ����", "�α��� Ȯ��!", JOptionPane.DEFAULT_OPTION);
					
					return;
					
				}
				
				JOptionPane.showMessageDialog(null, "�α��� ����", "�α��� Ȯ��!", JOptionPane.DEFAULT_OPTION);
					return;

				
			}
		});
		

		
		//���̵� ��й�ȣ ã�� ��ư�� ��������
		idpwSearchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "���̵� ��� ã�� ���~~", "���̵�/��й�ȣ ã��", JOptionPane.DEFAULT_OPTION);
	
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
		new Manager();
	}
}
