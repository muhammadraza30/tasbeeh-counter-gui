package tasbeehcounter;

public class TasbeehCounter {
    private int counter;

    public void reset() {
        counter = 0;
    }
    public int increment(){
        return ++counter;
    }
    public int decrement(){
        return --counter;
    }
    public int getCounter() {
        return counter;
    }
}
