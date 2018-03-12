package oca.project;

import java.text.DecimalFormat;
import java.util.Date;

/*Class that contains information common to all contractors working in the
company*/
public class ContractSubordinate extends Person implements IContractor {
    private static final double MONTHLY_FULLTIME_HOURS = 160.0;
    private static final double OVERTIME_RATE = 1.10;
    private IManager manager;
    private double hourlyRate;
    private Date periodStartDate;
    private DecimalFormat formatter = new DecimalFormat("#0.00");     
    
    public ContractSubordinate (double hourlyRate, IManager manager) {
        this.hourlyRate = hourlyRate;
        this.manager = manager;
    }
    
    //this method should be used by all contractors to calculate the pay earned 
    //over a period of time
    public double calculatePay(Date periodStartDate, double numberOfHours) {
        double pay;
        this.periodStartDate = periodStartDate;
        
        if(numberOfHours <= MONTHLY_FULLTIME_HOURS){
            pay =  Double.valueOf(formatter.format(numberOfHours * getHourlyRate()));
        } else {
            pay = Double.valueOf(formatter.format(MONTHLY_FULLTIME_HOURS * getHourlyRate() + 
                    (numberOfHours - MONTHLY_FULLTIME_HOURS) * OVERTIME_RATE * getHourlyRate()));
        }
        
        return pay;
    }
    
    public void setManager(IManager manager) {
        this.manager = manager;
    }
    public IManager getManager() {
        return manager;
    }
    
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @return the periodStartDate
     */
    public Date getPeriodStartDate() {
        return periodStartDate;
    }
}
