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

public class Delete extends  JFrame{
    private static final long serialVersionUID = 1L;
	 Label lblId;
     TextField txtId;
     Button deleteBtn;

	Delete(){
        super("삭제");
        GridLayout gu = new GridLayout(3,2);
        setLayout(gu);
        lblId = new Label("주문자 번호");
        txtId = new TextField();
        deleteBtn = new Button("확인");
        
        add(lblId);
        add(txtId);
        add(deleteBtn);

        
        
        deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "삭제되었습니다.", "삭제", JOptionPane.DEFAULT_OPTION);
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
        new Delete();
    }
}
