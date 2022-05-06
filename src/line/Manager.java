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
		super("관리자 로그인");
        GridLayout gu = new GridLayout(3,2);
        setLayout(gu);
		idLabel = new Label("아이디 "); 
		pwLabel = new Label("비밀번호 ");
		idText = new TextField();
		pwText = new JPasswordField();
		loginBtn = new Button("로그인");
		idpwSearchBtn = new Button("아이디/비밀번호 찾기");

		add(idLabel);
		add(pwLabel);
		add(idText);
		add(pwText);
		add(idpwSearchBtn);
		add(loginBtn);

			
		
		//로그인 버튼을 눌렀을때
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//아이디 비번 확인 테스트 코드~
				String id = idText.getText().trim();
				@SuppressWarnings("deprecation")
				String pw = pwText.getText().trim();
				
				if(id.length()==0 || pw.length()==0) {
					JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 입력 하셔야 됩니다.", "아이디나 비번을 입력!", JOptionPane.DEFAULT_OPTION);
					return;
				}
				
				if(id.equals("1234") && pw.equals("0000")) {
					JOptionPane.showMessageDialog(null, "로그인 성공", "로그인 확인!", JOptionPane.DEFAULT_OPTION);
					
					return;
					
				}
				
				JOptionPane.showMessageDialog(null, "로그인 실패", "로그인 확인!", JOptionPane.DEFAULT_OPTION);
					return;

				
			}
		});
		

		
		//아이디 비밀번호 찾기 버튼을 눌렀을때
		idpwSearchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "아이디 비번 찾기 기능~~", "아이디/비밀번호 찾기", JOptionPane.DEFAULT_OPTION);
	
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
