package design.build;

import jdk.nashorn.internal.ir.CallNode;

public class Materiel {
    private String qrcodeNo;
    private String name;
    private int age;
    private Long data;

    Materiel() {
    }
    public static class MaterielBuild{
        Materiel  materiel=new Materiel();
        public MaterielBuild  Materiels(String qrcodeNo,String name,int age,Long data){
            materiel.age=age;
            materiel.data=data;
            materiel.name=name;
            materiel.qrcodeNo=qrcodeNo;
            return this;
        }
        public MaterielBuild Iqc(String qrcodeNo){
            materiel.qrcodeNo=qrcodeNo;
            return this;
        }
        public MaterielBuild  Radium(int age){
            materiel.age=age;
            return this;
        }
        public Materiel build(){
            return materiel;
        }
    }

    public String getQrcodeNo() {
        return qrcodeNo;
    }

    public void setQrcodeNo(String qrcodeNo) {
        this.qrcodeNo = qrcodeNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getData() {
        return data;
    }

    public void setData(Long data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Materiel{" +
                "qrcodeNo='" + qrcodeNo + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", data=" + data +
                '}';
    }
}
