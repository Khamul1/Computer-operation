package ru.javabegin.opp.computer;

public class Computer {

    public Computer() {
    }

    private String name;

    public Computer(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(name + " On");

    };

    public void off(){
        System.out.println(name + " Off");
    }
}
