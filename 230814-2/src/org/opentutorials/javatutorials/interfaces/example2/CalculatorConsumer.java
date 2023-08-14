//인터페이스를 구현한 가짜 클래스를 임시로 사용해서 만든 에플리케이션
//package org.opentutorials.javatutorials.interfaces.example2;
//class CalculatorDummy implements Calculatable{
//    public void setOprands(int first, int second, int third){
//    }
//    public int sum(){
//        return 60;
//    }
//    public int avg(){
//        return 20;
//    }
//}
//public class CalculatorConsumer {
//    public static void main(String[] args) {
//        CalculatorDummy c = new CalculatorDummy();
//        c.setOprands(10, 20, 30);
//        System.out.println(c.sum()+c.avg());
//    }
//}

package org.opentutorials.javatutorials.interfaces.example2;

public class CalculatorConsumer {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum() + c.avg());
    }
}
// 가짜 클래스인 CalculatorDummy를 실제 로직으로 교체