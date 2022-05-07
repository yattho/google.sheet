package line;
//
//public class Buyer extends  JFrame{
//    private static final long serialVersionUID = 1L;
//
//	Buyer(){
//    	super("제품 위치 검색"); //타이틀
//        JPanel jPanel = new JPanel(new GridLayout(3, 2));
//    	JLabel idLabel = new JLabel("주문자 번호 ");
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
//                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setVisible(true);
//		}
//	}
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.io.*;
import java.util.*;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;


public class Buyer extends JFrame{    
    private static final long serialVersionUID = 1L;
	 Label lblId;
     TextField txtId;
     Button checkBtn;
     
     Buyer(){
    	 super("제품 위치 검색");
          GridLayout gu = new GridLayout(3,2);
          setLayout(gu);
          lblId = new Label("주문자 번호");
          txtId = new TextField();
          checkBtn = new Button("검색");

         
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
     
	public static void main(String[] args) throws IOExeption {
                     new Buyer();    
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
