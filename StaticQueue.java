public class StaticQueue<T> {
    private int top = -1;
    private int base = 0;
    private Object[] data;


    public StaticQueue(int size) {
        data = new Object[size];
    }


    public void add(T item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        top++;
        data[top] = item;
    }


    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = (T) data[base];
        data[base] = null;
        base++;
        return item;
    }


    public void clear() {
        top = -1;
        base = 0;
        data = new Object[data.length];
    }


    public boolean isFull() {
        return top == data.length - 1;
    }


    public boolean isEmpty() {
        return base > top;
    }


    public int getBase() {
        return base;
    }

    public int getTop() {
        return top;
    }

    public Object[] getData() {
        return data;
    }
}
