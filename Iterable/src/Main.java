import java.util.*;

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

        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(2, 5);
        mp.put(5, 7);
        mp.put(8, 10);
        mp.put(6, 1100);

        for(Integer value: mp.values()){
            System.out.println(value);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(100);
        pq.offer(-1);
        pq.offer(0);

        while(!pq.isEmpty()){
            int val = pq.poll();
            System.out.print(val+" ");
        }
    }
}