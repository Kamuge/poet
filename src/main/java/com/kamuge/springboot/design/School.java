package design;

import java.io.*;

public class School {
    private String schoolName;
    private Student student;

    public School(String schoolName, Student student) {
        this.schoolName = schoolName;
        this.student = student;
    }

    public School() {
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", student=" + student +
                '}';
    }

    //提供深克隆的方法
    public Object deepCopy() {
        //创建流对象、
        //输出流
        ByteArrayOutputStream bos = null;
        //对象输出流
        ObjectOutputStream oos = null;
        //输入流
        ByteArrayInputStream bis = null;
        //对象输入流
        ObjectInputStream ois = null;

        //第一步  序列化操作

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //把当前对象以对象流的方式输出
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            School school = (School) ois.readObject();
            return school;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        } finally {
            //开闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
