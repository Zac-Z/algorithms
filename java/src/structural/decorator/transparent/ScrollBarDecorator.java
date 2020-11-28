package structural.decorator.transparent;

import structural.decorator.component.Component;
import structural.decorator.decorator.ComponentDecorator;

/**
 * 滚动条装饰类：具体装饰类
 */
public class ScrollBarDecorator extends ComponentDecorator {
    /**
     * 注入抽象构件类型的对象
     *
     * @param component
     */
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    private void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }
}
