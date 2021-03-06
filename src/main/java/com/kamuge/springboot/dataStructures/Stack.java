package dataStructures;

public interface Stack<E> {
    int getSize();

    //添加元素
    void push(E e) throws Exception;

    //删除元素
    E pop() throws Exception;

    //查看栈顶元素
    E peek();

}
