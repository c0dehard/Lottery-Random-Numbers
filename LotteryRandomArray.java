import java.util.Random;

/**
 *
 * @author c0dehard
 */
public class LotteryRandomArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random r = new Random();

        byte[] Zahlen = new byte[6];

        for (byte Anzahl : Zahlen) {
            System.out.print(Zahlen[Anzahl] = (byte) r.nextInt(49));
              System.out.print(" "); //Separiert die Zahlen
            
        }

    }

}