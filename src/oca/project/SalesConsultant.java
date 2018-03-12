package oca.project;

/*Class for Sales Consultants
 */
public class SalesConsultant extends ContractSubordinate {
    
    private static final double SALES_CONSULTANT_RATE = 27.50;
    
    public SalesConsultant(IManager manager) {
        //passing rate and manager to superclass
        super(SALES_CONSULTANT_RATE, manager);
    }
}
