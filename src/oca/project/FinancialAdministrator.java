package oca.project;

/*Class for Financial Administrators
 */
public class FinancialAdministrator extends SalariedSubordinate {
        
    private static final double FINANCIAL_ADMINISTRATOR_BASE_SALARY = 75_000.00;
    
    public FinancialAdministrator(IManager manager) {
        //passing base salary and manager to superclass
        super(FINANCIAL_ADMINISTRATOR_BASE_SALARY, manager);
    }
}
