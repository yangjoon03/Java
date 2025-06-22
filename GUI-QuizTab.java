
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class QuizTab extends JPanel {
    static int count = 0;
    JPanel[] QuizContent = new JPanel[5];
    String[] s = new String[5];
    String[][] item = new String[5][5];
    int[] answer = new int[5];
    ButtonGroup[] groups = new ButtonGroup[5];
    JTabbedPane parentTabbedPane; // 부모 탭 참조용

    public QuizTab(JTabbedPane parentTabbedPane) {
        this.parentTabbedPane = parentTabbedPane;

        setLayout(new BorderLayout());

        JPanel jpLayout = new JPanel();
        jpLayout.setLayout(new GridLayout(0, 1));

        // 문제 데이터
        String[] questions = {
            "자바(Java)의 기본 자료형 중 정수형이 아닌 것은?",
            "OOP(객체지향 프로그래밍)의 4대 특성에 해당하지 않는 것은?",
            "Java에서 배열의 인덱스는 어디서부터 시작할까?",
            "JVM은 무엇의 약자인가?",
            "다음 중 Java의 접근 제어자가 아닌 것은?"
        };

        String[][] choices = {
            {"int", "double", "long", "byte"},
            {"캡슐화", "상속", "재귀", "다형성"},
            {"1", "0", "-1", "배열마다 다르다"},
            {"Java Variable Memory", "Java Visual Machine", "Java Virtual Machine", "Joint Virtual Method"},
            {"public", "protected", "default", "external"}
        };

        int[] correct = {1, 2, 1, 2, 3};

        for (int i = 0; i < questions.length; i++) {
            QuizContent[i] = new JPanel();
            QuizContent[i].setLayout(new BoxLayout(QuizContent[i], BoxLayout.Y_AXIS));
            QuizContent[i].add(new JLabel("Q" + (i + 1) + ". " + questions[i]));

            groups[i] = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton rb = new JRadioButton(choices[i][j]);
                rb.setActionCommand(String.valueOf(j));
                groups[i].add(rb);
                QuizContent[i].add(rb);
            }

            jpLayout.add(QuizContent[i]);

            s[i] = questions[i];
            item[i] = choices[i];
            answer[i] = correct[i];
        }

        // [정답 확인] 버튼
        JButton btn = new JButton("정답 확인");
        btn.addActionListener(e -> showResult());

        add(new JScrollPane(jpLayout), BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
    }

    private void showResult() {
        int score = 0;
        StringBuilder result = new StringBuilder("<html><h2>퀴즈 결과</h2>");

        for (int i = 0; i < 5; i++) {
            ButtonModel selected = groups[i].getSelection();
            int selectedIndex = selected != null ? Integer.parseInt(selected.getActionCommand()) : -1;

            if (selectedIndex == answer[i]) {
                score++;
                result.append("<p>Q").append(i + 1).append(": 정답 ✅</p>");
            } else {
                result.append("<p>Q").append(i + 1).append(": 오답 ❌ (정답: ")
                      .append(item[i][answer[i]]).append(")</p>");
            }
        }

        result.append("<h3>총 점수: ").append(score).append(" / 5</h3></html>");

        // 결과 탭 추가
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BorderLayout());
        resultPanel.add(new JLabel(result.toString()), BorderLayout.CENTER);

        parentTabbedPane.addTab("결과", resultPanel);
        parentTabbedPane.setSelectedIndex(parentTabbedPane.getTabCount() - 1);
    }
}




class QuizMenu extends JFrame {

    public QuizMenu() {
        JTabbedPane jtp = new JTabbedPane();
        QuizTab quizTab = new QuizTab(jtp); // ✅ 탭 넘기기
        jtp.addTab("문제", quizTab);
        add(jtp);

        setTitle("퀴즈 프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}


public class QuIz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new QuizMenu();

	}

}
