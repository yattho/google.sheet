package line;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

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
   
	public static void main(String[] args) {
        new Choose();
    }
}