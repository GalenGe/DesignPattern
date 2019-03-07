package galen.try_sth.design.design_pattern.templateMethod;

public class Plus extends AbstractCalculator {

    @Override
    public int calculate(int num1,int num2) {
        return num1 + num2;
    }
}