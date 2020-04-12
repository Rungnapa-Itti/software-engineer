package factory;

import AdapterPattern.Duckcall;
import AdapterPattern.QuackCounter;
import AdapterPattern.Quackable;

public class CounterDecoratorFactory extends DuckFactory {
    @Override
    public Quackable makeMallardDuck() {
        return new QuackCounter(super.makeMallardDuck());
    }

    @Override
    public Quackable makeDuckCall() {
        return super.makeDuckCall();
    }

    @Override
    public Quackable makeRedheadDuck() {
        return new QuackCounter(super.makeRedheadDuck());
    }

    @Override
    public Quackable makeRubberDuck() {
        return new QuackCounter(super.makeRubberDuck());
    }
}
