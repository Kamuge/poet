package design.template;

abstract class Student {
    public void sleep() {
        tuo_yi_fu();
        tuo_xie();
        guan_deng();
        gai_bei_zi();
    }

    protected abstract void gai_bei_zi();

    protected abstract void guan_deng();

    protected abstract void tuo_xie();

    protected abstract void tuo_yi_fu();


}
