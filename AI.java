/**
 * Code for AI class.
 * Abstract class
 * @version 1.0.0
 * @author aprasad72
 */
public abstract class AI {
    private boolean destructed = false;
    private Coordinates cannonTarget;
    private Coordinates secretHQ;
    /**
     * @param cannonTarget Coordinates object (location where cannon aimed)
     * @param secretHQ Coordinates object (location of headquarters)
     * constructor takes in Coordinates object
     * assigns objects to cannonTarget and secretHQ
     */
    public AI(Coordinates cannonTarget, Coordinates secretHQ) {
        this.cannonTarget = cannonTarget;
        this.secretHQ = secretHQ;
    }
    /**
     * @param newCoords Coordinates object
     * @return true/false(boolean) if cannonTarget is changed
     * dependent on longitude and latitude not being the same
     * or sets destructed to true
     */
    public boolean swapCannonTarget(Coordinates newCoords) {
        if (!destructed && !(newCoords.equals(cannonTarget))) {
            if (shouldSwapCannonTarget()) {
                cannonTarget = newCoords;
                return true;
            } else if (shouldSelfDestruct()) {
                selfDestruct();
                return false;
            } else {
                return false;
            }
        }
        return false;
    }
    /**
     * @return destructed (true or false)
     */
    public boolean getDestructed() {
        return destructed;
    }
    /**
     * @return cannonTarget (Coordinates object)
     */
    public Coordinates getCannonTarget() {
        return cannonTarget;
    }
    /**
     * @return secretHQ (Coordinates object)
     */
    public Coordinates getSecretHQ() {
        return secretHQ;
    }
    /**
     * @return boolean (true or false) after changing cannonTarget
     * changes dependent on type of AI (can be overriden)
     */
    public abstract boolean shouldSwapCannonTarget();
    /**
     * sets destructed to true
     */
    public void selfDestruct() {
        destructed = true;
    }
    /**
     * @return boolean (true or false) dependent on type of AI (subclasses)
     */
    public abstract boolean shouldSelfDestruct();
    /**
     * @return String notation of AI object
     * where the cannon is pointed at
     */
    public String toString() {
        return "Dr. Chipotle's guacamole cannon is currently pointed at "
               + cannonTarget.toString();
    }
}
