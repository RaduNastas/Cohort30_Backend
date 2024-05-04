package entities;

import org.springframework.stereotype.Component;

@Component
public class Eagle implements Animal{

    private String name = "Eagle";
    @Override
    public void makesSound() {
        System.out.println(name + " screech");

    }
}
