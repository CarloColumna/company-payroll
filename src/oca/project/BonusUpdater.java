package oca.project;


/*Class to be used whenever the manager assigns a bonus to their subordinate
 */
public class BonusUpdater {
    
    //method that assigns bonus to a subordinate based from parameters passed to it.
    public static String assignBonus(IManager manager, ISubordinate subordinate,double bonus) {
        String bonusMessage = "";
        int checkSubordinateMatching = 0;
        try { 
            for(ISubordinate sub : manager.getSubordinateList()) {
                if(sub.equals(subordinate)) { //checking if a subordinate belongs to that of the manager's
                    checkSubordinateMatching++; //subordina list
                }
            }
            
            if(checkSubordinateMatching == 0){  
                throw new Exception();      //throwing an exception if no matching was found
            } 
            else {
                if(manager.getTotalManagerBonusFund() >= bonus) {   //checking if the manager's fund is greater than 
                    ISalariedPerson salariedSubordinate = (ISalariedPerson) subordinate;    //bonus to be assigned
                    
                    if(salariedSubordinate.getCurrentBonus() == 0.0) {  //checking if subordinate has no assigned bonus
                        salariedSubordinate.setCurrentBonus(bonus);
                        manager.applyBonus(bonus);                      //assigning bonus
                        bonusMessage = "The amount of $" + bonus + " has been assigned to " 
                            + salariedSubordinate.toString();
                    } 
                    else {
                        bonusMessage = salariedSubordinate.toString() 
                            + " has already got a bonus assigned.";
                    }
                }
                else {
                        if(manager.getTotalManagerBonusFund() == 0) {   //checking if the manager's fund has been used up
                            bonusMessage = "Manager has used up the alloted bonus fund.";
                        }
                        else {
                            bonusMessage = "Manager cannot allocate more than $" + manager.getTotalManagerBonusFund();
                        }
                }
            }                
        }
        catch (Exception e) {
            bonusMessage = subordinate.toString() + " is not a subordinate of"
                    + manager.toString();
        }

        return bonusMessage;
    }
}
