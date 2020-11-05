package creating.prototype.deepclone;

import java.io.*;
import java.time.LocalDateTime;

/**
 * 对象克隆(实现java Serializable)
 */
public class WeeklyLog implements Serializable {
    private String name;

    private Integer date;

    private String content;

    private LocalDateTime recordTime;

    public WeeklyLog(String name, Integer date, String content, LocalDateTime recordTime) {
        this.name = name;
        this.date = date;
        this.content = content;
        this.recordTime = recordTime;
    }

    public String getName() {
        return (this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDate() {
        return (this.date);
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getContent() {
        return (this.content);
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(LocalDateTime recordTime) {
        this.recordTime = recordTime;
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
        weeklyLog  = new WeeklyLog("李四",1,"看,飞碟!!!!",LocalDateTime.now());

        //调用克隆方法创建克隆对象
        newLog =  weeklyLog.clone();
        if (null == newLog) {
            System.err.println("克隆失败！");
        }

        //比较
        System.out.println(weeklyLog == newLog);//false
        System.out.println(weeklyLog.getName() == newLog.getName());//false
        System.out.println(weeklyLog.getContent() == newLog.getContent());//false
        System.out.println(weeklyLog.getRecordTime() == newLog.getRecordTime());//false
    }
}
