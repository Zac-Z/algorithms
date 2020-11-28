package structural.decorator.semitransparent;

import structural.decorator.component.Component;
import structural.decorator.decorator.ComponentDecorator;

public class AuditDecorator extends ComponentDecorator{
    /**
     * 注入抽象构件类型的对象
     *
     * @param component
     */
    public AuditDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        System.out.println("增加审核功能");
        super.display();
    }

    public void audit() {
        System.out.println("审核");
    }
}
