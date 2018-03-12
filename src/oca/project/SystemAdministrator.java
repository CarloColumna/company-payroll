package oca.project;

/*Class for System Administrators
 */
public class SystemAdministrator extends SalariedSubordinate {
        
    private static final double SYSTEM_ADMINISTRATOR_BASE_SALARY = 65_000.00;
    
    public SystemAdministrator(IManager manager) {
        //passing base salary and manager to superclass
        super(SYSTEM_ADMINISTRATOR_BASE_SALARY, manager);
    }
}
