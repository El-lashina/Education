import java.util.Scanner;

public class Main {


    public static Node createSLLFromString(String s) {
        String[] words = s.split(" +");
        Node head = new Node(words[0]);
        for(int i = 1; i < words.length; i++) {
            Node data = head;
            if (data.next != null) {
                data = data.next;
            }
            data.next = new Node(words[i]);
        }
        return head;
    }

    public static void printSLL(Node head) {
        Node data = head;
        while(data != null) {
            System.out.print(data.data +" ");
            data = data.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        Node head = createSLLFromString(s);
        printSLL(head);
//        System.out.println(checkValue(head,value));
    }

//    public static boolean checkValue(Node head, int value){
//        boolean result = false;
//        Node data = head;
//        int x = value;
//        while(data != null) {
//            if (data.data.equals(x)) {
//                result = true;
//            }
//        }
//        System.out.println(result);
//        return result;
//    }
}