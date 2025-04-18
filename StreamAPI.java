import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        // System.out.println(nums);

        // nums.forEach(n -> System.out.println(n));

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2 == 0); // s2 will have only even numbers
        Stream<Integer> s3 = s2.map(n -> n*2); // s3 will have double even numbers from previous step
        // s1.forEach(n -> System.out.println(n));
        // s1.forEach(n -> System.out.println(n)); // we cannot reuse stream
        // s3.forEach(n -> System.out.println(n));
        int result = s3.reduce(0, (c, e) -> c+e); // result 
        System.out.println(result);


        // we can peform all above operaiton in single step - neat one's
        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4);
        int newResult = nums2.stream().filter(n -> n%2 == 0).map(n -> n%2).reduce(0, (c, e) -> c+e);
        System.out.println(newResult);


        // filter - filter input object.
        // map - perform transformation on filtered data.
        // reduce - perform some meaningful operation of transformed data.

        // map, filter, reduce, sorted
        List<Integer> nums3 = Arrays.asList(4, 1, 2, 5, 1, 8, 9, 10);
        Stream<Integer> stream = nums3.stream().filter(n -> n%2 == 0).map(n -> n*2).sorted();
        stream.forEach(n -> System.out.println(n));

        // parallelStream - in order to improve the performance by making use of multiple threads
        List<Integer> nums4 = Arrays.asList(1, 2, 3, 4);
        int stream2 =nums4.parallelStream().filter(n -> n%2 == 0).map(n -> n*2).reduce(0, (c,e) -> c+e);
        System.out.println(stream2);
    }
}
