package org.opentutorials.javatutorials.interfaces.example1;
class CalculatorDummy{
    public void setOprands(int first, int second, int third){}
// {} 빈 값
    public int sum(){
        return 60;
//return 값이 고정적으로 정해져있음.
    }
    public int avg(){
        return 20;
    }
}
public class CalculatorConsumer {
    public static void main(String[] args){
        CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10,20,30);
        System.out.println(c.sum()+c.avg());
    }
}