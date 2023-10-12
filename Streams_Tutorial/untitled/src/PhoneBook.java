import java.util.*;
import java.io.*;

    public class PhoneBook {
        public static void main(String []argh) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();

            Map<String, String> map = new HashMap<>();
            while(n-- > 0){
                String name = sc.nextLine();
                String number = sc.nextLine();
                map.put(name, number);
            }
            while(sc.hasNext()){
               String search = sc.nextLine();
               if(map.containsKey(search)) {
                   System.out.println(search + "=" + map.get(search));
                } else {
                   System.out.println("Not found");
               }
            }
        }
    }

