package galen.try_sth.design.design_pattern.adapter;

public class ObjectAdapterTest {
    public static void main(String[] args) {
        Source source = new Source();
        ObjectAdapter target = new ObjectAdapter(source);
        target.method1();
        target.method2();
    }
}
