//package org.opentutorials.javatutorials.Inheritance.example4;
//public class ConstructorDemo {
//    public static void main(String[] args) {
//        ConstructorDemo  c = new ConstructorDemo();
////자기 자신을 인스턴스화했다. // 문제가 없다.
//    }
//}


//package org.opentutorials.javatutorials.Inheritance.example4;
//public class ConstructorDemo {
//    public ConstructorDemo(int param1) {}
////기본 생성자가아닌 , 즉 매개변수가 있는 생성자이다. // 에러 발생 
//    public static void main(String[] args) {
//        ConstructorDemo  c = new ConstructorDemo();
//    }
//}


package org.opentutorials.javatutorials.Inheritance.example4;
public class ConstructorDemo {
    public ConstructorDemo(){}
//인자가 없는 기본 생성자를 명시적으로 생성해줘야 한다.
    public ConstructorDemo(int param1) {}
    public static void main(String[] args) {
        ConstructorDemo  c = new ConstructorDemo();
    }
}