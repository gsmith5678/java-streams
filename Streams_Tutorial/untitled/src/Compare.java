import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare {
    public static void main(String[] args) {

        //anonymous class
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                return i % 10 > j % 10 ? 1 : -1;
            }
        };


        List<Integer> nums = new ArrayList<Integer>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums, com);

        System.out.println(nums);


        Comparator<String> comStr = (i, j) -> i.length() > j.length() ? 1 : -1;

        Comparator<String> comStr1 = (o1, o2) -> o2.length() - o1.length();

        List<String> str = new ArrayList<>();
        str.add("Hello");
        str.add("Hippo Boy");
        str.add("Dog");
        str.add("yellow");

        Collections.sort(str, comStr);
        Collections.sort(str, comStr1);

        Collections.sort(str, Collections.reverseOrder());
        System.out.println(str);

        List<Laptop> list = new ArrayList<>();
        list.add(new Laptop("Apple", 16, 1500));
        list.add(new Laptop("Apple", 12, 1350));
        list.add(new Laptop("Apple", 8, 1200));
        list.add(new Laptop("Apple", 8, 1100));

        list.add(new Laptop("HP", 8, 600));
        list.add(new Laptop("HP", 8, 700));

        list.add(new Laptop("HP", 12, 800));
        list.add(new Laptop("HP", 16, 1000));
        list.add(new Laptop("Dell", 8, 750));
        list.add(new Laptop("Dell", 8, 775));

        list.add(new Laptop("Dell", 12, 850));
        list.add(new Laptop("Dell", 16, 1000));

        Collections.sort(list);

        list.forEach(System.out::println);




    }
}
