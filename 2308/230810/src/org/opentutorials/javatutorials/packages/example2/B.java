//package org.opentutorials.javatutorials.packages.example2;
// 
//public class B {
//    public static void main(String[] args) {
//        //클래스 A가 다른 패키지에 있기 때문에 로드 할 수 없다.
//        A a = new A();
//    }
//}


package org.opentutorials.javatutorials.packages.example2;
//import org.opentutorials.javatutorials.packages.example1.A;
import org.opentutorials.javatutorials.packages.example1.*;
//만약 특정 패키지에 있는 모든 클래스를 로드하고 싶다면 * 사용하면 된다. 
public class B {
    public static void main(String[] args) {
        A a = new A();
    }
}
//