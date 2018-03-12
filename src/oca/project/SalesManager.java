package oca.project;

/*Class for Sales Managers
 */
public class SalesManager extends Manager {
        
    private static final double SALES_MANAGER_BASE_SALARY = 75_000.00;
    
    public SalesManager(IManager manager) {
        //passing base salary and manager to superclass
        super(SALES_MANAGER_BASE_SALARY, manager);
    }
}
