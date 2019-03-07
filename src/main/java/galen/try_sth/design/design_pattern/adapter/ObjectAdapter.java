package galen.try_sth.design.design_pattern.adapter;

/**
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例
 */
public class ObjectAdapter implements Targetable {

    private Source source;

    public ObjectAdapter(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}
