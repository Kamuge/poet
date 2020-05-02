package dataStructures;

import java.util.Arrays;

/*
循环队列
 */
public class LoopQueue<E> implements Queue<E> {
    //不再覆用Array  直接从底层写
    private E[] data;
    //指向数组的头索引
    private int front;
    //指向队列的末尾索引
    private int tail;
    //队列的长度
    private int size;
    //提供有参构造方法

    public LoopQueue(int capaCity) {
        data = (E[]) new Object[capaCity];
        front = 0;
        tail = 0;
        size = 0;
    }

    //提供无参构造
    public LoopQueue() {
        data = (E[]) new Object[10];
        front = 0;
        tail = 0;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    //向队列中添加一个元素  实际上都是从队列尾部开始添加
    @Override
    public void push(E e) throws Exception {
        //判断队列容量是否够，如果不够就要扩容
        if ((tail + 1) % data.length == front) {
            //表示要扩容了
            reSize(data.length * 2);
        }
        data[tail] = e;
        size++;
        tail++;


    }

    //主动扩容的方法  扩容为2倍
    private void reSize(int i) {
        E[] newData = (E[]) new Object[i];
        E   temp=data[size];
        for (int i1 = 0; i1 < data.length; i1++) {
            if (i1!=tail) {
                newData[i1]=data[i1];
            }

        }
        newData[tail]=temp;
        data = newData;
        front=0;
        tail=size;

    }

    //删除元素  从队列头部开始删
    @Override
    public E pop() throws Exception {
        front++;
        size--;
        return data[front];
    }

    @Override
    public E peek() {
        return data[front];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("循环队列的容量：%d,front:%d,tail:%d\n,length:%d\n", size, front, tail,data.length));
        stringBuilder.append("[");
        if (tail > front) {
            for (int i = front; i < tail; i++) {
                stringBuilder.append(data[i]);
                if (i != tail - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]  ：对尾");
        } else if (tail < front) {
            for (int i = front; i < data.length; i++) {
                stringBuilder.append(data[i]);
                stringBuilder.append(",");
            }
            for (int i = 0; i < tail; i++) {
                stringBuilder.append(data[i]);
                if (i!=tail-1) {
                    stringBuilder.append(",");
                }

            }
            stringBuilder.append("]  ：对尾");
        }
        return stringBuilder.toString();
    }
}
