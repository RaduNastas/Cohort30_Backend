package entities;

import org.springframework.stereotype.Component;

@Component
public class Wolf implements Animal{
    private String name = "White Claw";
    @Override
    public void makesSound() {
        System.out.println(name + " Houls");

    }
}
