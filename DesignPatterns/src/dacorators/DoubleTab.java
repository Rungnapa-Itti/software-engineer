package dacorators;

import AdapterPattern.Pigeon;
import AdapterPattern.Quackable;

public class DoubleTab implements Quackable {
    private Pigeon pigeon;

    public DoubleTab(Pigeon pigeon){
        this.pigeon = pigeon;
    }

    public void call(){
        this.pigeon.coo();
    }

    @Override
    public void quack() {
        call();
        call();
        System.out.println();
    }

}
