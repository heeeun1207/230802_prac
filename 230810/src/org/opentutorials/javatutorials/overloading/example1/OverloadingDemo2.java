package org.opentutorials.javatutorials.overloading.example1;
public class OverloadingDemo2 extends OverloadingDemo{
    void A (String arg1, String arg2){System.out.println("sub class : void A (String arg1, String arg2)");}
//오버로딩 : 부모 클래스의 메소드의 동작방법을 변경
		void A (){System.out.println("sub class : void A ()");}
//오버라이딩 : 같은 이름, 다른 매개변수의 메소드들을 여러개 만들 수 있다
    public static void main(String[] args) {
        OverloadingDemo2 od = new OverloadingDemo2();
        od.A();
        od.A(1);
        od.A("coding everybody");
        od.A("coding everybody", "coding everybody");
         
    }
}