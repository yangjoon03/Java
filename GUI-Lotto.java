package final_study;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Arrays;



class LottoFrame extends JFrame implements ActionListener{
	JTextArea jta;
	Random rand = new Random();
	JButton jb;
	public LottoFrame() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		
		
		jb = new JButton("로또 번호 추첨하기");
		jb.addActionListener(this);
		
		jta = new JTextArea();
		jta.setEditable(false);
		
		ct.add(jta);
		ct.add(jb);
		
		
		setSize(300,300);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jb) {
			RandLotto();
		}
		
		
		
	}

  //조건 while,for만 이용
	private void RandLotto() {
		int num[] = new int[6];
		boolean toggle = true;
		int count = 0;
		while(count != 6){
			int rand_num = rand.nextInt(45) + 1;
			for(int i = 0;i<count;i++) {
				toggle= true;
				if(num[i] == rand_num) {
				toggle = false;
					break;
				}
			}
			if(toggle) {
				num[count] = rand_num;
				count++;
			}
		}
		Arrays.sort(num,0,4);
		jta.setText("");
		
		for(int i = 0;i<5;i++) {
	        jta.append(num[i] + " ");
		}
		jta.append("보너스 번호 : "+ num[5]);
		
		
		
	}
	
}


public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LottoFrame();
	}

}
