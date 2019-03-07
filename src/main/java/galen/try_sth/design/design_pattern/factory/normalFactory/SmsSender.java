package galen.try_sth.design.design_pattern.factory.normalFactory;

public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
