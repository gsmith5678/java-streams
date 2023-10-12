import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

public class SumSubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
//1 -2 4 -5 1
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                count++;
            }
            int sum = i;
            for (int j = i; j < n - 1; j++) {
                int sum2 = arr[j] + arr[j + 1];
                sum += sum2;
                if(sum2 < 0) {
                    count++;
                }
                if(sum < 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
