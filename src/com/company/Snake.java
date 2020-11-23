package com.company;

public class Snake extends Animal implements Printable {
    private String danger;

    public Snake(String name, String danger) {
        super(name);
        this.danger = danger;
    }

    @Override
    public String getName() {
        return super.getName();
    }
    public String getDanger() {
        return danger;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + getDanger());
    }
}
