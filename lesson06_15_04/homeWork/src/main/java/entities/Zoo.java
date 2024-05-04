package entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Zoo {
    private Animal animal;

    private List<Animal> animals;

//    @Autowired

    public Zoo(Animal animal) {
        this.animal = animal;
    }
    @Autowired
    public Zoo (List<Animal> animals) {
        this.animals = animals;
    }

    public Animal getAnimal() {
        return animal;
    }
@Autowired
@Qualifier("wolf")
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
