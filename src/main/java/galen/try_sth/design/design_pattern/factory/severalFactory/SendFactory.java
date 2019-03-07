package galen.try_sth.design.design_pattern.factory.severalFactory;

import galen.try_sth.design.design_pattern.factory.normalFactory.MailSender;
import galen.try_sth.design.design_pattern.factory.normalFactory.Sender;
import galen.try_sth.design.design_pattern.factory.normalFactory.SmsSender;


//多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，
// 如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法
public class SendFactory {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
