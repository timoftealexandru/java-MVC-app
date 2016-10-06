package repository;
import model.Animal;

public interface AnimalRepository {
    void add(Animal a);
    void remove(Animal a);
    Animal[] getAll();
}
