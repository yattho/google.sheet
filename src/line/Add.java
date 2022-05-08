package line;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
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
        super("등록");
        GridLayout gu = new GridLayout(3,2);
        setLayout(gu);
        setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
        lblno = new Label("주문번호");
        txtno = new TextField();
        lblname = new Label("이름");
        txtname = new TextField();
        lbladdress = new Label("주소");
        txtaddress = new TextField();
        lblcontact = new Label("연락처");
        txtcontact = new TextField();
        lblcolor = new Label("색상");
        txtcolor = new TextField();
        lblamount = new Label("총수량");
        txtamount = new TextField();
        lbldate = new Label("주문일시");
        txtdate = new TextField();
        deleteBtn = new Button("등록");
        
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
				JOptionPane.showMessageDialog(null, "등록되었습니다.", "등록", JOptionPane.DEFAULT_OPTION);
			}
		});
                
        
        setSize(400, 500);
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
              (windowSize.height - frameSize.height) / 2);
        setVisible(true);
		}
   
	public static void main(String[] args) throws IOExeption {
                    new Add();        
    //   Sheets service = getSheetsService(AuthMode.OAUTH20);
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
