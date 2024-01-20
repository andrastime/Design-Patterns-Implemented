package observer.models;
import java.util.Observable;

public class ModelIntegers extends Observable{
    protected int input1;
    protected int input2;

    public int getInput1(){
        return input1;
    }

    public int getInput2(){
        return input2;
    }

    public void modifyValues(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
        setChanged();
        notifyObservers();
    }

    public void reset() {
        input1 = 0;
        input2 = 0;
        setChanged();
        notifyObservers();
    }
}
