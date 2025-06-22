
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class ChatFrame extends JFrame implements ActionListener{
	JTextField jtf;
	JTextArea jta;
	
	public ChatFrame() {
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		
		//입력창
		jtf = new JTextField();
		ct.add(jtf,BorderLayout.SOUTH);
		jtf.addActionListener(this);
		
		//출력창
		jta = new JTextArea();
		jta.setEditable(false);
		ct.add(jta,BorderLayout.CENTER);
		
		
		setSize(500,300);
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String input = jtf.getText();
        jta.append("User: " + input + "\n");
        jtf.setText("");
		
	}
	
}


public class Chat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatFrame();
	}

}
