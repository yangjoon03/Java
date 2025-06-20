# Java

## 1. 상속

## 2. 다형성

## 3. 추상화

## 4. 인터페이스

## 5. 인터페이스 다중상속

## 6. 예외 처리

## 7. GUI
<details>
<summary>A. GUI - Component</summary>

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

JPanel jp = new JPanel();//다른 컴포넌트를 묶는 패널
//JPanel(new BorderLayout())레이아웃 지정

JFrame jf = new JFrame();//전체 위도우(창)
//텍스트
```
</details>




<details>
<summary>B. GUI - Layout</summary>

```java
Container ct = getContentPane();
```

#### BorderLayout
```java
ct.setLayout(new BorderLayout());
ct.add(Component, BorderLayout.NORTH); // SOUTH, EAST, WEST, CENTER
```

#### FlowLayout
```java
ct.setLayout(new FlowLayout()); // FlowLayout(int align, int hgap, int vgap); 정렬 방식: LEFT, CENTER, RIGHT, 간격 조정: gap
ct.add(Component);
```

#### GridLayout
```java
ct.setLayout(new GridLayout(2,3)); // GridLayout(int rows, int cols, int hgap, int wgap); 행, 열, 간격 조정
ct.add(Component);
```
</details>

<details>
<summary>C. GUI - ActionListener(액션 이벤트)</summary>
  
```java
jButton jb = new JButton("버튼");
```
#### ActionEvent
```java
  jb.addActionListener(this);
}
public void actionPerformed(ActionEvent a){
  jtf.setText(a.getActionCommand());//Component 텍스트 추출
  jl.setText("텍스트");

  jl.setIcon(ImageIcon);
}
```
</details>


