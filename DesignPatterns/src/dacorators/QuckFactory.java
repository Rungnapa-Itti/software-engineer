package dacorators;

import AdapterPattern.*;

public class QuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new Duckcall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
