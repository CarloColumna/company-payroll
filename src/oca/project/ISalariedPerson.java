package oca.project;

import java.util.Date;


/*Interface to be implemented by all people working at the company who are 
 getting salaries */
public interface ISalariedPerson {
    
    //getter and setter methods for pay period   
    TimePeriod getTimePeriod();
    
    double getBaseSalary();
    
    Date getStartDate();
    double getCurrentBonus();
    void setCurrentBonus(double bonus);
       
    //this method should be used by all paid people
    //to calculate the pay earned over a period of time
    public double calculatePay() throws Exception ;
    
    
    void setTimePeriod(TimePeriod timePeriod);
    
    //getter and setter methods for Bonuses that might be assigned 
    //to subordinate by manager

}
