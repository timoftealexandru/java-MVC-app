package model;


public class Pig extends Animal {
    private double weight;
    private String name;

    public Pig(double w,String n){
        this.weight=w;
        this.name=n;
    }
    public double getWeight(){
        return weight;
    }
    public String toString(){
        return "Pig " + name + " " + weight;
    }
}
