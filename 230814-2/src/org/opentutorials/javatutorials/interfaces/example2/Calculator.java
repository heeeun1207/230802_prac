package org.opentutorials.javatutorials.interfaces.example2;

class Calculator implements Calculatable {
    int first, second, third;

    public void setOprands(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public int sum() {
        return this.first + this.second + this.third;
    }

    public int avg() {
        return (this.first + this.second + this.third) / 3;
    }
}
// 인터페이스에 따라서 구현된 클래스이다.