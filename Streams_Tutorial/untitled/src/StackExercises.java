import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class StackExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(isItBalanced(str));
        }

    }
public static boolean isItBalanced(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
            if(x == '(' || x == '{' || x == '['){
                stack.push(x);
            } else if (x == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else if (x == '}' && !stack.empty() && stack.peek() == '{'){
                stack.pop();
            } else if (x == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}
