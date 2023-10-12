import java.util.*;
import java.util.Arrays;
import java.util.Arrays.*;

public class ArrayGame {

/*    public static boolean canWin(int leap, int[] game) {
        if (leap > game.length) {
            return true;
        } else if (game[0] != 0) {
            return false;
        }
        for (int i = 0; i < game.length - 1; i++) {
            if (game[i + 1] != 0) {
                int leapToIndex = i + leap;
                int gameLthLeft = game.length - 1;
                if (leapToIndex > gameLthLeft) {
                    return true;
                } else if (game[i + leap] == 0) {
                    i += (leap-1);
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }*/



    public static boolean canWin(int leap, int[] game){
        Stack<Integer> stack = new Stack<>();
        int position = 0;
        stack.push(position);
        while(!stack.empty()){
            position = stack.pop();
            if(position >= stack.size()) return true;
            //is it a valid move
            if(position < 0 || game[position] != 0) continue;

            game[position] = -1;
            stack.addAll(Arrays.asList(position+1, position-1, position+leap));

        }
        return false;
    }

    public static void main(String[] args) {
        int count = 1;
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? count + " | YES" : count + " | NO" );
            count++;
        }
        scan.close();
    }
}
