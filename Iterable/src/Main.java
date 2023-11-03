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
        System.out.println("--------------------");
        Integer[] arr = {8, 0, 1, 100, 12, 45};
        Arrays.sort(arr, (Integer val1, Integer val2) -> val2 - val1);
        for(Integer ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println("\n--------------------");
        Arrays.sort(arr);
        for(Integer ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println("\n---------------------");
        Car[] car = new Car[3];
        car[0] = new Car("Suv", "petrol");
        car[1] = new Car("Sedan", "diesel");
        car[2] = new Car("Hatchback", "cng");

        Arrays.sort(car, (Car obj1, Car obj2) -> obj1.fuel.compareTo(obj2.fuel));
        for(Car cars: car){
            System.out.println(cars.name+" "+cars.fuel);
        }

        byte b = (byte) 139;
        System.out.println(b);


    }
}