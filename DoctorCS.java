/**
 * Code for DoctorCS class.
 * Concrete class
 * @version 1.0.0
 * @author aprasad72
 */
public class DoctorCS {
    private AI ai;
    private String secretIdentity;
    private int jlaid;
    private boolean safe;
    /**
     * @param ai (AI object)
     * @param secretIdentity (String of hidden identity)
     * @param jlaid (integer value of Justice League ID)
     * constructor takes in AI object, String, and integer value
     * assigns AI object to ai, String to secretIdentity, and int to jlaid
     */
    public DoctorCS(AI ai, String secretIdentity, int jlaid) {
        this.ai = ai;
        this.secretIdentity = secretIdentity;
        this.jlaid = jlaid;
    }
    /**
     * @return ai (AI object)
     */
    public AI getAI() {
        return this.ai;
    }
    /**
     * @return jlaid (integer value)
     * Justice League ID
     */
    public int getJlaid() {
        return jlaid;
    }
    /**
     * conditional setter for safe variable
     * if a RogueAI object, lowerFirewall called and swapped coordinates
     * if a RandomAI object, swapped coordinates
     */
    public void saveTheDay() {
        if (this.ai instanceof RogueAI) {
            while (((RogueAI) ai).getFWProtection() > 0) {
                ((RogueAI) ai).lowerFirewall();
            }
            safe = ai.swapCannonTarget(ai.getSecretHQ());
        }
        if (ai instanceof RandomAI) {
            safe = ai.swapCannonTarget(ai.getSecretHQ());
        }
    }
    /**
     * @return String (saved, successful plan, or still in danger)
     * if safe, day is saved
     * if not safe and destructed, plan was successful
     * else still in danger
     */
    public String getStatus() {
        if (safe) {
            return "Doctor CS has saved the day!";
        }
        if (!safe && ai.getDestructed()) {
            return "Dr. Chipotle has succeeded in his plan...";
        }
        return "Georgia Tech is still in danger!";
    }
    /**
     * @return String notation of DoctorCS object
     * specifies hidden identity of DoctorCS and Justice League ID
     */
    public String toString() {
        return this.secretIdentity + " aka Doctor CS with JLAID: " + this.jlaid;
    }
}
