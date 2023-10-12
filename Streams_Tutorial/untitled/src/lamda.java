import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class lamda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfTests = Integer.parseInt(sc.nextLine());
        Map<Integer, Integer> map = new HashMap<>();
        while(numOfTests > 0) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            map.put(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
            numOfTests--;
        }
    }

/*   public boolean isOdd(){
        return num -> num % 2 == 0 ? false : true;
   }

  */
}
   /* 1 PerformOperation isOdd(): The lambda expression must return  if a number is odd or  if it is even.
        2 PerformOperation isPrime(): The lambda expression must return  if a number is prime or  if it is composite.
        3 PerformOperation isPalindrome(): The lambda expression must return  if a number is a palindrome or  if it is not.*/