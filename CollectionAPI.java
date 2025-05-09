import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;


// without comparable interface implementation
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

// with comparable interface implementation
class StudentComparable implements Comparable<StudentComparable> {
    String name;
    int age;

    public StudentComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(StudentComparable that) { // that represents more of a third person since we cannot compare it from this class
        if (this.age > that.age) return 1;
        else return -1;
    }
} 

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
        // NOT SYNCHRONIZED
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

        // In order to use synchronized version of map, then we can use hashmap
        // SYNCHRONIZED
        Map<Integer, Integer> hashTable = new Hashtable<>();
        hashTable.put(21, 21);
        hashTable.put(22, 22);
        hashTable.put(23, 23);
        hashTable.put(24, 24);

        System.out.println(hashTable);
        System.out.println(hashTable.get(22));
        System.out.println(hashTable.keySet());
        System.out.println(hashTable.values());
        System.out.println(hashTable.containsKey(21));
        System.out.println(hashTable.containsValue(22));
        System.out.println(hashTable.put(21, 100));
        System.out.println(hashTable.getOrDefault(100, Integer.MIN_VALUE));
        System.out.println(hashTable.putIfAbsent(25, 200));
        System.out.println(hashTable.remove(25));
        System.out.println(hashTable);

        System.out.println();
        System.out.println("======================================");

        List<Integer> numsList = new ArrayList<>();
        numsList.add(43);
        numsList.add(31);
        numsList.add(72);
        numsList.add(29);

        // Collections is a utility class in collections framework
        Collections.sort(numsList);  // it sorts based on element by default
        System.out.println(numsList);

        // what if I wanna use my own sorting logic, say sort based on second character
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                if (num1%10 > num2%10) return 1; // 1 for swap, -1 for not swap
                else return -1;
            }
        };
        Collections.sort(numsList, com); // sorted based on second digit in integer elements
        System.out.println(numsList);

        // let's sort a string array based on the length of the string
        List<String> listString = new ArrayList<>();
        listString.add("randomElement");
        listString.add("sample");
        listString.add("que");
        listString.add("addition");
        Comparator<String> comString = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                if (str1.length() > str2.length()) return 1; // ascending order - small first, big next
                return -1;
            }
        };
        Collections.sort(listString, comString);
        System.out.println(listString);

        // let's sort an object now
        List<Student> students = new ArrayList<>();
        students.add(new Student("Dinesh", 24));
        students.add(new Student("Giri", 25));
        students.add(new Student("Rajan", 26));
        students.add(new Student("Sakthi", 22));
        students.add(new Student("Ratish", 21));

        // Comparator<Student> compareStudents = new Comparator<Student>() {
        //     @Override
        //     public int compare(Student student1, Student student2) {
        //         if (student1.age > student2.age) return 1;
        //         else return -1;
        //     }
        // };

        // much cleaner version using lambda expression and ternary operator for comparing
        Comparator<Student> compareStudents = (Student student1, Student student2) -> student1.age > student2.age ? 1 : -1;

        Collections.sort(students, compareStudents);
        System.out.println(students);

        // note: since student is a class collections sort doesn't get sorted naturally.
        // how does Integer gets sorted then? because it implements an interface called comparable which provides default sort order
        // similarly we can make our student class to implement comparable and use the List<Student> directly inside Collections.sort()
        // like how we do for List<Integer> with Collections.sort(list);
        List<StudentComparable> studentComparables = new ArrayList<>();
        studentComparables.add(new StudentComparable("Dinesh", 24));
        studentComparables.add(new StudentComparable("Giri", 25));
        studentComparables.add(new StudentComparable("Rajan", 26));
        studentComparables.add(new StudentComparable("Sakthi", 22));
        studentComparables.add(new StudentComparable("Ratish", 21));
        Collections.sort(studentComparables); // we don't need to define a comparator explicity since it's a part of a class
        System.out.println(studentComparables); // sorted
    }
    
}
