import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {

        String[] strArr = new String[]{"Hello", "World"};
        Integer[] intArr = new Integer[]{1,2,3};

        print(strArr);
        print(intArr);

        ArrayList<String> strList = new ArrayList<>();
            strList.add("Hellowwwww");
            strList.add("Yellow");

        ArrayList<Integer> intList = new ArrayList<>();
            intList.add(1);
            intList.add(2);

        printList(strList);
        printList(intList);
    }

    private static <T> void print(T[] thingToPrint){
        for (T t : thingToPrint) {
            System.out.println(t);
        }
    }

    private static void printList(List<?> list){
       printListHelper(list);
    }

    private static <T> void printListHelper(List<T> list){
        for (T t : list){
            System.out.println(t);
        }
    }
}