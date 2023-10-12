import java.util.ArrayList;
import java.util.Scanner;

public class BinaryExercise {

    public static int binarySum(String binary1, String binary2){
        int output;
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        return num1 + num2;
    }

    public static String intToBinaryStr(int num) {
        String output = "";
        ArrayList<Integer> arr = new ArrayList<>();
        int remainder;
        int quotient = num;
        while(quotient !=0){
            remainder = quotient % 2;
            quotient /= 2;
            arr.add(remainder);
        }

        for (int i = arr.size()-1; i >= 0; i-- ){
            output += String.valueOf(arr.get(i));
        }

        return output;
    }

    public static String binarySumAsBinary(String binary1, String binary2){
        String output = "";

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int sum = num1 + num2;

        output = intToBinaryStr(sum);

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary1 = sc.nextLine();
        String binary2 = sc.nextLine();

        System.out.println(binarySum(binary1, binary2));
        System.out.println(binarySumAsBinary(binary1, binary2));
        System.out.println(intToBinaryStr(142));
    }
}
