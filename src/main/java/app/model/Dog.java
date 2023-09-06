package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog extends Animal {
    @Autowired
    private Dog dog;

    public String toString() {
        return "I am a Dog!";
    }

}
