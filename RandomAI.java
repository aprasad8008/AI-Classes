import java.util.Random;
/**
 * Code for client class of AI (RandomAI).
 * Concrete class
 * @version 1.0.0
 * @author aprasad72
 */
public class RandomAI extends AI {
    private static final Random randomizer = new Random();
    /**
     * @param cannonTarget Coordinates object (location where cannon aimed)
     * @param secretHQ Coordinates object (location of headquarters)
     * constructor takes in Coordinates object
     * assigns objects to cannonTarget and secretHQ using super call
     */
    public RandomAI(Coordinates cannonTarget, Coordinates secretHQ) {
        super(cannonTarget, secretHQ);
    }
    /**
     * @return true/false(boolean)
     * returns true 50% of the time
     */
    public boolean shouldSwapCannonTarget() {
        return randomizer.nextInt(2) < 1;
    }
    /**
     * @return true/false(boolean)
     * returns true 50% of the time
     */
    public boolean shouldSelfDestruct() {
        return randomizer.nextInt(2) < 1;
    }
}
