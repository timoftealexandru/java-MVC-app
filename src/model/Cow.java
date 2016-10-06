package model;


public class Cow extends Animal {
    private double weight;
    private String name;

    public Cow(double w,String n){
        this.weight=w;
        this.name=n;
    }
    public double getWeight(){
        return weight;
    }
    public String toString(){
        return "Cow " + name + " " + weight;
    }
}
