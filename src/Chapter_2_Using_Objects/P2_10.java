package Chapter_2_Using_Objects;

import java.util.Random;

/**
 * DieSimulator for exercise P2.10
 *
 * @author ChrisBerryman
 */
public class P2_10 {
    
    /**
     * Simulates the roll of a die.
     */
    public void rollDie() {
        
        Random generator = new Random();
        int dieCast = generator.nextInt(6) + 1;
        System.out.println(dieCast);
        
    }
    
}
