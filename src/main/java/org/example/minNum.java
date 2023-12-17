package org.example;

class compare {
    public int minNumber(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            return n1;
        } else return Math.min(n2, n3);
    }
}
public class minNum {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 31;
        int num3 = 33;

        compare obj = new compare();
        int result = obj.minNumber(num1, num2, num3);
        System.out.println(result);
    }
}
