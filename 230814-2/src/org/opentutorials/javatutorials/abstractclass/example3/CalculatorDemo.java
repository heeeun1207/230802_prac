package org.opentutorials.javatutorials.abstractclass.example3;
abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
//setOprands 계산기를 사용하기 위한 필수적인 메소드이므로, 
//상위 클래스인 Calculator에 기본적으로 포함한다.
        this.left = left;
        this.right = right;
    } 
//추상클래스는 사용자가 직접 상속을 강제한다. 
    public abstract void sum();  
    public abstract void avg();
    public void run(){
//추상클래스 메소드 sum,avg 호출하는 run()
//즉, run 은 어떤순서로 메소드를 호출하는가에 대한 로직이다.
        sum();
        avg();
    }
}
//구체적인 동작방법은 하위클래스에서 동작하도록 하는것이 abstract이다.
class CalculatorDecoPlus extends Calculator {
//Calculator 상속받아서 sum,avg() 직접 구현한다. 
//+ 를 붙여서 계산된 결과를 표시.
    public void sum(){
        System.out.println("+ sum :"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+(this.left+this.right));
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) { 
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();
         
        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();
    }
   
}