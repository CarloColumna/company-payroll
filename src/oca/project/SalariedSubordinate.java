package oca.project;

import java.util.Date;

/* Class that contains information common to all employees working in the
 company who receives salary */
public class SalariedSubordinate extends Person implements ISalariedPerson, ISubordinate {
    
    private Date startDate;
    private IManager manager;
    private TimePeriod timePeriod;
    private double baseSalary;
    private double currentBonus = 0.0;
    
    public SalariedSubordinate(double baseSalary, IManager manager) {
        this.baseSalary = baseSalary;
        this.manager = manager;
    }
    
    //this method should be used by all paid people
    //to calculate the pay earned over a period of time
    @Override
    public double calculatePay() {
        return SalaryPaymentCalculator.calculatePay(this);
    }
    
    public void setManager(IManager manager) {
        this.manager = manager;
    }
    
    public IManager getManager() {
        return manager;
    }
        
    //getter and setter methods for pay period
    public void setTimePeriod(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }
    public TimePeriod getTimePeriod() {
        return timePeriod;
    }
    
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public double getBaseSalary() {
        return baseSalary;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    @Override
    public Date getStartDate() {
        return startDate;
    }
    
    //getter and setter methods for Bonuses that might be assigned 
    //to subordinate by manager
    public void setCurrentBonus(double currentBonus) {
        this.currentBonus = currentBonus;
    }
    
    public double getCurrentBonus() {
        return currentBonus;
    }
       



    
    
    

}
