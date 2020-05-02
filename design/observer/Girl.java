package design.observer;
/*
女同学的反应
 */
public class Girl implements ObServerEvent {
    @Override
    public void watchYelloVideo() {
        System.out.println("女同学发现同学在看黄色电影，假装讨厌，骂对方流氓");
    }
}
