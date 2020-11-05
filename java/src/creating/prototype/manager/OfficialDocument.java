package creating.prototype.manager;

public abstract class OfficialDocument implements Cloneable{

    public OfficialDocument clone() {
        OfficialDocument  far = null;
        try {
            far  = (OfficialDocument)super.clone();
        } catch(CloneNotSupportedException  e) {
            System.out.println("不支持复制！");
        }
        return  far;
    }
    public abstract void display();
}
