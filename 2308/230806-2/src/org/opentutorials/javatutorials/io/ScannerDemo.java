package org.opentutorials.javatutorials.io;
 
import java.util.Scanner;
 
public class ScannerDemo {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //System.in 사용자가 입력한 값이란 의미를 가진 기호라고만 우선 생각하자.
      //Scanner 새로운 객체가 "사용자가 입력한 값" 을 스캐닝 = 알아내는 역할을 한다고 생각하자.
      //sc 변수에 담겨서 객체를 제어한다. 
        int i = sc.nextInt();
	    //Int 숫자가 아니면 에러가 난다. 
        System.out.println(i*1000);
        sc.close();
    }
 
}