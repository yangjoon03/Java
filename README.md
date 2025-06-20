## Java

### 상속

### 다형성

### 추상화

### 인터페이스

### 인터페이스 다중상속

### 예외 처리

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

