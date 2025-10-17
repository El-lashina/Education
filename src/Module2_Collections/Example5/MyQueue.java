package Module2_Collections.Example5;

public class MyQueue <E> {
    private ListNode<E> begin = null;
    private ListNode<E> end = null;

    public MyQueue() {

    }

    public MyQueue(ListNode<E> begin, ListNode<E> end) {
        this.begin = begin;
        this.end = end;
    }

    public class ListNode<E> {
        private E val;
        private ListNode<E> next;

        ListNode() {
        }

        ListNode(E val) {
            this.val = val;
        }

        ListNode(E val, ListNode<E> next) {
            this.val = val;
            this.next = next;
        }
    }

    public void add(E el) { //добавляем в конец очереди
        ListNode<E> node = new ListNode<>(el, null); //создаем последний элемент с нулевой ссылкой
        if (end == null) { //список был пуст
            end = node; //обе ссылки на этот элемент
            begin = node;
            return;
        }
        end.next = node; //привязать элемент к списку
        end = node; //указатель конца передвинуть на новый элемент
    }

    public E get() {
        if (begin == null) return null; // если пустой список
        E tmp = begin.val; //делаем копию данных
        begin = begin.next; //начало - на следующий элемент
        //прежний первый элемент подберет сборщик мусора
        return tmp; //возвращаем данные из начала очереди
    }

    public void print() {//печать очереди от начала к концу
        if (begin == null) {
            System.out.println("Queue is empty");
            return;
        }
        ListNode item = begin;
        while (item != null) {
            System.out.print(item.val + " ");
            item = item.next; //переходим к следующему элементу
        }
        System.out.println();
    }

    public void clear() { //очистка очереди
        begin = null;
        end = null;
        //все элементы списка соберет сборщик мусора, поскольку к ним потерян доступ
    }

    //put your code here
    public MyQueue<E> reverse() {
        MyQueue<E> queue = new MyQueue<>();
        ListNode tmp;
        queue.add (end.val);
        do {
            tmp = begin;
            do {
                tmp = tmp.next;
            } while (tmp.next.next.next != null);
            queue.add((E) tmp.next.val);
            ListNode<E> node = new ListNode<>((E)tmp.next.val, null);
            tmp.next = node;
            System.out.println(tmp.next.val);
        } while ( begin.next.next.next!=null);
        queue.add(begin.next.val);
        queue.add(begin.val);
        return queue;
    }

    public int size() {
       int n =1;
       ListNode tmp = begin;
       do {
           tmp = tmp.next;
           n++;
       } while (tmp.next !=null);
       return n;
    }
    public E middleNode() {
        ListNode tmp = begin;
        for (int i=0; i<size()/2; i++) {
            tmp= tmp.next;
        }
        return (E) tmp.val;
    }
}
