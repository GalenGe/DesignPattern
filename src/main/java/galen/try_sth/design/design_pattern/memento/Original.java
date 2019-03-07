package galen.try_sth.design.design_pattern.memento;

/**
 * Original类是原始类，里面有需要保存的属性value及创建一个备忘录类，用来保存value值。
 *
 * Memento类是备忘录类，Storage类是存储备忘录的类，持有Memento类的实例，该模式很好理解
 */

public class Original {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Original(String value) {
        this.value = value;
    }

    public Memento createMemento(){
        return new Memento(value);
    }

    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }
}
