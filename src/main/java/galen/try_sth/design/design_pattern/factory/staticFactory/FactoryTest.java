package galen.try_sth.design.design_pattern.factory.staticFactory;

import galen.try_sth.design.design_pattern.factory.normalFactory.Sender;

public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.Send();
    }
}
