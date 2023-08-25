package org.opentutorials.javatutorials.io;
 
import java.util.Scanner;
 
public class Scanner2Demo {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
//hasNextInt 메소드를 자바가 실행시키면 일단, 정지시킨다. 
//사용자가 입력한 값의 공백(enter) 쳤다면, 
//사용자가 입력한 값이 숫자가 true 본문을 실행한다
            System.out.println(sc.nextInt()*1000); 
//true 일 경우 실행되는 코드
        }
        sc.close();
//사용자가 입력한 값이 숫자가 아닌 경우에는 false 반복문이 종료된다. 
    }
 
}