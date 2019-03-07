package galen.try_sth.design.design_pattern.factory.abstractFactory;

import galen.try_sth.design.design_pattern.factory.normalFactory.Sender;
import galen.try_sth.design.design_pattern.factory.normalFactory.SmsSender;

public class SendSmsFactory implements Provider{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}