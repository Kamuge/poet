package design.observer;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private boolean watch_status = false;
    //关注学生行为的观察着们
    List<ObServerEvent> list = new ArrayList<>();

    {
        list.add(new Teacher());
        list.add(new Boy());


        list.add(new Girl());
    }

    public boolean isWatch() {
        return watch_status;

    }

    //同学拿出手机准备看了
    public void watch_Yellow_video() {
        watch_status = true;
        for (ObServerEvent obServerEvent : list) {
            obServerEvent.watchYelloVideo();
        }

    }

}
