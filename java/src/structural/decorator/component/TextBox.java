package structural.decorator.component;

/**
 * 文本框类: 具体构建类
 */
public class TextBox extends Component {
    @Override
    public void display() {
        System.out.println("显示文本框!");
    }
}
