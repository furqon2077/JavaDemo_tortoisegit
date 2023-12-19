package org.example;

class Human {
    private int age;
    private String name;

    public Human() {
        age = 20;
        name = "Farhad";
    }

    public Human (int a, String n) {
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Demo {
    public static void main(String[] args) {

        Human obj1 = new Human();
        Human obj2 = new Human(28, "Aziz");
//        obj1.setAge(36);
//        obj1.setName("Furkat");

        System.out.println(obj1.getName() + " : " + obj1.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());
//        System.out.println("my age is" + " : " + obj1.getAge());
//        System.out.println("my name is" + " : " + obj2.getName());
//        System.out.println("my age is" + " : " + obj2.getAge());

    }
}
