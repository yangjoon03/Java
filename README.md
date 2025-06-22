# Java

<details>
<summary><h2>1. 상속</summary>
  
```java
  class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.sound(); // 출력: Bark
        c.sound(); // 출력: Meow
    }
}
```
</details>

* 정의: 부모 클래스의 필드와 메서드를 자식 클래스가 물려받는 것.
* 목적: 코드 재사용성 향상.
<details>
<summary><h2>2. 다형성</summary>
  
```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
    void 
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
    //다형성
        Animal a1 = new Dog();  // 업캐스팅
        Animal a2 = new Cat();
        
        a1.sound(); // 출력: Bark
        a2.sound(); // 출력: Meow
    }
}
```
</details>

* 정의: 하나의 참조 변수로 여러 객체(타입)를 참조할 수 있는 성질.
* 목적: 유연한 코드 작성 (같은 메서드가 서로 다른 동작).


<details>
<summary><h2>3. 추상화</summary>

 ```java
abstract class Animal {
    abstract void sound(); // 반드시 자식이 오버라이드해야 함

    void breathe() {
        System.out.println("Breathing...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();   // Bark
        a2.sound();   // Meow
        a1.breathe(); // Breathing...
    }
}
```

</details>

* 정의: 불필요한 정보는 숨기고 중요한 정보만 노출하는 것.
* 구현 방식: abstract class와 abstract method 사용.

<details>
<summary><h2>4. 인터페이스</summary>

```java
package Study;


//Animal 인터페이스
interface Animal {
 void eat();
 void sleep();
 void makeSound();
}

//Dog 클래스
class Dog implements Animal {
 public void eat() {
     System.out.println("개 eat");
 }

 public void sleep() {
     System.out.println("개 sleep");
 }

 public void makeSound() {
     System.out.println("개 sound");
 }
}

//Cat 클래스
class Cat implements Animal {
 public void eat() {
     System.out.println("고양이 eat");
 }

 public void sleep() {
     System.out.println("고양이 sleep");
 }

 public void makeSound() {
     System.out.println("고양이 sound");
 }
}

//메인 클래스
public class InterfaceTest1 {
 public static void main(String[] args) {
     Animal dog = new Dog();
     Animal cat = new Cat();

//     dog.makeSound();  // 개 sound
//     cat.makeSound();  // 고양이 sound
     animalMakeSound(dog);
     animalMakeSound(cat);
 }
 public static void animalMakeSound(Animal animal) {
	 animal.makeSound();
 }  
}


```
</details>

* 정의: 클래스가 반드시 구현해야 하는 메서드의 집합 (일종의 계약서).
* 특징: 다중 구현 가능, 모든 메서드는 기본적으로 public abstract.

<details>
<summary><h2>5. 인터페이스 다중상속</summary>
  
```java
package Study;


//Animal 인터페이스
interface Animal {
 void eat();
 void sleep();
 void makeSound();
}

interface Flying{
	void flying();

}

//Dog 클래스
class Dog implements Animal {
 public void eat() {
     System.out.println("개 eat");
 }

 public void sleep() {
     System.out.println("개 sleep");
 }

 public void makeSound() {
     System.out.println("개 sound");
 }
}

//Cat 클래스
class Cat implements Animal {
 public void eat() {
     System.out.println("박쥐 eat");
 }

 public void sleep() {
     System.out.println("박쥐 sleep");
 }

 public void makeSound() {
     System.out.println("박쥐 sound");
 }
 public void flying(){
			System.out.println("박쥐는 난다")	 
	}
}

class Bat implements Animal, Flying{
	public void eat() {
	     System.out.println("고양이 eat");
	 }
	
	 public void sleep() {
	     System.out.println("고양이 sleep");
	 }
	
	 public void makeSound() {
	     System.out.println("고양이 sound");
	 }
}

//메인 클래스
public class InterfaceTest1 {
 public static void main(String[] args) {
     Animal dog = new Dog();
     Animal cat = new Cat();

//     dog.makeSound();  // 개 sound
//     cat.makeSound();  // 고양이 sound
     animalMakeSound(dog);
     animalMakeSound(cat);
 }
 public static void animalMakeSound(Animal animal) {
	 animal.makeSound();
 }  
}
```
</details>

* 정의: 클래스가 반드시 구현해야 하는 메서드의 집합 (일종의 계약서).
* 특징:
  * 다중 구현 가능 (하나의 클래스가 여러 인터페이스를 동시에 구현할 수 있음)
  * 모든 메서드는 기본적으로 public abstract (구현 없이 선언만 함)

필드는 public static final 상수만 가질 수 있음

<details>
<summary><h2>6. 예외 처리</summary>

```java
public class Main {
    public static void main(String[] args) {
        try {
            int num = 10 / 0; // 0으로 나누면 예외 발생
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}

```
</details>

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


<details>
<summary><h2>7-1. GUI문제(GPT)</summary>

 * 기말고사 시험을 위한 GUI 개발
* 결론 : 다른 더 좋은 프레임워크가 많음.
<details>
<summary>메모장</summary>
💻 문제: "간단한 메모장 탭 앱 만들기"
설명
JTabbedPane을 사용하여 여러 개의 메모장을 탭으로 전환할 수 있는 GUI 프로그램을 만들어보세요. 각 탭은 독립적인 텍스트 영역(TextArea)을 가지고 있어야 하며, 사용자가 탭을 바꾸면 그 탭의 메모 내용을 볼 수 있어야 합니다.

 
-Window11과 비슷하게 제작.
	
</details>


<details>
<summary>계산기</summary>
💻 문제: "계산기 탭 앱 만들기"
설명
이번엔 탭마다 다른 기능을 하는 다기능 계산기 GUI를 만들어볼 거야. 각 탭마다 다른 계산 기능을 수행하도록 구성해보자.

 
-계산기는 실제 계산은 되지 않음., BMI는 계산 가능.
	
</details>


<details>
<summary>To-Do List</summary>
💻 문제 1: "할 일 목록 앱 (To-Do List)"
상단에 JTextField로 할 일을 입력하고 [추가] 버튼을 누르면 아래 리스트에 항목 추가
추가된 항목은 JList나 DefaultListModel로 표시
항목을 선택하고 [삭제] 버튼을 누르면 삭제됨


 -동적으로 처리해야해서 시험범위 외의 영역으로 구현X
</details>

<details>
<summary>회원가입 폼</summary>
💻 문제 3: "간단한 회원가입 폼"
사용자 정보 입력 폼 만들기:
이름 (JTextField), 성별 (JRadioButton), 관심사 (JCheckBox), 자기소개 (JTextArea)
[제출] 버튼을 누르면 다이얼로그로 입력 결과 요약 출력 (JOptionPane)
</details>


<details>
<summary>퀴즈 게임 앱</summary>
💻 문제 4: "퀴즈 게임 앱"
화면에 퀴즈 문제와 보기(라디오 버튼들) 표시
[다음] 버튼을 누르면 다음 문제로 이동
마지막 문제 후 결과 점수 출력
JTabbedPane을 이용해 “문제 탭”, “결과 탭” 나누기 (보너스)
</details>

<details>
<summary>채팅</summary>
💻 문제 5: "채팅"
직접 제작 : 채팅 입력시 기록.
</details>


<details>
<summary>로또 번호 추첨기</summary>
💻 문제 6: "로또번호 추첨기"
직접 제작 : while, for 만 이용하여 로또 번호 추첨,Hashset 사용하지 않음.
</details>


</details>
