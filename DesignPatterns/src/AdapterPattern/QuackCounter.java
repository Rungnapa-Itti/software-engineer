package AdapterPattern;

import AdapterPattern.Quackable;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfGuacks;
    public QuackCounter(Quackable duck){
        this.duck = duck;

    }

    @Override
    public void quack() {
        duck.quack();
        numberOfGuacks++;
    }
    public static int getQuacks(){
        return numberOfGuacks;
    }
}
