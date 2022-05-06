package line;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame{
	Container con = getContentPane();
	private static final long serialVersionUID = 1L;
	static JPanel loginPanel = new JPanel(new GridLayout(3, 2));
	private JButton BuyerSearchBtn = new JButton("������");
	private JButton loginBtn = new JButton("������");
	

	public Login() {
		super("����� ���� �ý���");
		setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		
		this.setContentPane(loginPanel);
		add(Box.createVerticalStrut(1));
		loginPanel.add(BuyerSearchBtn);
		loginPanel.add(loginBtn);
		
		//���� ������ â ��� ���� setSize�� ���� ���־�� ���������� �������� ��� ������ ��!
		setSize(370, 300);
        setVisible(true);
		this.setLocationRelativeTo(null);		
		
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		//������ ��ư ������ ��
		BuyerSearchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Buyer();
				setVisible(false);
			}
		});
		
		//������ ��ư ������ ��
		loginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Manager();
				setVisible(false);			
			}
		});
	}
		
		public static void main(String[] args) {
			new Login();
		
		}
	}

		