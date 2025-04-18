import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionAPI {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        // nums.add(10);
        // nums.add(20);
        // nums.add(20);
        // System.out.println(nums);

        // for (int num: nums) {
        //     System.out.println(num);
        // }

        // Collection nums2 = new ArrayList<>(); // always use type, by default it works with generic to support all types
        // nums2.add(10);
        // nums2.add(20);
        // nums2.add(30);
        // for (Object num: nums) {
        //     System.out.println((Integer)num);
        // }

        // List interface support more methods than collection interface, so use it instead of Collection.
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        System.out.println(nums);

        for (int num: nums) {
            System.out.println(num);
        }

        System.out.println(nums.get(0)); // return element at index 0
        System.out.println(nums.indexOf(20)); // return index of element 20
        System.out.println(nums.size());
        System.out.println(nums.set(0, 21)); // updates element at index.
        System.out.println(nums.lastIndexOf(21)); // returns index of last occurance of an element in the list
        System.out.println(nums.remove(0)); // remove element at index
        System.out.println(nums.contains(30)); // check if an element exist
        
        System.out.println();
        System.out.println("======================================");

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(10));
        System.out.println(set.remove(10));
        System.out.println(set);

        System.out.println();
        System.out.println("======================================");

        // Map is an interface, hashmap extends it
        Map<Integer, Integer> map = new HashMap<>();
        map.put(21, 21);
        map.put(22, 22);
        map.put(23, 23);
        map.put(24, 24);

        System.out.println(map);
        System.out.println(map.get(22));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsKey(21));
        System.out.println(map.containsValue(22));
        System.out.println(map.put(21, 100));
        System.out.println(map.getOrDefault(100, Integer.MIN_VALUE));
        System.out.println(map.putIfAbsent(25, 200));
        System.out.println(map.remove(25));
        System.out.println(map);

        System.out.println();
        System.out.println("======================================");
    }
}
