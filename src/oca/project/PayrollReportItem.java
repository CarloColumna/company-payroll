package oca.project;

import java.util.Date;

/*Class that contains information about the payments being made_
 */
public class PayrollReportItem {
    private Person person;
    private double salary;
    private Date startOfPayPeriod;
    private TimePeriod payPeriod;
    
    public PayrollReportItem (Person person, double salary, Date startOfPayPeriod, 
            TimePeriod payPeriod) {
        this.person = person;
        this.salary = salary;
        this.startOfPayPeriod = startOfPayPeriod;
        this.payPeriod = payPeriod;
    }
    
    @Override
    public String toString() {  //method that returns a string representation for each object of the class
       return getPerson().getEmpFirstName() + " " + getPerson().getEmpLastName() + " was paid " + salary + " on the " +
               getStartOfPayPeriod() + ". Pay Period: " + getPayPeriod();
    }

    /**
     * @return the startOfPayPeriod
     */
    public Date getStartOfPayPeriod() {
        return startOfPayPeriod;
    }

    /**
     * @param startOfPayPeriod the startOfPayPeriod to set
     */
    public void setStartOfPayPeriod(Date startOfPayPeriod) {
        this.startOfPayPeriod = startOfPayPeriod;
    }

    /**
     * @return the payPeriod
     */
    public TimePeriod getPayPeriod() {
        return payPeriod;
    }

    /**
     * @param payPeriod the payPeriod to set
     */
    public void setPayPeriod(TimePeriod payPeriod) {
        this.payPeriod = payPeriod;
    }

    /**
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(Person person) {
        this.person = person;
    }
}
