import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        //deque operations
        list.addLast(67);
        list.addLast(90);
        list.addFirst(100);

       for(Integer val: list){
           System.out.print(val+" ");
       }
        System.out.println("----------------");
       //list operations
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);
        list2.add(101);

        for(Integer val: list2){
            System.out.print(val+" ");
        }
    }
}