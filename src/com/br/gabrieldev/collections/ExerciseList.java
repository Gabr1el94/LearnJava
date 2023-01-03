package com.br.gabrieldev.collections;

import java.util.*;
import java.lang.*;

public class ExerciseList {
    public static void main(String args[]) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Lion", 5, "preto"));
        cats.add(new Cat("Simba", 6, "branco"));
        cats.add(new Cat("Castor", 3, "tigrado"));

        System.out.println("Order de inserção:");
        System.out.println(Arrays.asList(cats));

        System.out.println("\n Order de aleatória:");
        Collections.shuffle(cats);
        System.out.println(Arrays.asList(cats));

        System.out.println("\n Order natural (Nome):");
        Collections.sort(cats);
        System.out.println(Arrays.asList(cats));

        System.out.println("\n Order Idade:");
        Collections.sort(cats, new ComparatorAge());
        System.out.println(Arrays.asList(cats));
    }
}

class Cat implements Comparable<Cat> {
    private String name;
    private Integer age;
    private String color;

    public Cat(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + "\'" +
                ", age='" + age + "\'" +
                ", color='" + color + "\'" +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        return this.getName().compareToIgnoreCase(cat.getName());
    }

}

class ComparatorAge implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return Integer.compare(cat1.getAge(), cat2.getAge());
    }
}