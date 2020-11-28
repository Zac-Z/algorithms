package structural.decorator.transparent;

import structural.decorator.component.Component;
import structural.decorator.decorator.ComponentDecorator;

/**
 * 黑色边框装饰类：具体装饰类
 */
public class BlackBorderDecorator extends ComponentDecorator {
    /**
     * 注入抽象构件类型的对象
     *
     * @param component
     */
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    private void setBlackBorder(){
        System.out.println("为构件增加黑色边框！");
    }
}
