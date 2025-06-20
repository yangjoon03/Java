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
```java

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


