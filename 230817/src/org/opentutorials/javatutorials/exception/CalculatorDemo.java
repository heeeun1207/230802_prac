//package org.opentutorials.javatutorials.exception;
//class Calculator{
//    int left, right;
//    public void setOprands(int left, int right){
//        if(right == 0){
//            throw new IllegalArgumentException("두번째 인자의 값은 0이 될 수 없습니다.");
//        }
//        this.left = left;
//        this.right = right;
//    }
//    public void divide(){
//        try {
//            System.out.print("계산결과는 ");
//            System.out.print(this.left/this.right);
//            System.out.print(" 입니다.");
//        } catch(Exception e){
//            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
//            System.out.println("\n\ne.toString()\n"+e.toString());
//            System.out.println("\n\ne.printStackTrace()");
//            e.printStackTrace();
//        }
//    }
//} 
//public class CalculatorDemo {
//    public static void main(String[] args) {
//        Calculator c1 = new Calculator();
//        c1.setOprands(10, 0);
//        c1.divide();
//    }
//}
//IllegalArgumentException
//Exception in thread "main" java.lang.IllegalArgumentException: 두번째 인자의 값은 0이 될 수 없습니다.
//at java0817/org.opentutorials.javatutorials.exception.Calculator.setOprands(CalculatorDemo.java:6)
//at java0817/org.opentutorials.javatutorials.exception.CalculatorDemo.main(CalculatorDemo.java:27)


package org.opentutorials.javatutorials.exception;
class Calculator{
    int left, right;
    public void setOprands(int left, int right){        
        this.left = left;
        this.right = right;
    }
    public void divide(){
        if(this.right == 0){
            throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다.");
        }
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}

//ArithmeticException
//Exception in thread "main" java.lang.ArithmeticException: 0으로 나누는 것은 허용되지 않습니다.
//at java0817/org.opentutorials.javatutorials.exception.Calculator.divide(CalculatorDemo.java:41)
//at java0817/org.opentutorials.javatutorials.exception.CalculatorDemo.main(CalculatorDemo.java:59)