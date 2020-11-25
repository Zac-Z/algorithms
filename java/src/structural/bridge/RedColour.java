package structural.bridge;

/**
 * 具体实现化角色
 */
public class RedColour implements Colour {
    @Override
    public void operationImpl() {
        System.out.print("红色");
    }
}
