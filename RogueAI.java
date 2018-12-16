/**
 * Code for client class of AI (RogueAI).
 * Concrete class
 * @version 1.0.0
 * @author aprasad72
 */
public class RogueAI extends AI {
    private int firewallProtection;
    private int alertLevel;
    private final int maxAlert;
    /**
     * @param firewallProtection integer value of security level of firewall
     * @param alertLevel integer value of current alert level of computer
     * @param maxAlert constant integer is level when computer self-destructs
     * @param cannonTarget Coordinates object (location where cannon aimed)
     * @param secretHQ Coordinates object (location of headquarters)
     * constructor takes in Coordinates object
     * assigns objects to cannonTarget and secretHQ using super call
     */
    public RogueAI(int firewallProtection, int alertLevel, int maxAlert,
        Coordinates cannonTarget, Coordinates secretHQ) {
        super(cannonTarget, secretHQ);
        this.firewallProtection = firewallProtection;
        this.alertLevel = alertLevel;
        this.maxAlert = maxAlert;
    }
    /**
     * @param firewallProtection integer value of security level of firewall
     * @param maxAlert constant integer is level when computer self-destructs
     * @param cannonTarget Coordinates object (location where cannon aimed)
     * @param secretHQ Coordinates object (location of headquarters)
     * constructor takes in Coordinates object
     * assigns objects to cannonTarget and secretHQ using super call
     * Sets alertLevel to 0
     */
    public RogueAI(int firewallProtection, int maxAlert,
        Coordinates cannonTarget, Coordinates secretHQ) {
        super(cannonTarget, secretHQ);
        this.firewallProtection = firewallProtection;
        this.maxAlert = maxAlert;
        this.alertLevel = 0;
    }
    /**
     * @param firewallProtection integer value of security level of firewall
     * @param cannonTarget Coordinates object (location where cannon aimed)
     * @param secretHQ Coordinates object (location of headquarters)
     * constructor takes in Coordinates object
     * assigns objects to cannonTarget and secretHQ using super call
     * Sets alertLevel to 0
     * Sets maxAlert to 10
     */
    public RogueAI(int firewallProtection, Coordinates cannonTarget,
        Coordinates secretHQ) {
        super(cannonTarget, secretHQ);
        this.firewallProtection = firewallProtection;
        this.alertLevel = 0;
        this.maxAlert = 10;
    }
    /**
     * @return firewallProtection (integer value)
     */
    public int getFWProtection() {
        return this.firewallProtection;
    }
    /**
     * @return alertLevel (integer value)
     */
    public int getAlertLevel() {
        return this.alertLevel;
    }
    /**
     * @return maxAlert (integer value)
     */
    public int getMaxAlert() {
        return this.maxAlert;
    }
    /**
     * decrements firewallProtection by 2
     * increments alertLevel by 1
     */
    public void lowerFirewall() {
        this.firewallProtection -= 2;
        this.alertLevel++;
    }
     /**
     * @return true/false(boolean)
     * firewallProtection is less than or equal to 0 returns true
     */
    public boolean shouldSwapCannonTarget() {
        return (this.firewallProtection <= 0);
    }
    /**
     * @return true/false(boolean)
     * alertLevel is greater than or equal to maxAlert returns true
     */
    public boolean shouldSelfDestruct() {
        return (this.alertLevel >= this.maxAlert);
    }
    /**
     * @return String notation of RogueAI object
     * specifies where cannon is pointed at
     * specifies the alert level and firewall protection amount
     */
    public String toString() {
        return super.toString() + ", and is at alert level " + this.alertLevel
               + " with firewall protection " + this.firewallProtection + ".";
    }
}
