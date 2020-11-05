package creating.prototype.manager;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PrototypeManager {

    //定义一个map，用于存储原型对象
    private Map<String,OfficialDocument> map= new ConcurrentHashMap<>(2);

    private static PrototypeManager pm =  new PrototypeManager();

    //为map增加公文对象
    private  PrototypeManager() {
        map.put("far",new  FAR());
        map.put("srs",new  SRS());
    }

    //增加新的公文对象

    public void addOfficialDocument(String  key,OfficialDocument doc) {
        map.put(key,doc);
    }

    //通过浅克隆获取新的公文对象
    public OfficialDocument  getOfficialDocument(String key){
        return  ((OfficialDocument)map.get(key)).clone();
    }

    public static PrototypeManager  getPrototypeManager() {
        return pm;
    }
}

class Demo {
    public  static void main(String args[]) {
        //获取原型管理器对象
        PrototypeManager pm =  PrototypeManager.getPrototypeManager();
        OfficialDocument  doc1,doc2,doc3,doc4;
        doc1  = pm.getOfficialDocument("far");
        doc1.display();
        doc2  = pm.getOfficialDocument("far");
        doc2.display();
        System.out.println(doc1  == doc2);
        doc3  = pm.getOfficialDocument("srs");
        doc3.display();
        doc4  = pm.getOfficialDocument("srs");
        doc4.display();
        System.out.println(doc3  == doc4);
    }

}