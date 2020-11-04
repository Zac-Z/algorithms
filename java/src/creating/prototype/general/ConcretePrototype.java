package creating.prototype.general;

import creating.prototype.Prototype;

/**
 * 通用克隆方法
 */
public class ConcretePrototype implements Prototype {

    //成员属性
    private String  attr;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    public Prototype clone() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAttr(this.attr);
        return prototype;
    }
}

class Demo{
    public static void main(String[] args) {
        Prototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAttr("南方XXXXXX");
        Prototype prototype = concretePrototype.clone();
        System.out.println(concretePrototype.getAttr());
        System.out.println(prototype.getAttr());
        concretePrototype.setAttr("北方XXXXXXXX");
        System.out.println(prototype.getAttr());
    }
}