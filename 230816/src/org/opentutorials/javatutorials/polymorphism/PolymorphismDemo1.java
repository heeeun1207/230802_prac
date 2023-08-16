package org.opentutorials.javatutorials.polymorphism;
class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
class B2 extends A{
    public String x(){return "B2.x";}
}
//서로 다른 클래스 B와 B2가 동일한 데이터 타입 A로 인스턴스화 되었다.
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();
        A obj2 = new B2();
        System.out.println(obj.x());
        System.out.println(obj2.x());
    }
}

//하지만 두 인스턴스의 메소드 x를 호출한 결과는 서로 다르다.
//이것이 상속과 오버라이딩 그리고 형변환을 이용한 다형성이다.