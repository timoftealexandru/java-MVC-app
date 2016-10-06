package controller;
import model.Animal;
import repository.*;

public class Controller {
    private AnimalRepository repo;
    public Controller(AnimalRepository repo){
        this.repo=repo;
    }
    public void add(Animal a){
        repo.add(a);
    }
    public void delete(Animal a){
        repo.remove(a);
    }
    public void display(double w){
        Animal[] ans =  repo.getAll();
        for(int i=0;i<ans.length;i++){
            if(ans[i].getWeight()>w){
                System.out.println(ans[i]);
            }
        }
    }
}
