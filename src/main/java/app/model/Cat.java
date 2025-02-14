package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat extends Animal {
    @Autowired
    private Cat cat;

    @Override
    public String toString() {
        return "Im a Cat";
    }
}
