import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class NotePadArea extends JPanel {
    public NotePadArea() {
    	JTextArea textarea = new JTextArea(20, 40);
        JScrollPane scrollPane = new JScrollPane(textarea);
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
    }
}

class NotePadMenu extends JFrame implements ActionListener{
	JMenuItem newfile;
	JTabbedPane jtp;
	protected int notepadCount=0;
	public NotePadMenu() {
		JMenuBar jmb = new JMenuBar();
		
		JMenu fileMenu = new JMenu("편집");
		newfile = new JMenuItem("메모 추가");
		newfile.addActionListener(this);
		
		
		fileMenu.add(newfile);
		jmb.add(fileMenu);
		
		
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		jtp = new JTabbedPane();
		jtp.addTab("노트("+notepadCount+")", new NotePadArea());
		ct.add(jtp);
		
		
		setJMenuBar(jmb);
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newfile) {
        	notepadCount++;
            jtp.addTab("노트("+notepadCount+")", new NotePadArea());
        }
    }
	
}



public class NotePad {
    public static void main(String[] args) {
        new NotePadMenu();
    }
}
