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

public class Choose extends  JFrame{
	Container con = getContentPane();
	private static final long serialVersionUID = 1L;
		Button addBtn;
		Button deleteBtn;
		Button listBtn;
		Button searchBtn;
	Choose(){
        super("관리자");
        GridLayout gu = new GridLayout(3,2);
        setLayout(gu);
        addBtn = new Button("등록");
        deleteBtn = new Button("삭제");
        listBtn = new Button("목록");
        searchBtn = new Button("검색");
            
        setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
        add(addBtn); 
        add(deleteBtn);
        add(listBtn);
        add(searchBtn);
        
        addBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Add();
				setVisible(false);
			}
		});
        
        deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Delete();
				setVisible(false);
			}
		});
        
        listBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new List();
				setVisible(false);
			}
		});
        
        searchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Search();
				setVisible(false);
			}
		});
        
        
		setSize(150,350);
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
              (windowSize.height - frameSize.height) / 2);
        setVisible(true);
		}
   
	public static void main(String[] args) throws IOExeption {
                  new Choose();      
   //    Sheets service = getSheetsService(AuthMode.OAUTH20);
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
