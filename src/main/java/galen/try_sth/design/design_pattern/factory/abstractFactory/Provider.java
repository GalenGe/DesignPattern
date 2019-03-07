package galen.try_sth.design.design_pattern.factory.abstractFactory;

import galen.try_sth.design.design_pattern.factory.normalFactory.Sender;

public interface  Provider {
    public Sender produce();
}
