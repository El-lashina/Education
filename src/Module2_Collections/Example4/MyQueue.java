package Module2_Collections.Example4;

import java.util.LinkedList;

public class MyQueue <E> {
    private LinkedList<E> list = new LinkedList<>();

    public void add(E el) {
        list.addLast(el); //добавляем в конец очереди
    }

    public E get(int i) {
        return list.pollFirst(); //извлекаем из начала
    }

    public void print() { //печать очереди от начала к концу
        if (list.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (E item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void clear() { //очистка очереди
        list.clear();
    }

    public MyQueue<E> reverse() {
     //        LinkedList<E> listRevers = new LinkedList<>();
        MyQueue <E> myQueue = new MyQueue<>();
        do myQueue.add(list.removeLast());
        while (!list.isEmpty());
        return myQueue;
    }

    public MyQueue<E> reverse( int start, int finish) {
        if (start <= 0 || finish <= 0 || finish> list.size() ) {
            return null;
        }
        if (start > finish) {
            int tmp = start;
            start = finish;
            finish = tmp;
        }
        MyQueue <E> myQueue = new MyQueue<>();
        int j = finish-1;
        for (int i =0; i<start-1; i++) {
            myQueue.add(list.get(i));
        }
        do {
            myQueue.add(list.get(j));
            j--;
        } while (j>=start-1);
        for (int i =finish; i<list.size(); i++) {
            myQueue.add(list.get(i));
        }
        return myQueue;
        }

    public E middleNode() {
        return list.get((list.size())/2);
    }
}
