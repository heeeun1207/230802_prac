package org.opentutorials.javatutorials.finals;
 
class Calculator {
    static final double PI = 3.14;
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6; 
//error : 이미 3.14로 지정되어있고 final로 고정되어있기 때문에이다
//나중에 바꾸려고 하면 JAVA는 거부한다.
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        //Calculator.PI = 10;
//또한, 클래스 바깥쪽에서도 사용할 수 없다. 
//한번 지정한 값을 변경하지 못하도록 한다.
 
    }
 
}