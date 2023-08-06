package org.opentutorials.javatutorials.object;
 
public class ClaculatorDemo3 {
	
    public static void avg(int left, int right) {
        System.out.println("평균은 " + (left + right) / 2 + "입니다.");
    }

    public static void sum(int left, int right) {
        System.out.println("총합은 " + (left + right) + "입니다.");
    }

    public static void main(String[] args) {
        int left, right;

        left = 10;
        right = 20;

        sum(left, right);
        avg(left, right);

        left = 20;
        right = 40;

        sum(left, right);
        avg(left, right);
    }

}
