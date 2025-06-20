# Java

## 상속

## 다형성

## 추상화

## 인터페이스

## 인터페이스 다중상속

## 예외 처리

## GUI
### GUI - Component
```java
JLabel jl = new JLabel("텍스트");
JLabel jl = new JLabel(new ImageIcon("이미지.jpg"))
//텍스트, 이미지, JLabel.CENTER

JButton jb = new JButton("버튼");
JButton jb = new JButton(new ImageIcon("이미지.jpg"));
//텍스트, 이미지

JRadioButton jr = new JRadioButton("라디오 버튼");//그룹내 하나만 선택 가능
//텍스트, 활성상태:true

JTextField jtf = new JTextField();//한줄 텍스트 입력
//텍스트, 열수(글자 수)

JPanel jp = nw JPanel();//다른 컴포넌트를 묶는 패널
//JPanel(new BorderLayout())레이아웃 지정

JFrame jf = new JFrame();//전체 위도우(창)
//텍스트
```

### GUI - Layout
```java
Container ct = getContentPane();
```
#### BorderLayout
```java
ct.setLayout(new BorderLayout());
ct.add(Component,BorderLayout.NORTH);//SOUTH, EAST, WEST, CENTER
```
#### FlowLayout
```java
ct.setLayout(new FlowLayout());//FlowLayout(int align, int hgap, int vgap); 정렬 방식:LEFT, CENTER, RIGHT, 간격 조정 : gap
ct.add(Component);
```
#### GridLayout
```java
ct.setLayout(new GridLayout(2,3));//GridLayout(int rows, int cols, int hgap, int wgap); //행, 열, 간격 조정
ct.add(Component);
```







### GUI - ActionListener(액션 이벤트)
```java
jButton jb = new JButton("버튼");
```
#### public Action
```java

  jb.addActionListener(this);
}
public void actionPerformed(ActionEvent a){
  jtf.setText(a.getActionCommand());
}
```

