package LSP.Bad;

public class Main {
    
}
class Bird { void fly() { /*...*/ } }
class Penguin extends Bird {
    void fly() { throw new UnsupportedOperationException(); }
}