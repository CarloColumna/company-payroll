package oca.project;

import java.util.ArrayList;

/*Class that contains information about salaried subordinates who themselves
have subordinates. */
public class Manager extends SalariedSubordinate implements IManager {
    
    private ArrayList<ISubordinate> subordinateList = new ArrayList<>();
    private double totalManagerBonusFund = 5_000;
    
    public Manager(double baseSalary, IManager manager, ArrayList<ISubordinate> subordinateList) {
        super(baseSalary, manager);     //passing parameters to superclasse's constructor
        this.subordinateList = subordinateList;
    }
    
    public Manager(double baseSalary, IManager manager) {
        this (baseSalary, manager, new ArrayList<ISubordinate>());  //passing arguments to another constructor
    }
    
    @Override   //passing calculation by calling the same method in Salary Payment class passing argument
    public double calculatePay() {
        return SalaryPaymentCalculator.calculatePay(this);
    }
    
    @Override   //method that assigns bonus by calling the Bonus Updater class assignBonus method
    public String assignBonus(ISubordinate subordinate, double bonus) {
        return BonusUpdater.assignBonus(this, subordinate, bonus);
    }
    
    @Override   //method that applyBonus by setting the total manager bonus fund less assingned bonus
    public void applyBonus(double bonus) {
        setTotalManagerBonusFund(getTotalManagerBonusFund() - bonus);
    }
    
    public ArrayList<ISubordinate> getSubordinateList() {
        return subordinateList;
    }
    
    public void setSubordinateList(ArrayList<ISubordinate> subordinate) {
        this.subordinateList = subordinate;
    }
    
    public double getTotalManagerBonusFund() {
        return totalManagerBonusFund;
    }
    
    public void setTotalManagerBonusFund(double totalManagerBonusFund) {
        this.totalManagerBonusFund = totalManagerBonusFund;
    }
     
    

    
}
