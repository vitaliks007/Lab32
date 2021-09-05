package com.company;

import java.util.Scanner;
import java.util.Vector;

public class Human {
    private Vector legVector = new Vector(0);
    private Vector handVector = new Vector(0);
    private Vector headVector = new Vector(0);
    private int age, height;
    private String name;

    public Human(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public void addArrBase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add parts count: ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            addBase();
        }
    }

    public void addBase(){
        Scanner scanner = new Scanner(System.in);
        int part, type, color, health;
        System.out.println("Body part: " + "\n" + "1) Head" + "\n" + "2) Hand" + "\n" + "3) Leg");
        part = scanner.nextInt();
        System.out.println("Body part attributes (type, color, health): ");
        type = scanner.nextInt();
        color = scanner.nextInt();
        health = scanner.nextInt();

        switch (part){
            case (1):   Head head = new Head(type, color, health);
                headVector.addElement(head);
                break;
            case (2):   Hand hand = new Hand(type, color, health);
                handVector.addElement(hand);
                break;
            case (3):   Leg leg = new Leg(type, color, health);
                legVector.addElement(leg);
                break;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "legVector=" + legVector +
                ", handVector=" + handVector +
                ", headVector=" + headVector +
                ", age=" + age +
                ", name=" + name +
                ", height=" + height +
                '}';
    }
}
