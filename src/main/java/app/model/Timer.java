package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("timerBean")
public class Timer {
    @Autowired
    private Timer timer;

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
