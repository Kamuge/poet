package design.template;

public class BoyStudent  extends Student {
    @Override
    protected void gai_bei_zi() {
        System.out.println("男同学开始盖被子");
    }

    @Override
    protected void guan_deng() {
        System.out.println("男同学开始关灯");

    }

    @Override
    protected void tuo_xie() {
        System.out.println("男同学开始拖鞋");

    }

    @Override
    protected void tuo_yi_fu() {
        System.out.println("男同学开始脱衣服");

    }
}
