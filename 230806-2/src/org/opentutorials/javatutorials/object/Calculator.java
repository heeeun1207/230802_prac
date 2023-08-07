package org.opentutorials.javatutorials.object;
 
class Calculator{
    int left, right;
      
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
      
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
  
public class CalculatorDemo4 {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        //객체를 새로 만든 것.
        //Calculator 객체를 새로만들어서 c1 변수에 담았다 . 
        //그 변수는 Calculator 객체를 담을 수 있는 데이터 형식을 가지고 있어야한다.
        c1.setOprands(10, 20);
        //setOprands(인자값)  => 메소드
        c1.sum();       
        c1.avg();       
          
        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();
    }
  
}