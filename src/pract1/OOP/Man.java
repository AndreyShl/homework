package pract1.OOP;

import java.util.Scanner;

public class Man {
    private String name;
    private String male;
    private int age;
    private int weight;


    public String toStringMan() {
        return "Man " +
                "name='" + name + '\'' +
                ", male='" + male + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ' ';
    }

    public Man() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите имя студента: ");
        name = sc1.next();
        this.name = name;

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите возраст студента: ");
        age = sc2.nextInt();
        this.age = age;

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите вес студента: ");
        weight = sc3.nextInt();
        this.weight = weight;

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Введите пол студента: ");
        male = sc4.next();
        this.male = male;

    }



    public void setMale(String male) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите пол студента: ");
        male = String.valueOf(sc1.next());
        this.male = male;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите вес студента: ");
        weight = sc1.nextInt();
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите имя студента: ");
        name = String.valueOf(sc1.next());
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите возраст студента: ");
        age = sc1.nextInt();
        this.age = age;
    }
}
