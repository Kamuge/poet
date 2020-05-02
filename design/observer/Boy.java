    package design.observer;

    /**
     * 男同学的反应
     */
    public class Boy implements ObServerEvent{
        @Override
        public void watchYelloVideo() {
            System.out.println("男同学发现同学在看黄色电影，询问是不是苍老师的电影");
        }
    }
