import entities.Animal;
import entities.Zoo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("entities");
        Zoo zoo = context.getBean(Zoo.class);

        for (Animal animal : zoo.getAnimals())
            animal.makesSound();

        System.out.println("One animal");
        zoo.getAnimal().makesSound();
    }
}
