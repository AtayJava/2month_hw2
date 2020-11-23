package com.company;

public class Animal implements Printable{
    private String name;

    public Animal (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    @Override
    public void print() {

    }
}
