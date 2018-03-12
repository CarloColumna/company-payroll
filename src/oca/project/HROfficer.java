package oca.project;

/*Class for HR Officers
 */
public class HROfficer extends Manager {
        
    private static final double HR_OFFICER_BASE_SALARY = 50_000.00;
    
    public HROfficer(IManager manager) {
        //passing base salary and manager to superclass
        super(HR_OFFICER_BASE_SALARY, manager);
    }
    
}
