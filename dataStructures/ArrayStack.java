package dataStructures;

public class ArrayStack<E> implements Stack<E> {
    private Array<E> array;

    //如果用户传入了容量
    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }

    //如果用户没有传容量  就使用默认的容量
    public ArrayStack() {
        array = new Array<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public void push(E e) throws Exception {
        array.addLast(e);
    }

    @Override
    public E pop() throws Exception {
        return array.remodeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("栈的长度:%d \n",array.getSize()));
        stringBuilder.append("[");
        for (int i = 0; i < array.getSize(); i++) {
            try {
                stringBuilder.append(array.get(i));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (i!=array.getSize()-1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("] 栈顶");
        return stringBuilder.toString();
    }
}
