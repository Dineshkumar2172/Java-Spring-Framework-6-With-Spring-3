import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        final Integer MAX_SIZE = 10_000;
        List<Integer> nums = new ArrayList<>(MAX_SIZE);
        Random random = new Random();
        for (int i = 0; i < MAX_SIZE; i++) {
            nums.add(random.nextInt(100)); // 100 is max bound
        }

        int sum1 = nums.stream()
                        .map(n -> n*2)
                        .reduce(0, (current, next) -> current+next);

        System.out.println(sum1);

        long startSeq = System.currentTimeMillis();

        int sum2 = nums.stream()
                        .map(n -> n*2)
                        .mapToInt(i -> i) // it allows us to make use of additional integer related methods like sum
                        .sum();

        System.out.println(sum2);

        long endSeq = System.currentTimeMillis();
        System.out.println("Time taken using stream : " + (endSeq - startSeq));
        
        startSeq = System.currentTimeMillis();
        int sum3 = nums.parallelStream() // allows us to make efficient use of multiple threads
                        .map(n -> n*2)
                        .mapToInt(i -> i)
                        .sum();

        System.out.println(sum3);
        endSeq = System.currentTimeMillis();
        System.out.println("Time taken using parallelStream : " + (endSeq - startSeq));

        // observation
        // Time taken using stream : 2
        // Time taken using parallelStream : 4
        //
        // From what's seen above, parallelStream takes more time, it's expected since the machine takes some time to bring up threads
        // in parallelStream method comparing to sequential stream, however in the events of handling huge volume of data,
        // parallelStream will give better results comparing to sequential stream.
    }   
}
