package oca.project;

/*Class for Program Developers
 */
public class ProgramDeveloper extends SalariedSubordinate {
        
    private static final double PROGRAM_DEVELOPER_BASE_SALARY = 70_000.00;
    
    public ProgramDeveloper(IManager manager) {
        //passing base salary and manager to superclass
        super(PROGRAM_DEVELOPER_BASE_SALARY, manager);
    }
}
