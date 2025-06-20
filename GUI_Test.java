package final_study;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;



class FirstFrame1{
	public FirstFrame1() {
		JFrame jf = new JFrame("첫 번째 GUI 프로그램");
		Container ct = jf.getContentPane();
		JButton jb = new JButton("테스트 버튼");
		ct.add(jb);
		jf.setSize(400,300);
		jf.setVisible(true);
	}
}

class FirstFrame2 extends JFrame {
	public FirstFrame2() {
		Container ct = getContentPane();
		JButton jb = new JButton("테스트 버튼");
		ct.add(jb);
		setTitle("세번째 GUI프로그램");
		setSize(400, 300);
		setVisible(true);  // 수정된 부분
	}
}


class FlowLayout1 extends JFrame {
	public FlowLayout1() {
		Container ct = getContentPane();  // 올바르게 수정됨
		FlowLayout f1 = new FlowLayout(FlowLayout.RIGHT,10,15);
		ct.setLayout(f1);
		for(int i = 0; i <15;i++) {
			ct.add(new JButton("버튼"+i));
		}
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class BorderLayout1 extends JFrame{
	public BorderLayout1() {
		Container ct = getContentPane();
		BorderLayout bl = new BorderLayout(10,10);
		ct.setLayout(bl);
		ct.add(new JButton("오른쪽"),BorderLayout.EAST);
		ct.add(new JButton("왼"),BorderLayout.WEST);
		ct.add(new JButton("위"),BorderLayout.NORTH);
		ct.add(new JButton("아래"),BorderLayout.SOUTH);
		ct.add(new JButton("중앙"),BorderLayout.CENTER);
		setTitle("보더 레이아웃");
		setSize(400,300);
		setVisible(true);
		
	}
}

class GridLayout1 extends JFrame{
	public GridLayout1() {
		Container ct = getContentPane();
		GridLayout gl = new GridLayout(4,5,10,10);
		ct.setLayout(gl);
		for(int i = 0; i <15;i++) {
			ct.add(new JButton(""+ i));
		}
		setTitle("그리드 레이아웃");
		setSize(400,300);
		setVisible(true);
		
	}
}

class JPanel1 extends JFrame{
	public JPanel1() {
		Container ct =getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(new JRadioButton("자바"));
		ct.add(new JRadioButton("자바"));
		ct.add(new JRadioButton("자바"));
		ct.add(new JButton("자바"));
		ct.add(new JButton("자바"));
		ct.add(new JButton("자바"));
		
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}

class JPanel2 extends JFrame{
	public JPanel2() {
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout(5,5));
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(5,1));
		jp1.add(new JButton("자바"));
		jp1.add(new JButton("자바"));
		jp1.add(new JButton("자바"));
		jp1.add(new JButton("자바"));
		jp1.add(new JButton("자바"));

		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(5,1));
		jp2.add(new JRadioButton("자바"));
		jp2.add(new JRadioButton("자바"));
		jp2.add(new JRadioButton("자바"));
		jp2.add(new JRadioButton("자바"));
		jp2.add(new JRadioButton("자바"));
//		jp2.add(new JRadioButton("자바"));
		
		ct.add(jp1, BorderLayout.EAST);
		ct.add(jp2,BorderLayout.WEST);
		
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
}

class Event1 extends JFrame implements ActionListener {
	JLabel jl;
    public Event1() {
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        JButton jb = new JButton("버튼");
        jl = new JLabel("버튼을 누르세요.");
        jb.addActionListener(this);
        ct.add(jb);
        ct.add(jl);
        
        setSize(400,300);
		setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e) {
    	jl.setText("잘했다");
    	
    }
}

class Event2 extends JFrame {
    JLabel jl;
    JButton jb1, jb2;

    public Event2() {
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());

        jb1 = new JButton("사랑");
        jb2 = new JButton("행복");
        jl = new JLabel("버튼을 누르세요.");

        jb1.addActionListener(new EventProcess());
        jb2.addActionListener(new EventProcess());

        ct.add(jb1);
        ct.add(jb2);
        ct.add(jl);

        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 추가
        setVisible(true);
    }

    private class EventProcess implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jl.setText(e.getActionCommand());
        }
    }
}

class EventClass implements ActionListener{
	JLabel jl;
	public EventClass(JLabel jl) {
		this.jl = jl;
	}
	public void actionPerformed(ActionEvent e) {
		jl.setText(e.getActionCommand());
	}
	
}

class Event3 extends JFrame{
	JLabel jl;
	JButton jb1,jb2;
	public Event3() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		jb1 = new JButton("사랑합니다.");
		jb2 = new JButton("행복합니다.");
		jl = new JLabel("버튼을 누르세요.");
		
		jb1.addActionListener(new EventClass(jl));
		jb2.addActionListener(new EventClass(jl));
		
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jl);
		
		setSize(250,150);
		setVisible(true);
	}
	
}

class JLabel5 extends JFrame implements ActionListener{
	private JLabel result = new JLabel();
	public ImageIcon i1,i2;
	public JLabel5() {
		i1 = new ImageIcon("apple.jpg");
		i2 = new ImageIcon("pear.jpg");
		JButton apple = new JButton("사과");
		JButton pear = new JButton("배");
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(apple);
		ct.add(pear);
		ct.add(result);
		
		apple.addActionListener(this);
		pear.addActionListener(this);
		
		setSize(300,250);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand() == "사과") {
			result.setText("맛있는 사과입니다.");
			result.setIcon(i1);
		}
		else {
			result.setText("맛있는 배.");
			result.setIcon(i2); // 밑에있어도 이미지 먼저 설출력임.
		}
	}
	
}

class JTFJTA1 extends JFrame implements ActionListener{
	private JTextField jtf;
	private JTextArea jta;
	private JLabel jl = new JLabel("입력");
	
	public JTFJTA1() {
		jtf = new JTextField(20);
		jta = new JTextArea(10,20); //입력한거 출력하는 곳
		
		jta.setEditable(false);
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		p1.add(jtf);
		p1.add(jta);
		ct.add(p1);
		ct.add(jl);
		jtf.addActionListener(this);
		
	
	}
	public void actionPerformed(ActionEvent ae) {
		if(jta.getLineCount()<=jta.getRows()) {
			jta.append(ae.getActionCommand()+"\n");
			jtf.setText("");
		}
		else {
			jl.setText("입력이 종료되었습니다.");
			jtf.setEditable(false);
		}
	}
	
}

class JButton5 extends JFrame {
	public JButton5() {
		ImageIcon korea = new ImageIcon("korea1.gif");
		ImageIcon usa = new ImageIcon("usa.gif");
		ImageIcon germany = new ImageIcon("germany.gif");
		
		JButton nat = new JButton(korea);
		nat.setPressedIcon(germany);
		nat.setPressedIcon(usa);
		nat.setRolloverIcon(germany);
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(nat);
		setSize(500,400);
		setVisible(true);
		
		
	}
}

class JButton6 extends JFrame implements ActionListener{
	JTextField jtf;
	public JButton6() {
		jtf = new JTextField(10);
		ImageIcon apple = new ImageIcon("apple.jpg");
		ImageIcon banana = new ImageIcon("banana.jpg");
		ImageIcon persimmon = new ImageIcon("persimmom.jpg");
		ImageIcon pear = new ImageIcon("pear.jpg");
		ImageIcon grape = new ImageIcon("grape.jpg");

		// 버튼 생성 (텍스트 + 이미지)
		JButton jb1 = new JButton("사과", apple);
		JButton jb2 = new JButton("바나나", banana);
		JButton jb3 = new JButton("감", persimmon);
		JButton jb4 = new JButton("배", pear);
		JButton jb5 = new JButton("포도", grape);
		
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3,2));
		
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(jb4);
		ct.add(jb5);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		
		setSize(250,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		jtf.setText(ae.getActionCommand());
		
	}
	
	
}

class JCheckBox1 extends JFrame implements ItemListener{
	JTextField jtf;
	public JCheckBox1() {
		jtf = new JTextField(10);
		JCheckBox jc1 = new JCheckBox("JSP");
		JCheckBox jc2 = new JCheckBox("PHP");
		JCheckBox jc3 = new JCheckBox("ASP");
		JCheckBox jc4 = new JCheckBox("Servlet");
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(jc1);
		ct.add(jc2);
		ct.add(jc3);
		ct.add(jc4);
		ct.add(jtf);
		
		jc1.addItemListener(this);
		jc2.addItemListener(this);
		jc3.addItemListener(this);
		jc4.addItemListener(this);
		setSize(250,100);
		setVisible(true);
		
		
		
	}
	public void itemStateChanged(ItemEvent ie) {
		jtf.setText(((JCheckBox)ie.getItem()).getText());

	}
	
}

class JComboBox1 extends JFrame implements ItemListener{
	JLabel jl;
	public JComboBox1() {
		jl = new JLabel();
		JComboBox jcb = new JComboBox();
		String fr[] = {"persimmom","banana","apple","cherry","grape"};
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		for(int i = 0; i < fr.length;i++) {
			jcb.addItem(fr[i]);
		}
		ct.add(jcb);
		ct.add(jl);
		jcb.addItemListener(this);
		setSize(200,200);
		setVisible(true);
		
		
	}
	public void itemStateChanged(ItemEvent ie) {
		String fruit = (String)ie.getItem();
		jl.setIcon(new ImageIcon(fruit+".jpg"));
	}
}

class JList1 extends JFrame implements ListSelectionListener{
	private String[] fruitlist = {"persimmom", "banana", "apple", "cherry", "grape", "pear"};
	private JList jlist = new JList(fruitlist);
	private ImageIcon[] fruiticons = new ImageIcon[fruitlist.length];
	
	private JLabel[] jlicon = new JLabel[fruitlist.length];
	private JLabel jlname = new JLabel();

	public JList1() {
		
		
		Container ct = getContentPane();
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3,2,5,5));
		
		for (int i = 0; i < fruiticons.length; i++) {
		    fruiticons[i] = new ImageIcon(fruitlist[i] + ".jpg");
		    p1.add(jlicon[i] = new JLabel());
		}
		JPanel p2 = new JPanel();
		p2.add(jlname);
		ct.add(jlist,BorderLayout.WEST);
		ct.add(p1,BorderLayout.CENTER);
		ct.add(p2,BorderLayout.EAST);
		
		jlist.addListSelectionListener(this);
		setSize(700,300);
		setVisible(true);
		
	}
	public void valueChanged(ListSelectionEvent lse) {
		for(int i = 0;i<fruiticons.length;i++) {
			jlicon[i].setIcon(null);
		}
		
		int[] indices= jlist.getSelectedIndices();
		String s = "당신이 선택한 항목은 :";
		
		for(int j = 0;j<indices.length;j++) {
			jlicon[j].setIcon(fruiticons[indices[j]]);
			s=s+fruitlist[indices[j]] + " ";
		}
		jlname.setText(s);
		
	}

}

class JTabbedPanel_test1 extends JPanel {
	public JTabbedPanel_test1() {
		JButton jb = new JButton("버튼");
		add(jb);
	}
	
}

class JTabbedPanel_test2 extends JPanel {
	public JTabbedPanel_test2() {
		JButton jb = new JButton("버튼2");
		add(jb);
	}
	
}

class JTabbedPanel1 extends JFrame{
	public JTabbedPanel1() {
		JTabbedPanel_test1 jtp1 = new JTabbedPanel_test1();
		JTabbedPanel_test2 jtp2 = new JTabbedPanel_test2();
		
		JTabbedPane jtp = new JTabbedPane();
		jtp.add("버튼1",jtp1);
		jtp.add("버튼2",jtp2);
		
        
        getContentPane().add(jtp);
        setSize(500,500);
        setVisible(true);

		
	}
}


public class GUI_test {
	public static void main(String[] args) {
		// TODO Auto-generated method
		new JTabbedPanel1();
    //이미지 파일은 직접 넣어야함.
    //GUI 1차 공부를 위해 만든 간단한 코드.
	}

}


