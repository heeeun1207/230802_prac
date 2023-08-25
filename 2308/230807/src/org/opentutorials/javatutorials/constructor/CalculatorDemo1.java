package org.opentutorials.javatutorials.constructor;
 
class Calculator {
    int left, right;
 
    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println("총합은 " + (this.left + this.right));
    }
 
    public void avg() {
        System.out.println("평균은 " + (this.left + this.right) / 2);
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator(10, 20);
        //인스턴스 생성자 
        c1.sum();
        c1.avg();
 
        Calculator c2 = new Calculator(20, 40);
        c2.sum();
        c2.avg();
    }
 
}