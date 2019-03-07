package galen.try_sth.design.design_pattern.bridge;

public class SourceSub1 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}