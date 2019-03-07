package galen.try_sth.design.design_pattern.proxy;

public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}