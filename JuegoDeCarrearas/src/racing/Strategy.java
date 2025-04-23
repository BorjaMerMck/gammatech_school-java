package racing;


import driver.Driver;

public interface Strategy {
    void apply(Driver driver, double currentLapTime);
}