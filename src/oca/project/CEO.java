package oca.project;

import java.util.ArrayList;
import java.util.Date;

/* Class that contains information specific to the CEO who has no manager,
 unlike salaried and contract subordinates. */
public class CEO extends Person implements IManager{
    private TimePeriod timePeriod;
    private double currentBonus;
    private static final double CEO_BASE_SALARY = 110_000;
    private double totalManagerBonusFund = 5_000;
    private Date startDate;
    private ArrayList<ISubordinate> subordinate;
    
    //this method should be used by all paid people
    //to calculate the pay earned over a period of time
    @Override
    public double calculatePay() {
        return SalaryPaymentCalculator.calculatePay(this);
    }
    
    @Override
    public String assignBonus(ISubordinate subordinate, double bonus) {
        return BonusUpdater.assignBonus(this, subordinate, bonus);
    }
    
    public void applyBonus(double bonus) {
        setTotalManagerBonusFund(getTotalManagerBonusFund() - bonus);
    }
    
    public void setSubordinateList(ArrayList<ISubordinate> subordinate) {
        this.subordinate = subordinate;
    }
    
    public ArrayList<ISubordinate> getSubordinateList() {
        return subordinate;
    }
    
    public void setTotalManagerBonusFund(double totalManagerBonusFund) {
        this.totalManagerBonusFund = totalManagerBonusFund;
    }
    
    public double getTotalManagerBonusFund() {
        return totalManagerBonusFund;
    }
  
     //getter and setter methods for pay period
    public void setTimePeriod(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }
    public TimePeriod getTimePeriod() {
        return timePeriod;
    }
 
    public double getBaseSalary() {
        return CEO_BASE_SALARY;
    }
    
    //getter and setter for start date
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
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
