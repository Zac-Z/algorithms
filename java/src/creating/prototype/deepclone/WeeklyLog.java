package creating.prototype.deepclone;

import java.io.*;

/**
 * 对象克隆(实现java Serializable)
 */
public class WeeklyLog implements Serializable {
    private String name;

    private String date;

    private String content;

    public String getName() {
        return (this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return (this.date);
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return (this.content);
    }

    public void setContent(String content) {
        this.content = content;
    }

    //克隆方法clone()，使用Java语言提供的克隆机制
    //使用序列化技术实现深克隆

    public WeeklyLog clone() {
        try (ByteArrayOutputStream bao=new  ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bao)) {
            //将对象从流中取出
            oos.writeObject(this);

            try (ByteArrayInputStream bis=new  ByteArrayInputStream(bao.toByteArray());
                 ObjectInputStream ois=new  ObjectInputStream(bis)){
                //将对象写入流中
                return  (WeeklyLog)ois.readObject();
            }
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

class Demo {
    public static void main(String[] args) {
        WeeklyLog  weeklyLog, newLog ;
        //创建原型对象
        weeklyLog  = new WeeklyLog();
        weeklyLog.setName("李四");
        //调用克隆方法创建克隆对象
        newLog =  weeklyLog.clone();
        if (null == newLog) {
            System.err.println("克隆失败！");
        }

        //比较周报
        System.out.println(weeklyLog == newLog);

        //比较引用对象
        System.out.println(weeklyLog.getName() == newLog.getName());
    }
}
