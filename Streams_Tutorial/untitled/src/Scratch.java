import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.*;

public class Scratch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n+2];
        for(int i = 0; i < n; i++){
            s[i] = sc.nextLine();
        }

        //Stream.of(s).filter(x -> x != null).map(BigDecimal::new).sorted(Comparator.reverseOrder()).map(BigDecimal::toString).forEach(System.out::println);

        Arrays.sort(s, (s1, s2) -> new BigDecimal(s2).compareTo(new BigDecimal(s1)));

        for()



    }
}
