package org.opentutorials.javatutorials.abstractclass.example3;
abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    int _sum() {
    	return this.left +this.right;
    }
    //1. _sum() 부모클래스의 메소드를 이용해서 공통적인 부분 = 중복을 제거한다.
    //2. 공통적이지 않은 부분은 자식클래스에서 사용자가 직접 지정한다.  "+ sum :"
    //3. 접근 제어자가 현재 존재하지 않는다는 것 = default 접근 제어자이다. = 같은 패키지에서만 사용 가능
    //다른 패키지에서 _sum()을 사용하지 못하도록 일종의 보호장치를 설정한 것이다. 
    public abstract void sum();  
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+(_sum()));
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+(_sum()));
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