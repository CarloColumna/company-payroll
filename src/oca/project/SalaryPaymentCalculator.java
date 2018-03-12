package oca.project;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

/*Class that calculates salaries for both contractor and salaried employees
including salary increases and bonuses for thesalaried employees */
public class SalaryPaymentCalculator {
    private static final int MONTHS_PER_YEAR = 12;
    private static final int FORTHNIGHTS_PER_YEAR = 26;
    private static Date presentDateForIncreaseCalculation = new Date("01/01/2015");
    private static final int YEAR_BEFORE_INCREASE = 2;
    private static final double PERCENT_INCREASE = 0.02;
    private static DecimalFormat formatter = new DecimalFormat("#0.00");
    
    
    //method that checks the number of years between two dates passed as parameters
    public static int yearsBetween(Date dateStarted, Date endDate) {
        Calendar present = Calendar.getInstance();
        Calendar past = Calendar.getInstance();
        past.setTime(dateStarted);  //setting parameter dates
        present.setTime(endDate);

        int years = 0;

        while (past.before(present)) {  //looping through while past date is before
            past.add(Calendar.YEAR, 1); //the present date while incrementing
            if (past.before(present)) { //a variable to count the no. of years
                years++;
            }
        } 
        return years;
    }
    
    //method that calculates the current salary including the entitled increase because of the
    //no. of years working with the company
    public static double calculateCurrentSalaryWithIncrease(double baseSalary, Date dateStarted) {
        //getting the increase multiplier by dividing the no. of years to the required years before an increase is allowed
        int increaseMultiplier = yearsBetween(dateStarted, presentDateForIncreaseCalculation)/YEAR_BEFORE_INCREASE;
       
       for(int i = 0; i < increaseMultiplier; i++ ) {   //getting the salary plus the increase every 2 years
           baseSalary = baseSalary + baseSalary * PERCENT_INCREASE;
       }
       return baseSalary;
    }
    
    //method that calculates the final yearly pay by including the assigned bonus
    public static double calculateFinalYearlyPay(ISalariedPerson iSalariedPerson) {
        double finalYearlyPay = calculateCurrentSalaryWithIncrease(iSalariedPerson.getBaseSalary(), 
                iSalariedPerson.getStartDate()) + iSalariedPerson.getCurrentBonus();
        
        return Double.valueOf(formatter.format(finalYearlyPay));
        
    }
    
    //method that calculate the pay for each time period
    public static double calculatePay(ISalariedPerson iSalariedPerson) {
        double pay= 0;
        
        switch(iSalariedPerson.getTimePeriod()) {
            case MONTHLY: 
                pay = calculateFinalYearlyPay(iSalariedPerson) / MONTHS_PER_YEAR;
                break;
                
            case FORTNIGHTLY: 
                pay = calculateFinalYearlyPay(iSalariedPerson) / FORTHNIGHTS_PER_YEAR;
                break;
        }
        return Double.valueOf(formatter.format(pay));
        
    }
}
