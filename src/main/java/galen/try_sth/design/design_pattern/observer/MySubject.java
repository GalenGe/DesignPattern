package galen.try_sth.design.design_pattern.observer;

public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }

}  