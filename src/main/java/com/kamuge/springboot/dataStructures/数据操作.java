package dataStructures;

public class 数据操作 {
    public static void main(String[] args) {
        //要使用数组   必须先开辟空间
        int[] arr = new int[10];
        //给数组赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        //从数组中取值
        for (int i : arr) {
            System.out.println(i);
        }
        //数组的第二种赋值方式
        int[] scores = new int[]{100, 90, 85};
        for (int score : scores) {
            System.out.println(score);
        }
        //修改数组某个位置的值
        scores[0] = 200;
        for (int score : scores) {
            System.out.println(score);
        }
    }

}
