import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ALSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TotLines = sc.nextInt();

        ArrayList<Integer[]> arrL = new ArrayList<>(TotLines);

        for (int i = 0; i < TotLines; i++) {
            int numIntsOnLine = sc.nextInt();
            Integer[] arr = new Integer[numIntsOnLine];
            for (int j = 0; j < numIntsOnLine; j++) {
                arr[j] = sc.nextInt();
            }
            arrL.add(arr);
        }

        // queries
        int numQueries = sc.nextInt();
        for(int i = 0; i < numQueries; i++){
            int line = sc.nextInt() - 1;
            int positon = sc.nextInt();
            /*System.out.println(arrL.get(line)[positon-1]);
            System.out.println(arrL.get(line).length);*/
            try {
                System.out.println(arrL.get(line)[positon-1]);
            } catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}