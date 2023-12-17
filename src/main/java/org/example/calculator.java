package org.example;

class addition {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

}

class subtraction {
    public int subtract (int n1, int n2) {
        return n1 - n2;
    }
}

class multiplication {
    public int multiply (int n1, int n2) {
        return n1 * n2;
    }
}

class division {
    public int divide (int n1, int n2){
        return n1 / n2;
    }
}

public class calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;

        addition calc = new addition();
        int result = calc.add(num1, num2);
        System.out.println(result);

        subtraction calc2 = new subtraction();
        int result2 = calc2.subtract(num1, num2);
        System.out.println(result2);

        multiplication calc3 = new multiplication();
        int result3 = calc3.multiply(num1, num2);
        System.out.println(result3);

        division calc4 = new division();
        int result4 = calc4.divide(num1,num2);
        System.out.println(result4);
    }
}