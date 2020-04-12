package AdapterPattern;

public class Duckcall implements Quackable{
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
