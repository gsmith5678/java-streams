import java.io.*;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
    public PerformOperation isOdd() {
        return s -> s % 2 != 0;
    }

    public PerformOperation isPrime(){
        return s -> {
            if(s != 0 || s != 1) {
                for (int i = 2; i <= s; i++) {
                    if(s % i == 0) {
                        if(s == i){
                            return true;
                        }
                        return false;
                    }
                }
            }
            return false;
        };
    }

    public PerformOperation isPalindrome() {
        return s -> {
            String str = String.valueOf(s);
            char[] arr = str.toCharArray();
            int i = 0;
            int j = arr.length-1;

            while(i++ <= j--){
                if(arr[i] != arr[j]){
                    return false;
                }
            }
            return true;
        };
    }

}

    // Write your code here

    public class Lambda2 {

        public static void main(String[] args) throws IOException {
            MyMath ob = new MyMath();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            PerformOperation op;
            boolean ret = false;
            String ans = null;
            while (T-- > 0) {
                String s = br.readLine().trim();
                StringTokenizer st = new StringTokenizer(s);
                int ch = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                if (ch == 1) {
                    op = ob.isOdd();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "ODD" : "EVEN";
                } else if (ch == 2) {
                    op = ob.isPrime();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PRIME" : "COMPOSITE";
                } else if (ch == 3) {
                    op = ob.isPalindrome();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

                }
                System.out.println(ans);
            }
        }
    }