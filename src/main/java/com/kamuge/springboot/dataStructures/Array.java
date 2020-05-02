package dataStructures;

public class Array<E> {
    private E[] data;
    private int size;

    //提供有参构造  用户传来一个初始容量
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    //如果用户没有传入数值
    public Array() {
        //默认给用户开辟十个长度的空间
       /* data=new int[10];
        size=0;*/
        this(10);
    }

    //如果用户传来一个静态数值  怎么提供构造函数？
    //查看数组的长度
    public int getSize() {
        return size;
    }

    //获取容量
    public int getCapacity() {
        return data.length;
    }

    //判断数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //向数组的末尾添加元素
    public void addLast(E e) throws Exception {
       /* //首先判断数组有没有容量
        if (data.length == size) {
            throw new IllegalAccessException("数组的容量已经用完");
        }
        data[size] = e;
        size++;*/
        add(e, size);
    }

    //在数组的开头添加元素
    public void addFirst(E e) throws Exception {
        add(e, 0);
    }

    //向数组中的制定位置添加元素
    public void add(E e, int index) throws Exception {
        //判断索引是否合法
        if ((index < 0 || index > size)) {
            throw new Exception("索引越界");
        }
        //判断数组是否有空间
        if (data.length == size) {
            //    throw new IllegalAccessException("数组的容量已经用完，无法继续 添加元素");
            reSize(data.length << 1);
        }

        //分析添加过程  从size开始，所有的元素往后挪动一位  同时将e的值赋给index的位置
        for (int i = size - 1; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = e;
        size++;
    }

    private void reSize(int newCapaCithy) {
        //将原数组赋给新数组
        E[] newData = (E[]) new Object[newCapaCithy];
        for (int i1 = 0; i1 < size; i1++) {
            newData[i1] = data[i1];
        }
        data = newData;
    }

    //向数组末尾删除元素
    public void removeLast(int e) throws IllegalAccessException {
        if (size < 1) {
            throw new IllegalAccessException("这是一个空数组，无法删除元素");
        }
        //  data[size]=null;
        size--;
    }

    //查询元素最后一个元素
    public E getLast() {
        return data[size - 1];
    }

    //查询第一个元素
    public E getFirst() {
        return data[0];
    }

    //查询 某个 索引位置的元素
    public E get(int index) throws Exception {
        //判断索引是否合法
        if ((index < 0 || index > size)) {
            throw new Exception("索引非法");
        }
        return data[index];
    }

    //修改某个索引位置的元素
    public void set(int index, E e) throws Exception {
        //判断索引是否合法
        if ((index < 0 || index >= size)) {
            throw new Exception("索引非法");
        }
        data[index] = e;
    }

    //数组是否包含某个元素
    public boolean contain(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    //查找某个元素所在的索引
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    //删除数组的末尾元素
    public E remodeLast() throws Exception {
        return remove(size - 1);
    }

    //删除数组头元素
    public E removeFirst() throws Exception {
        return remove(0);
    }

    public E remove(int index) throws Exception {
        //判断索引是否合法
        if ((index < 0 || index >= size)) {
            throw new Exception("索引非法");
        }
        E temp = data[index];
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }

        size--;
        return temp;

    }

    //删除某个元素
    public void removeElement(E e) throws Exception {
        //判断元素是否存在
        int i = find(e);
        if (-1 != i) {
            remove(i);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("数组的长度:size= %d,数组的空间= %d\n", size, data.length));
        stringBuilder.append("【");
        for (int i = 0; i < size; i++) {
            if (i < size - 1) {
                stringBuilder.append(data[i]);
                stringBuilder.append(",");
            } else {
                stringBuilder.append(data[i]);
            }
        }
        stringBuilder.append("】");
        return stringBuilder.toString();
    }


}
