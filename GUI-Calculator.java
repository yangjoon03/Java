package final_study;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class BMIPanel extends JPanel implements ActionListener{
	JLabel jl;
	JTextField heightField;
	JTextField weightField;
	public BMIPanel() {
		setLayout(new BorderLayout());
		jl = new JLabel("결과");
		add(jl,BorderLayout.NORTH);
		
		//키 입력 및 레이아웃 설정
		JPanel heightPanel = new JPanel(new BorderLayout());
		heightField = new JTextField(10);
		JLabel heightText = new JLabel("키 (CM)");
		heightPanel.add(heightField,BorderLayout.WEST);
		heightPanel.add(heightField,BorderLayout.CENTER);
		
		
		//몸무게 입력 및 레이아웃 설정
		JPanel weightPanel = new JPanel(new BorderLayout());
		weightField = new JTextField(10);
		JLabel weightText = new JLabel("키 (CM)");
		weightPanel.add(weightField,BorderLayout.WEST);
		weightPanel.add(weightField,BorderLayout.CENTER);
		
		//버튼
		JButton result = new JButton("결과 보기");
		result.addActionListener(this);
		
		//FlowLayout으로 배치하기.
		JPanel ContentPanel = new JPanel(new FlowLayout());
		ContentPanel.add(heightPanel);
		ContentPanel.add(weightPanel);
		ContentPanel.add(result);
		
		//BorderLayout에 배치하기
		add(ContentPanel,BorderLayout.WEST);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "결과 보기") {
			String heightText = heightField.getText();
			String weightText =	weightField.getText();
			
			double height = Double.parseDouble(heightText) / 100.0;
            double weight = Double.parseDouble(weightText);
            double bmi = weight / (height * height);
            jl.setText("결과 :"+ String.valueOf(bmi));
            
			
		}
	}
}



class CalculatorPanel extends JPanel implements ActionListener {
    JTextField jtf;

    public CalculatorPanel() {
    	setLayout(new BorderLayout());
    	jtf = new JTextField();
    	add(jtf, BorderLayout.NORTH);	//계산 완료 창
    	
    	String ButtonLabel[] = {
    			"7","8","9","/",
    			"4","5","6","*",
    			"1","2","3","-",
    			"C","0","=","+"
    	};
    	
    	JPanel number = new JPanel(new GridLayout(4,4));
    	for(int i = 0;i<ButtonLabel.length;i++) {
    		JButton jbt = new JButton(ButtonLabel[i]);
    		number.add(jbt);
    		jbt.addActionListener(this);
    		
    	}
    	add(number,BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
    	String cmd = e.getActionCommand();
    	
    	if(cmd.equals("C")) {
    		jtf.setText("");
    	}
    	else if(cmd.equals("=")) {
    		//실제 계산식 올라가야함.
    		//자바스크립트로 하면 되게 쉽게 가능하다고 함.
    	}
    	else {
    		jtf.setText(jtf.getText() + cmd);
    	}
    	
    }
}

class CaculatorMenu extends JFrame implements ActionListener {
    JMenuItem CaculatorItem;
    JMenuItem BMIItem;
    Container ct;

    public CaculatorMenu() {
        ct = getContentPane();
        ct.setLayout(new BorderLayout());

        JMenuBar jmb = new JMenuBar();
        JMenu fileMenu = new JMenu("기능");

        CaculatorItem = new JMenuItem("계산기");
        CaculatorItem.addActionListener(this);
        BMIItem = new JMenuItem("BMI");
        BMIItem.addActionListener(this);

        fileMenu.add(CaculatorItem);
        fileMenu.add(BMIItem);
        jmb.add(fileMenu);
        setJMenuBar(jmb);  // 메뉴바를 JFrame에 설정
        
        ct.add(new CalculatorPanel(), BorderLayout.CENTER);
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료 설정
    }

    public void actionPerformed(ActionEvent e) {
        ct.removeAll();  // 기존 내용 제거

        if (e.getSource() == CaculatorItem) {
            ct.add(new CalculatorPanel(), BorderLayout.CENTER); // 🔸 레이아웃이 아닌 컴포넌트 추가
        }

        if (e.getSource() == BMIItem) {
            ct.add(new BMIPanel(), BorderLayout.CENTER);
        }

        ct.revalidate();
        ct.repaint();
    }
}

public class Caculator {
    public static void main(String[] args) {
        new CaculatorMenu(); // 실행
    }
}
