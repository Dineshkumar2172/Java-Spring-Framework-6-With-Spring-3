import java.util.ArrayList;
import java.util.Collection;

public class CollectionAPI {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(20);
        System.out.println(nums);

        for (int num: nums) {
            System.out.println(num);
        }
    }    
}
