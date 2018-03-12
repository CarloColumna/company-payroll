package oca.project;

/*Class for Project Managers
 */
public class ProjectManager extends Manager {
        
    private static final double PROJECT_MANAGER_BASE_SALARY = 80_000.00;
    
    public ProjectManager(IManager manager) {
        //passing base salary and manager to superclass
        super(PROJECT_MANAGER_BASE_SALARY, manager);
    }
}
