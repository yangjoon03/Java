import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class SignUpForm extends JFrame implements ActionListener{
	JTextField jtf;
    JRadioButton[] jr = new JRadioButton[2];
    JCheckBox[] jcb = new JCheckBox[5];
    JTextArea jta;
    JLabel result;
	
	public SignUpForm() {
		//이름 입력
		JLabel NameLabel = new JLabel("이름");
		jtf = new JTextField(10);
		
			
		//성별
		JLabel GenderLabel = new JLabel("성별");
		JPanel GenderPanel = new JPanel();

		jr = new JRadioButton[2];
		String[] Gender = {"남자","여자"};
		ButtonGroup gb = new ButtonGroup();
		for(int i =0;i<Gender.length;i++) {
			jr[i] = new JRadioButton(Gender[i]);
			GenderPanel.add(jr[i]);
			gb.add(jr[i]);
			
		}
		
		//관심사
		JLabel HobbyLabel = new JLabel("관심사");
		JPanel HobbyPanel = new JPanel();
		jcb = new JCheckBox[5];
		String[] hobby = {"축구","야구","피구","게임","농구"};
		for(int i =0;i<hobby.length;i++) {
			jcb[i] = new JCheckBox(hobby[i]);
			HobbyPanel.add(jcb[i]);
		}
		
		//자기 소개
		JLabel SelfIntroductionLabel = new JLabel("자기소개");
		jta = new JTextArea();
		
		//결과 버튼
		JButton jtb = new JButton("제출");
		jtb.addActionListener(this);
		//결과 출력
		result = new JLabel();
		
		
		
		//정렬
		NameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GenderLabel.setHorizontalAlignment(SwingConstants.CENTER);
		HobbyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		SelfIntroductionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		//레이아웃
		setLayout(new GridLayout(0,1));
		add(NameLabel);
		add(jtf);
		add(GenderLabel);
		add(GenderPanel);
		add(HobbyLabel);
		add(HobbyPanel);
		add(SelfIntroductionLabel);
		add(jta);
		add(jtb);
		add(result);
		
		
		setSize(500,500);
		setVisible(true);
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand()=="제출") {
			String s ="이름 : ";
			s += jtf.getText();
			s+=", 성별 : ";
			for (int i = 0; i < jr.length; i++) {
	            if (jr[i].isSelected()==true) {
	                s += jr[i].getText();
	                break;
	            }
	        }
			s+=", 관심사 :";
			for (int i = 0; i < jcb.length; i++) {
	            if (jcb[i].isSelected()==true) {
	                s += jcb[i].getText()+",";
	                
	            }
	        }
			s+=" 자기소개 : ";
			s+=jta.getText();
			result.setText(s);
		}
			
		

	}
		
}
	
	


public class SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SignUpForm();

	}

}
