package oca.project;

/*Class for Testers
 */
public class Tester extends ContractSubordinate {
    private static final double TESTER_RATE = 25.00;
    
    public Tester(IManager manager) {
        //passing rate and manager to superclass
        super(TESTER_RATE, manager);
    }
}
