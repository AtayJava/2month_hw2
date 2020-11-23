package com.company;

public class Dog extends Animal implements Printable{
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public String getName() {
        return super.getName();
    }
    public String getBreed () {
        return breed;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + getBreed());
    }
}
