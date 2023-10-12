import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



        public class HourGlass {
            public static void main(String[] args) throws IOException {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

                List<List<Integer>> arr = new ArrayList<>();

                IntStream.range(0, 6).forEach(i -> {
                    try {
                        arr.add(
                                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                        .map(Integer::parseInt)
                                        .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                //1 1 1 0 0 0
                //0 1 0 0 0 0
                //1 1 1 0 0 0
                //0 9 2 -4 -4 0
                //0 0 0 -2 0 0
                //0 0 -1 -2 -4 0
                int maxVal = Integer.MIN_VALUE;
                for(int i = 0; i<4;i++){
                    for(int j = 0; j < 4; j++){
                        int sumVal = arr.get(i).get(j)+
                                arr.get(i).get(j+1)+arr.get(i).get(j+2)+
                                arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+
                                arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                        if(sumVal > maxVal)maxVal = sumVal;
                    }
                }

                System.out.println(maxVal);

                bufferedReader.close();
            }
        }

