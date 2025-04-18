import java.util.ArrayList;
import java.util.List;

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
        nums.add(20);
        System.out.println(nums);

        for (int num: nums) {
            System.out.println(num);
        }

        System.out.println(nums.get(0)); // return element at index 0
        System.out.println(nums.indexOf(20)); // return index of element 20
    }    
}
