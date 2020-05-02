package dataStructures;

public class ArrayQueue<E> implements Queue<E> {
    private Array<E> array;

    //如果用户设置了起始容量
    public ArrayQueue(int capaCity) {
        array = new Array<>(capaCity);
    }

    //如果用户没有设置起始容量
    public ArrayQueue() {
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
        return array.removeFirst();
    }

    @Override
    public E peek() {
        return array.getLast();
    }
}
