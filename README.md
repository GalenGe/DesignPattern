设计模式的分类
创建型模式，共五种：

单例模式、工厂方法模式、抽象工厂模式、建造者模式、原型模式。

结构型模式，共七种：

适配器模式、装饰者模式、代理模式、门面模式（外观模式）、桥梁模式、组合模式、享元模式。

行为型模式，共十一种：

策略模式、模版方法模式、观察者模式、迭代器模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。

扩展模式：

规则模式、对象池模式、雇工模式、黑板模式、空对象模式。

 

六大原则
总原则：开闭原则

定义：一个软件实体如类、模块或函数应该对扩展开放，对修改关闭。

    简单的说就是，当一个软件实体需要扩展的时候，不要去修改原有的代码，而是去扩展原有的代码。其实开闭原则是最基础的一个原则，下面六个原则都是开闭原则的具体形态。

为什么要采用开闭原则：

对测试的影响：通过扩展实现变化，测试只需要对新增类进行单元测试即可，单元测试是孤立的，只需要保证新类提供的方法正确就行。而如果是修改类来实现变化，则该类相应的测试方法也都要随着重构，而且当类很复杂时难免存在遗漏情况。
可以提高复用性：避免以后维护人员为了修改一个微小的缺陷或增加新功能，却要在整个项目中到处查找相关的代码逐一修改。
提高可维护性：开发新功能时，扩展一个类往往比修改一个类更容易。
面向对象开发的要求
 

1. 单一职责原则（Single Responsibility Principle，SRP）

定义：应该有且仅有一个原因引起类的变更。

优点：

类的复杂性降低。类的职责单一，复杂性自然就降低了。
可读性高。
易维护。
变更引起的风险降低。
难点：

“职责”和“变化原因”都是不可度量的，因项目、环境而异。
过细的划分会引起类的剧增，人为的增加系统的复杂性。
建议：

接口的设计一定要做到单一原则，类的设计尽量做到只有一个原因引起变化。
职责的划分需要根据项目和经验来权衡，既要保证职责的单一性，又要尽量避免过细的划分。
 

2. 里氏替换原则（Liskov Substitution Principle，LSP）

定义：所有引用基类的地方都必须能透明地使用其子类的对象。

继承的优点：

代码共享，提高代码的重用性。
提高代码的可扩展性。
提高产品或者项目的开放性。
继承的缺点：

继承是侵入式的，只要继承，就拥有了父类的属性和方法。
降低代码灵活性，子类拥有了父类的属性和方法，多了一些约束。
增强了耦合性。父类的常量、变量或方法改动时，必须还要考虑子类的修改，可能会有大段代码需要重构。
里氏替换原则四层含义：

子类必须完全实现父类的方法
在类中调用其他类时务必使用父类或接口，如若不能，则说明类的设计已经违背LSP原则。
如果子类不能完整的实现父类的方法，或者父类的方法在子类中发生畸变，这建议断开父子继承关系，采用依赖、聚集、组合等方式代替继承。
子类可以有自己的特性：即子类出现的地方父类未必可以出现。
覆盖父类的方法时输入参数可以被放大：输入参数类型宽于父类的类型的覆盖范围，例如 hashmap -> map。
覆盖父类的方法时输出参数可以被缩小
 

3. 依赖倒置原则（Dependence Inversion Principle，DIP）

定义：

高层模块不应该依赖低层模块，两者都要改依赖其抽象（模块间的依赖通过抽象产生，实现类不发生直接的依赖关系）
抽象不应该依赖细节（接口或者抽象类不依赖实现类）
细节可以依赖抽象（实现类依赖接口或者抽象类）
建议：

每个类尽量都有接口或抽象类。
变量的表面类型尽量是接口或抽象类。
任何类都不应该从具体类派生（其实只要不是超过两层的继承都是可以忍受的）。
尽量不要复写基类已实现的方法。
结合里氏替换原则使用。
面向接口编程：

    接口负责定义 public 属性和方法，并且声明与其它对象的依赖关系，抽象类负责公共构造部分的实现，实现类准确实现业务逻辑，同时在适当的时候对父类进行细化。

 

4. 接口隔离原则

定义：客户端不应该依赖他不需要的接口，类之间的依赖关系应该建立在最小的接口上。

四层含义：

接口尽量要小，不要出现臃肿的接口。
接口要高内聚。
只提供访问者需要的方法：每个接口中不存在子类用不到却必须实现的方法，如果不然，就要将接口拆分。
接口设计是有限度的：接口设计粒度越小，系统越灵活。但是结构会越复杂、开发难度增加，可维护性降低。
建议：

一个接口只服务一个子模块或者业务逻辑。
尽量压缩接口内的方法，保证方法都是有用的，避免臃肿。
已经被污染的接口尽量去修改，若变更风险大，则采用适配器模式转化处理。
深入了解业务逻辑，拒绝盲从。
 

5. 迪克特法则（最少知道原则）（Least Knowledge Principle，LKP）

定义：一个对象应该对其他对象有最少的了解（低耦合）。

三层含义：

一个类只与朋友交流，不和陌生类交流，方法尽量不引入类中不存在的对象。
尽量不要对外暴露过多的 public 方法和非静态的 public 变量，尽量内敛。
自己的就是自己的。如果一个方法放在本类中，既不增加类间关系，也对本类不产生负面影响，那就放置在本类中。
总结：
    迪米特法则的核心观念就是类间解耦，低耦合。其负面影响就是产生了大量的中转或者跳转类，导致系统复杂性提高，也为维护带来了难度。需要反复权衡，既做到结构清晰，又要高内聚低耦合。
如果一个类需要跳转两次以上才能访问到另一个类，就需要想办法重构了。

 

6. 合成复用原则（Composite/Aggregate Reuse Principle，CARP）

定义：是在一个新的对象里面使用一些已有的对象，使其成为新对象的一部分。新对象通过委派达到复用已有功能的效果。

优点：
    使用对象的合成/聚合将有助于你保持每个类被封装，并被集中在单个任务上。这样类和集成层次会保持较小规模，并且不太可能增长为不可控制的庞然大物。

缺点：
    通过这种方式复用建造的系统会有较多的对象需要管理；为了能将多个不同的对象作为组合块来使用，必须仔细地对接口进行定义。

简单地说：尽量首先使用合成/聚合的方式，而不是使用继承。
--------------------- 
作者：阿飞__ 
来源：CSDN 
原文：https://blog.csdn.net/afei__/article/details/80412746 
版权声明：本文为博主原创文章，转载请附上博文链接！