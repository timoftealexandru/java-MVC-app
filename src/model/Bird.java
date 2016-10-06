package model;

public class Bird extends Animal {
    private double weight;
    private String name;

    public Bird(double w,String n){
        this.weight=w;
        this.name=n;
    }
    public double getWeight(){
        return weight;
    }
    public String toString(){
        return "Bird " + name + " " + weight;
    }
}
