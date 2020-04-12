package factory;

import AdapterPattern.*;
import dacorators.DoubleTab;

public class CounterFactory {
    public Quackable makeMallardDuck(){
        return new MallardDuck();
    }

    public Quackable makeDuckCall(){
        return new Duckcall();
    }

    public Quackable makeGoose(){
        return new GooseAdapter(new Goose());
    }

    public Quackable makePigeon(){
        return new DoubleTab(new Pigeon());
    }

    public Quackable makeRedheadDuck(){
        return new RedheadDuck();
    }

    public Quackable makeRubberDuck(){
        return new RubberDuck();
    }
}
