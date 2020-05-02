package design.observer;

import java.util.Observer;

/**
 * 老师的反应
 */
public class Teacher implements ObServerEvent {
    @Override
    public void watchYelloVideo() {
        System.out.println("老师发现学生在看黄色电影，通知家长");
    }
}
