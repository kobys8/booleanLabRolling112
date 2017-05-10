/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package booleanlabrolling112;

/**
 *
 * @author kms080
 */
import java.util.Random;
public class BooleanLabRolling112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int die1 = 1;
        int die2 = 1;
        int die3 = 1;
        Random x = new Random();
        int count = 0;
        System.out.print(die1 + " " + die2 + " " + die3 + "\n");
        do {
            die1 = x.nextInt(6) + 1;
            die2 = x.nextInt(6) + 1;
            die3 = x.nextInt(6) + 1;
            System.out.print(die1 + " " + die2 + " " + die3 + "\n");
            count++;
        } while (!(die1 != die2 && die2 != die3 && die1 != die3));
        System.out.println("count = " + count);
    }
}
