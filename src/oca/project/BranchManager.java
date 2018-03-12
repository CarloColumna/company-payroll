package oca.project;

/*Class for Branch Managers
 */
public class BranchManager extends Manager {
       
    private static final double BRANCH_MANAGER_BASE_SALARY = 90_000.00;
    
    public BranchManager(IManager manager) {
        //passing base salary and manager to superclass
        super(BRANCH_MANAGER_BASE_SALARY, manager);
    }
}
