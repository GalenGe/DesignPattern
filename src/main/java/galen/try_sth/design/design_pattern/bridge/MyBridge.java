package galen.try_sth.design.design_pattern.bridge;

public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}