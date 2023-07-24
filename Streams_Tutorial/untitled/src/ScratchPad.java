
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Scanner;

public class ScratchPad {

            public static void main(String[] args) {
                int temp;
//initializing an array
                int a[] = {12, 5, 56, -2, 32, 2, -26, 9, 43, 94, -78};
                for (int i = 0; i < a.length; i++) {
                    for (int j = i + 1; j < a.length; j++) {
                        if (a[i] < a[j]) {
                            temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                        }
                    }
                }
                System.out.println("Array elements in descending order:");
//accessing element of the array
                for (int i = 0; i <= a.length - 1; i++) {
                    System.out.println(a[i]);
                }

                Scanner sc= new Scanner(System.in);
                int n=sc.nextInt();
                String []arr=new String[n+2];
                for(int i=0;i<n;i++){
                    arr[i]=sc.next();
                }
                sc.close();

                //String[] arr = new String[]{"9", "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};

                String tem;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if(arr[i] == null || arr[j] == null) {
                           continue;
                            } else{
                            BigDecimal first = new BigDecimal(arr[i]);
                            BigDecimal second = new BigDecimal(arr[j]);
                            if (first.compareTo(second) < 0) {
                                tem = arr[i];
                                arr[i] = arr[j];
                                arr[j] = tem;}
                        }
                    }
                }
                for (String str : arr) {
                    System.out.println(str);
                }


            }
        }
