package oca.project;

/*Class for System Analysts
 */
public class SystemAnalyst extends SalariedSubordinate {
        
    private static final double SYSTEM_ANALYST_BASE_SALARY = 75_000.00;
    
    public SystemAnalyst(IManager manager) {
        //passing base salary and manager to superclass
        super(SYSTEM_ANALYST_BASE_SALARY, manager);
    }
}
