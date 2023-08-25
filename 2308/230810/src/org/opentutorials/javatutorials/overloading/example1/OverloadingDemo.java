package org.opentutorials.javatutorials.overloading.example1;
public class OverloadingDemo {
    void A (){System.out.println("void A()");}
//메소드 이름이 같고, 매개변수 형식이같다. 
//2개의 메소드 정의의 리턴값이 하나는 void이고, 하나는 int이다
//하지만 리턴값이 다른 메소드를 오버로딩할수는 없다.  //od.A();
    void A (int arg1){System.out.println("void A (int arg1)");}
    //void A (int param1){System.out.println("void A (int arg1)");}
    void A (String arg1){System.out.println("void A (String arg1)");}
    //int A (){System.out.println("void A()");}
    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("coding everybody");
    }
}