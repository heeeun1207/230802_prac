package org.opentutorials.javatutorials.classninstance;
 
class Calculator3{
  
    public static void sum(int left, int right){
        System.out.println("총합은 " + (left+right) + "입니다.");
    }
     
    public static void avg(int left, int right){
        System.out.println("평균은 " + (left+right)/2 +"입니다.");
    }
}
 
public class CalculatorDemo3 {
     
    public static void main(String[] args) {
        Calculator3.sum(10, 20);
//클래스에 접근에서 직접 사용 할 수 있다//클래스 메소드를 사용해서 불필요한 인스턴스의 생성을 막을 수 있다.
//클래스 소속의 메소드를 사용한다 = 메모리절약 , 빠른실행결과
        Calculator3.avg(10, 20);
         
        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    }
 
}