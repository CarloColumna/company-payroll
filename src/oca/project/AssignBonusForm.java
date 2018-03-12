package oca.project;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/*Form that allows managers assign bonuses to their subordinates 
 */
public class AssignBonusForm extends javax.swing.JFrame {

    private ArrayList<Person> personList;
    private MainForm mainForm;
    private DefaultComboBoxModel model;
    
     //Creates new form AssignBonusForm
    public AssignBonusForm(ArrayList <PayrollReportItem> payrollRecordList) {
        initComponents();
    }
    
    //creates model and populate the cboManager
    public void populateManagerComboBox() {
        model = new DefaultComboBoxModel();
        
        for(Person p : getPersonList()) {
            if(p instanceof Manager) {
                model.addElement(p);
            }
        }
        cboManager.setModel(model);
    }
    
    //creates model for the cboSubordinate based on the selection in the cboManager
    public void populateSubordinateComboBox() {
        model = new DefaultComboBoxModel();
        
        //casting cboManager selection to manager object
        Manager manager = (Manager)cboManager.getSelectedItem();
        
        //getting a manager's object subordinates
        for(ISubordinate sub : manager.getSubordinateList()) {
            if(sub instanceof SalariedSubordinate) {
                model.addElement(sub);
            }
        }
        
        //checking if manager object has no salaried subordinates
        if(model.getSize() == 0) {
            model.addElement("No salaried subordinates");
        }
        cboSubordinate.setModel(model);
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msgMessage = new javax.swing.JOptionPane();
        lblFormTitle = new javax.swing.JLabel();
        cboManager = new javax.swing.JComboBox();
        cboSubordinate = new javax.swing.JComboBox();
        btnAssignBonus = new javax.swing.JButton();
        lblManager = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBonus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCheckBonus = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblFormTitle.setForeground(new java.awt.Color(0, 0, 153));
        lblFormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFormTitle.setText("Assign Bonus");

        cboManager.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboManager.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboManagerItemStateChanged(evt);
            }
        });

        cboSubordinate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnAssignBonus.setBackground(new java.awt.Color(204, 204, 255));
        btnAssignBonus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAssignBonus.setText("Assign Bonus");
        btnAssignBonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignBonusActionPerformed(evt);
            }
        });

        lblManager.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblManager.setText("Manager:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Subordinates List");

        txtBonus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Bonus:");

        btnCheckBonus.setBackground(new java.awt.Color(204, 204, 255));
        btnCheckBonus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCheckBonus.setText("Check current bonus");
        btnCheckBonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckBonusActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAssignBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 276, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cboManager, javax.swing.GroupLayout.Alignment.LEADING, 0, 229, Short.MAX_VALUE)
                                        .addComponent(cboSubordinate, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCheckBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblManager))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboSubordinate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addComponent(btnAssignBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCheckBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //event caller to populate cboSubordinate for every item state in cboManager
    private void cboManagerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboManagerItemStateChanged
        populateSubordinateComboBox();
    }//GEN-LAST:event_cboManagerItemStateChanged

    //Event handler for the Assign Bonus button
    //including checks for selected item being generic message about no subordinates to display
    //and a check that bonus has been entered in the textbox
    private void btnAssignBonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignBonusActionPerformed
        String bonusMessage;
        
        //casting cboManager object to Manager object
        Manager manager = (Manager) cboManager.getSelectedItem();
        
        if(cboSubordinate.getSelectedItem() == null) {  //checking if an object has been selected
            bonusMessage = "Please choose a manager in the list.";
        }
        else if(cboSubordinate.getSelectedItem().equals("No salaried subordinates")) {  //checking if an object 
            bonusMessage = "Only salaried employees are entitled to bonuses";   //has no salaried subordinates
        }
        else {
            //Casting cboSubordinate object to Salaried Subordinate object
            SalariedSubordinate salariedSubordinate = (SalariedSubordinate) cboSubordinate.getSelectedItem();
            
            if(txtBonus.getText().equals("")) { //checking if bonus is entered
                bonusMessage = "You haven't specified the bonus.";
            } else {
                try {
                    double bonus = Double.parseDouble(txtBonus.getText());
                    
                    //calling BonusUpdater class assignBonus method
                    bonusMessage = BonusUpdater.assignBonus(manager, salariedSubordinate, bonus);
                }
                catch (Exception e) {
                    bonusMessage = "You entered bonus in incorrect format.";
                }
            }
        }
        msgMessage.showMessageDialog(this, bonusMessage, "Announcement", 
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
        txtBonus.setText("");
    }//GEN-LAST:event_btnAssignBonusActionPerformed

    //event handler for the Check bonus button that displays the current bonus 
    //for the subordinate selected in the cboSubordinate 
    private void btnCheckBonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckBonusActionPerformed
        String bonusMessage;
        
        if(cboSubordinate.getSelectedItem() == null) {  //checking if no selection is made yet
                bonusMessage = "Please choose a manager in the list.";
        }
        else if(cboSubordinate.getSelectedItem().equals("No salaried subordinates")) {
            bonusMessage = "Only salaried employees are entitled to bonuses";
        } else {
            //Casting cboSubordinate object to Salaried Subordinate object
            SalariedSubordinate salariedSubordinate = (SalariedSubordinate) cboSubordinate.getSelectedItem();
            
            bonusMessage = "The bonus of " + salariedSubordinate.toString() +
                 " is $" + salariedSubordinate.getCurrentBonus();
            
        }
        msgMessage.showMessageDialog(this, bonusMessage ,
                "Announcement", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCheckBonusActionPerformed

    //event handler for the Back button that closes the current form and displays the main form
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignBonus;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckBonus;
    private javax.swing.JComboBox cboManager;
    private javax.swing.JComboBox cboSubordinate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFormTitle;
    private javax.swing.JLabel lblManager;
    private javax.swing.JOptionPane msgMessage;
    private javax.swing.JTextField txtBonus;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the personList
     */
    public ArrayList<Person> getPersonList() {
        return personList;
    }

    /**
     * @param personList the personList to set
     */
    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    /**
     * @return the mainForm
     */
    public MainForm getMainForm() {
        return mainForm;
    }

    /**
     * @param mainForm the mainForm to set
     */
    public void setMainForm(MainForm mainForm) {
        this.mainForm = mainForm;
    }


}