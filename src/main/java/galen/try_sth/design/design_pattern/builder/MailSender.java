package galen.try_sth.design.design_pattern.builder;

public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mail sender!");
    }
}
