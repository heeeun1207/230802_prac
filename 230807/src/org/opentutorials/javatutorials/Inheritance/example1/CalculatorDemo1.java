package org.opentutorials.javatutorials.Inheritance.example1;
 
class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
//확장하고 있기때문에 , 호출이 가능하다 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {

        SubstractionableCalculator c1 = new SubstractionableCalculator();
	//SubstractionableCalculator 클래스를 인스턴스화 (c1) 시켰다.
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
	//기존 Calculator가진 메소드 .sum/.avg/.substract
    }
 
}