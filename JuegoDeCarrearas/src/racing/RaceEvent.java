package racing;


import driver.Driver;

public interface RaceEvent {
    void onLapComplete(Driver driver, double lapTime);
    void onRaceFinish(Driver winner);
}