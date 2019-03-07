package galen.try_sth.design.design_pattern.factory.staticFactory;

import galen.try_sth.design.design_pattern.factory.normalFactory.MailSender;
import galen.try_sth.design.design_pattern.factory.normalFactory.Sender;
import galen.try_sth.design.design_pattern.factory.normalFactory.SmsSender;

//静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。

//总体来说，工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。
// 在以上的三种模式中，第一种如果传入的字符串有误，不能正确创建对象，
// 三种相对于第二种，不需要实例化工厂类，所以，大多数情况下，我们会选用第三种——静态工厂方法模式。
public class SendFactory {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
