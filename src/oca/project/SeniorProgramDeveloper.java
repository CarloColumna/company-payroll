package oca.project;

/*Class for Senior Program Developers
 */
public class SeniorProgramDeveloper extends Manager{
        
    private static final double SENIOR_PROGRAM_DEVELOPER_BASE_SALARY = 75_000.00;
    
    public SeniorProgramDeveloper(IManager manager) {
        //passing base salary and manager to superclass
        super(SENIOR_PROGRAM_DEVELOPER_BASE_SALARY, manager);
    }
}
