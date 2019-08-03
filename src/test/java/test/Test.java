package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

    public static Date stepMonth(Date sourceDate, int month) {

        Calendar c = Calendar.getInstance();
        c.setTime(sourceDate);
        c.add(Calendar.MONTH, month);
        return c.getTime();
    }

    public static int compareTime(Date startDate, Date endDate) {

        int i = startDate.compareTo(endDate);
        return i;
    }


    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        Date date = new Date();
        System.out.println(df.format(date));   // 当前系统时间
        Date newDate = stepMonth(date, -1);
        System.out.println("当前时间前1个月的日期：" + df.format(newDate));
        System.out.println("大小比较：" + compareTime(date,newDate));
    }
}
