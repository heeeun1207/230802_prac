package org.opentutorials.javatutorials.polymorphism;

//클래스 B는 클래스 A를 상속하고 있다. 이런 경우에 클래스 B는 클래스 A를 데이터 형으로 삼을 수 있다.
//class A{}
//class B extends A {}
//public class PolymorphismDemo1 {
//	public static void main(String[] args){
//		A obj = new B();
//	}
//}

//2
//class A{
//    public String x(){return "x";}
//}
//class B extends A{
//    public String y(){return "y";}
//}
//public class PolymorphismDemo1 {
//    public static void main(String[] args) {
//        A obj = new B();
//        obj.x();
////        obj.y();실행되지 않는다. 
//    }
//}

//3
class A{
public String x(){return "A.x";}
}
class B extends A{
public String x(){return "B.x";}
public String y(){return "y";}
}
public class PolymorphismDemo1 {
public static void main(String[] args) {
  A obj = new B();
  System.out.println(obj.x());
	}
}
//실행 결과는 ?   A.x ? B.x? 
//클래스 B를 클래스 A의 데이터 타입으로 인스턴스화 했을 때 클래스 A에 존재하는 맴버만이 클래스 B의 맴버가 된다.
//동시에 클래스 B에서 오버라이딩한 맴버의 동작방식은 그대로 유지한다. 