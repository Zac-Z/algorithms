package creating.factory.simplefactory.statical;

import creating.factory.entity.DellMounse;
import creating.factory.entity.HpMouse;
import creating.factory.interfaces.IMouse;

import java.util.HashMap;
import java.util.Map;

public class MouseFactory {
    private static final Map<String, IMouse> MOUSE_MAP = new HashMap<>();

    static {
        MOUSE_MAP.put("dell",new DellMounse());
        MOUSE_MAP.put("hp",new HpMouse());
    }

    public static IMouse createMouse(String brand) {
        if (null == brand || brand.isEmpty()) {
            return null;
        }
        return MOUSE_MAP.get(brand);
        /*IMouse mouse = null;
        switch (brand) {
            case "dell":
                mouse = new DellMounse();
                break;
            case "hp":
                mouse = new HpMouse();
                break;
            default:
                System.out.println("无品牌记录");
                break;
        }
        return mouse;*/
    }
}
