package ISP.Bad;

public class Main {
    
}
interface Vehicle {
    void drive();
    void stop();
    void refuel();
    void openDoors();
}

class Bike implements Vehicle {
    public void openDoors() { /* not applicable */ }
    public void drive() { /* implementation */ }
    public void stop() { /* implementation */ }
    public void refuel() { /* implementation */ }
}
