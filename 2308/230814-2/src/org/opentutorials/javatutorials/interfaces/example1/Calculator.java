package org.opentutorials.javatutorials.interfaces.example1;

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
// public void setOprands(int first, int second, int third){}
// A는 setOprands의 매개변수를 2개 받고 있지만 개발자 B는 이 메소드가 변수 3개를 받을 것이라고 생각한 상황이다.
// 그 약속을 코드 안에서 할 수 있다면 참 좋을 것이다. => 인터페이스가 필요한 순간이다.
