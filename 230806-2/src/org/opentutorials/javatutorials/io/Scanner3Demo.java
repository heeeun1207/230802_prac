package org.opentutorials.javatutorials.io;
 
import java.util.Scanner;
import java.io.*;
 
public class Scanner3Demo {
 
    public static void main(String[] args) {
        try {
            File file = new File("out.txt");
//file 변수 new file 객체를 생성했다. // out.txt
            Scanner sc = new Scanner(file);
//out.txt 파일에 저장되어있는 값이 입력값이 되어서 결과를 화면에 출력한다. 
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000); 
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
         
    }
 
}