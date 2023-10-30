import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            int val = itr.next();
            System.out.println(val);
            if(val == 2){
                itr.remove();
            }
        }
        System.out.println("After removing 2 from list");
        itr = list.iterator();
        while(itr.hasNext()){
            int val = itr.next();
            System.out.println(val);
        }
    }
}