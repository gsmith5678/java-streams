import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class HashSetProblem {

        public static void main(String[] args) {
/*            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            String [] pair_left = new String[t];
            String [] pair_right = new String[t];

            Set<String> set = new HashSet<>();

            for (int i = 0; i < t; i++) {
                pair_left[i] = s.next();
                pair_right[i] = s.next();
                String out = pair_left[i] + " " + pair_right[i];
                set.add(out);
                System.out.println(set.size());
            }*/
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
            Set<String> set = new HashSet<>();
            while(sc.hasNext()){
                set.add(sc.nextLine());
                System.out.println(set.size());
            }
        }
    }
