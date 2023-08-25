package org.opentutorials.javatutorials.polymorphism;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}
// 오버로딩을 사용하여 add 메서드를 재정의함.
// 오버로딩은 같은 이름의 메서드를 여러 버전으로 정의하여 다양한 매개변수 타입을 처리할 수 있도록 한다.
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
// Dog 클래스에서 오버라이딩을 사용하여 makeSound 재정의함.
// 오버라이딩은 상속 관계에서 슈퍼클래스의 메서드를 서브클래스에서 다시 정의하여 더 구체적인 동작을 구현할 수 있도록 한다.

public class RidingLoading {
    public static void main(String[] args) {
        // 오버로딩 예제
        Calculator calculator = new Calculator();
        int sum1 = calculator.add(3, 4);
        double sum2 = calculator.add(2.5, 1.5);
        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        
        // 오버라이딩 예제
        Animal animal = new Animal();
        animal.makeSound();
        
        Dog dog = new Dog(); 
        dog.makeSound();   // "Animal makes a sound" ? "Dog barks"? 
    }
}
