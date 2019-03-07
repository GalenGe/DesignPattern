package galen.try_sth.design.design_pattern.factory.severalFactory;

import galen.try_sth.design.design_pattern.factory.normalFactory.Sender;

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }
}
