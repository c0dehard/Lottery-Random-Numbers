import java.util.Random;
import static java.lang.System.out;

/**
 * @author c0dehard
 */

public class LotteryRandomArray {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        Random r = new Random();

        byte[] Numbers = new byte[6];

        for (byte Number : Numbers) {
            out.print(Numbers[Number] = (byte) r.nextInt(49));
              out.print(" "); //Seperates the numbers
            
        }

    }

}
