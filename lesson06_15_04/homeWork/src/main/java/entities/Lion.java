package entities;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal{

    private String name = "King";
    @Override
    public void makesSound() {

        System.out.println(name + " rrrrr");

    }
}
