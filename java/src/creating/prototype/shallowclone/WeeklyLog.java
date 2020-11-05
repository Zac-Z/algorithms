package creating.prototype.shallowclone;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * 对象克隆(实现java cloneable接口)
 *
 * Java语言中的clone()方法满足：
 * (1) 对任何对象x，都有x.clone() != x，即克隆对象与原型对象不是同一个对象；
 * (2) 对任何对象x，都有x.clone().getClass() == x.getClass()，即克隆对象与原型对象的类型一样；
 * (3) 如果对象x的equals()方法定义恰当，那么x.clone().equals(x)应该成立。
 * <p>
 * 为了获取对象的一份拷贝，我们可以直接利用Object类的clone()方法，具体步骤如下：
 * (1) 在派生类中覆盖基类的clone()方法，并声明为public；
 * (2) 在派生类的clone()方法中，调用super.clone()；
 * (3)派生类需实现Cloneable接口。
 */
public class WeeklyLog implements Cloneable {
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
    public WeeklyLog clone() throws CloneNotSupportedException{
        return (WeeklyLog)super.clone();
    }
}

class Demo {
    public static void main(String[] args) {
        //创建原型对象
        WeeklyLog weeklyLog = new WeeklyLog("张三",1,"离成为大佬又近了一小步！",LocalDateTime.now());

        System.out.println("============= 周报 =============");
        System.out.println("周次：" +  weeklyLog.getDate());
        System.out.println("姓名：" +  weeklyLog.getName());
        System.out.println("内容：" +  weeklyLog.getContent());
        System.out.println("记录时间" + weeklyLog.getRecordTime());
        System.out.println("--------------------------------");

        //调用克隆方法创建克隆对象
        WeeklyLog  newLog = null;
        try {
            newLog = weeklyLog.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
            e.printStackTrace();
        }
        newLog.setDate(2);

        System.out.println("============= 周报 =============");
        System.out.println("周次：" + newLog.getDate());
        System.out.println("姓名：" + newLog.getName());
        System.out.println("内容：" + newLog.getContent());
        System.out.println("记录时间" + newLog.getRecordTime());

        //name、content相等,标识地址相同,该拷贝属于浅拷贝
        System.out.println(weeklyLog == newLog);//false
        System.out.println(weeklyLog.getName() == newLog.getName());//true
        System.out.println(weeklyLog.getContent() == newLog.getContent());//true
        System.out.println(weeklyLog.getRecordTime() == newLog.getRecordTime());//true
}
}
