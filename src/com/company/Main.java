package com.company;

public class Main {
    public static void main(String[] args) {
        //Dog dog = new Dog("Dog", "Pitbull");
        //dog.print();

        createObject(Dog.class.getClass().getSimpleName()).print();
        createObject(Shark.class.getClass().getSimpleName()).print();




    }
    public static Animal createObject  (String className) {
        if (className.equals(Dog.class.getClass().getSimpleName())) {
            return new Dog("Dog", "Pitbull");

        } else if (className.equals(Shark.class.getClass().getSimpleName())) {
           return new Shark("Shark", "Big");

        } else if (className.equals(Snake.class.getClass().getSimpleName())) {
            return new Snake("Snake", "Dangerous");
        }
        else {
            System.out.println("Null");
        }

        return null;
    }

}
