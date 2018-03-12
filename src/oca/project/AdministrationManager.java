package oca.project;

/*Class for Administration Managers
 */
public class AdministrationManager extends Manager {
    
    private static final double ADMINISTRATION_MANAGER_BASE_SALARY = 100_000.00;
    
    public AdministrationManager(IManager manager) {
        //passing base salary and manager to superclass
        super(ADMINISTRATION_MANAGER_BASE_SALARY, manager); 
    }
}
