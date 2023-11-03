import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(0, 120);
        list.add(1, 900);

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(8);
        list1.add(45);

        list.addAll(list1);

        list.replaceAll((Integer val) -> val * 9);

        list.sort((Integer val1, Integer val2) -> val1 - val2);
        for(Integer val: list){
            System.out.print(val+" ");
        }
        System.out.println();

        list.set(1, 17);
        for(Integer val: list){
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println("---- Traversing in forward direction ----");
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            int val = itr.next();
            System.out.print(val+" ");
        }

        System.out.println("\n---- Traversing in backward direction ----");
        ListIterator<Integer> itr1 = list.listIterator(list.size());
        while(itr1.hasPrevious()){
            int val = itr1.previous();
            System.out.print(val+" ");
        }
    }
}