package org.opentutorials.javatutorials.scope;
 
public class ScopeDemo {
 
    static void a() {
        int i = 0;
    }
 
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
 
}
//내부 변수의 값이 그 외부에 영향을 미치지 않는다는 것을 알 수 있다. 
//과거의 프로그래밍 언어는 메소드 내에서의 변수가 외부의 변수에도 영향을 미쳤기 때문에
//이런 문제를 해결하기 위해서 다양한 시도들이 있었는데 그 노력의 결과 중의 하나가 유효범위라고 할 수 있다.