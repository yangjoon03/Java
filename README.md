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
     팅</summary>
💻 문제 7: "채팅"
직접 제작 : 1명의 채팅만 기록 가능.
</details>


</details>


