package galen.try_sth.design.design_pattern.factory.abstractFactory;

import galen.try_sth.design.design_pattern.factory.normalFactory.MailSender;
import galen.try_sth.design.design_pattern.factory.normalFactory.Sender;

public class SendMailFactory implements Provider {

    @Override
    public Sender produce(){
        return new MailSender();
    }
}