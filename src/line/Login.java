package line;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame{
	Container con = getContentPane();
	private static final long serialVersionUID = 1L;
	static JPanel loginPanel = new JPanel(new GridLayout(3, 2));
	private JButton BuyerSearchBtn = new JButton("구매자");
	private JButton loginBtn = new JButton("관리자");
	

	public Login() {
		super("입출력 관리 시스템");
		setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		
		this.setContentPane(loginPanel);
		add(Box.createVerticalStrut(1));
		loginPanel.add(BuyerSearchBtn);
		loginPanel.add(loginBtn);
		
		//현재 프레임 창 가운데 정렬 setSize를 먼저 해주어야 정상적으로 프레임이 가운데 정렬이 됨!
		setSize(370, 300);
        setVisible(true);
		this.setLocationRelativeTo(null);		
		
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		//구매자 버튼 눌렀을 때
		BuyerSearchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Buyer();
				setVisible(false);
			}
		});
		
		//관리자 버튼 눌렀을 때
		loginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Manager();
				setVisible(false);			
			}
		});
	}
		
	public static void main(String[] args) throws IOExeption {
                        
       Sheets service = getSheetsService(AuthMode.OAUTH20);
       Sheets service = getSheetsService(AuthMode.SERVICE_ACCOUNT);

       String spreadsheetId = "1A1SXyBEA4zfDuUdg6dN-tV52OENYmvnka9rv8ivp6xY";
       
       String range = "A3:A11";
       ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
      List<List<Object>> values = response.getValues();
      if (values == null || values.size() == 0) { 
     	System.out.println("No data found."); 
      } else { 
      		for (List row : values) { 
      			if (row.size() > 0) { 
      				System.out.println(row.get(0).toString());
      				}	
      			}
	         }
	    }
	}
	

		
