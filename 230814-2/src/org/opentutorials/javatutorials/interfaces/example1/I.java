package org.opentutorials.javatutorials.interfaces.example1;
 
interface I{
//class가 아니라 interface 주목하자.
    public void z();
//z메소드가 정의되어있다. 본체 중괄호는 어디에도 보이지 않는다.
//마치 abstract() 본체가 없는것과 똑같다.
}
 
class A implements I{
//I라는 interface 를 "구현" 하는것이다. 
    public void z(){}
//즉, I인터페이스에서 시그니쳐로 정해놓은 z메소드를 classA에서 구현해야한다.
//만일 메소드를 구현하지 않으면 이 애플리케이션은 컴파일 조차 되지 않는다.
}