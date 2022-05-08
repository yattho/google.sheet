package line;
import java.awt.*;
import javax.swing.*;

public class Location extends  JFrame{
    private static final long serialVersionUID = 1L;

	Location(){
        super("현위치"); //타이틀
        JPanel jPanel = new JPanel();



        add(jPanel);
        
        
        
        
        //연동된 데이터로 저장된 위치를 파악
        
        
        
		setSize(350,150);
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
              (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setVisible(true);
		}
   

	public static void main(String[] args) throws IOExeption {
               new Location();          
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
