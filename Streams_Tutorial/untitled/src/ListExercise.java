import java.io.*;
import java.util.*;

public class ListExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        while(n-- > 0){
            list.add(sc.nextInt());
        }

        int numQuiries = sc.nextInt();

        while(numQuiries > 0) {
            String query = sc.next();
            if(query.equals("Insert")){
                int index = sc.nextInt();
                int num = sc.nextInt();

                list.add(index, num);
            } else {
                int index = sc.nextInt();
                list.remove(index);
            }
            numQuiries--;
        }

        String output = "";
        for (int i=0; i<list.size(); i++){
            output+=list.get(i) + " ";
        }
        System.out.println(output.trim());
    }
}