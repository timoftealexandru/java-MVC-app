package main;
import controller.Controller;
import repository.*;
import model.*;
public class Main {
    public static void main(String[] v){
        AnimalRepository r = new Repository(10);
        Controller ctrl = new Controller(r);
        ctrl.add(new Cow(40,"Milka"));
        ctrl.add(new Bird(2,"Parrot"));
        ctrl.add(new Pig(35,"Gigi"));

        ctrl.display(3);
    }
}
