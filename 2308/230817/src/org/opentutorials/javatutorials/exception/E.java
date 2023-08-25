package org.opentutorials.javatutorials.exception;
import java.io.IOException;
class E{
    void throwArithmeticException(){
        throw new ArithmeticException();
    }
    void throwIOException() throws IOException{
        throw new IOException();
    }
}
//IOException은 Exception의 자식이지만 RuntimeException의 자식은 아니다.
//IOException 기본 개념을 이해해야 
//내가 unchecked exception을 만들지 checked exception을 만들지 구분할 수 있게된다.