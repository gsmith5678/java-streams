import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.*;

public class isPrime {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try {
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.getMessage();
        }
        BigInteger b = new BigInteger(str);
        if (b.isProbablePrime(10)){
            System.out.println("prime");
        } else{
            System.out.println("not prime");
        }
    }
}
