
package oca.project;


import java.util.Date;


//Class that contains all the personal information of the employees.
    public class Person {
    private String empFirstName;
    private String empLastName;
    private Date dateOfBirth;
    
    @Override   //method that returns the full name for each person object
    public String toString() {  
        return getEmpFirstName() + " " + getEmpLastName();
    }
    
    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }


}
