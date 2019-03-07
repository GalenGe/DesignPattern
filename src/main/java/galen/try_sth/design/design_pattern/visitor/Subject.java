package galen.try_sth.design.design_pattern.visitor;

public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}