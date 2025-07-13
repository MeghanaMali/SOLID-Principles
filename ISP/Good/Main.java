package ISP.Good;

public class Main {
    
}
interface Drivable { void drive(); void stop(); }
interface Refuelable { void refuel(); }
interface DoorOperable { void openDoors(); }

class Bike implements Drivable, Refuelable {

     public void drive() { /* implementation */ }
    public void stop() { /* implementation */ }
    public void refuel() { /* implementation */ }
    

}
class Car implements Drivable, Refuelable, DoorOperable { 
    public void drive() { /* implementation */ }
    public void stop() { /* implementation */ }
    public void refuel() { /* implementation */ }
    public void openDoors() { /* implementation */ }
    /* full vehicle */ }