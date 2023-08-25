//package org.opentutorials.javatutorials.overriding.example1;
// 
//class Calculator {
//    int left, right;
// 
//    public void setOprands(int left, int right) {
//        this.left = left;
//        this.right = right;
//    }
// 
//    public void sum() {
//        System.out.println(this.left + this.right);
//    }
// 
//    public int avg() {
//        return ((this.left + this.right) / 2);
//    }
//}
// 
//class SubstractionableCalculator extends Calculator {
//     
//    public void sum() {
//        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
//    }
//     
//    public int avg() {
//        return ((this.left + this.right) / 2);
//    }
//     
//    public void substract() {
//        System.out.println(this.left - this.right);
//    }
//}
// 
//public class CalculatorDemo {
//    public static void main(String[] args) {
//        SubstractionableCalculator c1 = new SubstractionableCalculator();
//        c1.setOprands(10, 20);
//        c1.sum();
//        c1.avg();
//        c1.substract();
//    }
//}


//코드의 중복(public int avg() {})은 제거되야 하므로,   super를 사용해서 문제를 해결해보자. 
package org.opentutorials.javatutorials.overriding.example1;
 
class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public int avg() {
        return ((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
     
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
     
    public int avg() {
        return super.avg();
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        System.out.println("실행 결과는" + c1.avg());
        c1.substract();
    }
}