package repository;
import model.Animal;

public class Repository implements AnimalRepository{
    private Animal[] animals;
    private int nr;
    private int size;

    public Repository(int size){
        animals=new Animal[size];
        this.size=size;
        this.nr=0;
    }
    public void add(Animal a){
        if(nr==size){
            resize();
        }
        animals[nr++]=a;
    }
    private void resize(){
        size=2;
        Animal[] aux= new Animal[size];
        for(int i=0;i<nr;i++){
            aux[i]=animals[i];
        }
        animals=aux;
    }
    public Animal[] getAll(){
        Animal[] ans=new Animal[nr];
        for(int i=0;i<nr;i++){
            ans[i]=animals[i];
        }
        return ans;
    }
    public void remove(Animal a){

    }
}

