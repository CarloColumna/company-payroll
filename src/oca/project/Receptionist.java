package oca.project;

/*Class for Receptionists
 */
public class Receptionist extends SalariedSubordinate{
        
    private static final double RECEPTIONIST_BASE_SALARY = 35_000.00;
    
    public Receptionist(IManager manager) {
        //passing base salary and manager to superclass
        super(RECEPTIONIST_BASE_SALARY, manager);
    }
}
