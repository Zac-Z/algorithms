package structural.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;

public class ProxyFactory {
    public static Object getGcLibDynProxy(Object target){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new CglibDynProxyLawyer());
        Object targetProxy= enhancer.create();
        return targetProxy;
    }
}
