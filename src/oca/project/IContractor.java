package oca.project;

import java.util.Date;

/*Interface that specifies the methods that contract employees should implement
 */
public interface IContractor extends ISubordinate{
    
    //this method should be used by all contractors
    //to calculate the pay earned over a period of time
    public double calculatePay(Date periodStartDate, double numberOfHours) throws Exception ;
    
    public double getHourlyRate();
}
