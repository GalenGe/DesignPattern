package galen.try_sth.design.design_pattern.visitor;

public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}