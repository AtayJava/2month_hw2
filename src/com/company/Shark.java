package com.company;

public class Shark extends Animal implements Printable {
    private String bigOrSmall;


    public Shark(String name, String bigOrSmall) {
        super(name);
        this.bigOrSmall = bigOrSmall;
    }

    @Override
    public String getName() {
        return super.getName();
    }
    public String getBigOrSmall () {
        return bigOrSmall;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + bigOrSmall);
    }
}
