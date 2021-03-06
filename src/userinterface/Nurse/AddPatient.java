package userinterface.Nurse;

import Business.Enterprise.Enterprise;
import Business.Organization.NurseOrganization;

import Business.Organization.Organization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import Business.Validations.ValidateStringInput;
import Business.Validations.ValidateIntNoInput;
import Business.Vitals.Vitals;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class AddPatient extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private boolean isUnique;
    private static int familyCount = 0;
    private static int communityCount = 0;
    private NurseOrganization nurseOrganization;
    private PersonDirectory pd;

    public AddPatient(JPanel userProcessContainer, Enterprise enterprise, NurseOrganization nurseorganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.nurseOrganization = nurseorganization;

        populateGenderCombo();
        checkValidations();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        PatientTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        phoneNoTxt = new javax.swing.JTextField();
        createPatientBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        firstnameTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        localityTxt = new javax.swing.JTextField();
        genderCombo = new javax.swing.JComboBox();
        pulseTxt = new javax.swing.JTextField();
        respTxt = new javax.swing.JTextField();
        tempLbl = new javax.swing.JLabel();
        bpLbl = new javax.swing.JLabel();
        pulseLbl = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        tempTxt = new javax.swing.JTextField();
        bpTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        PatientTable.setAutoCreateRowSorter(true);
        PatientTable.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder()));
        PatientTable.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PatientTable.setGridColor(new java.awt.Color(0, 153, 102));
        PatientTable.setSelectionBackground(new java.awt.Color(0, 153, 102));
        jScrollPane1.setViewportView(PatientTable);

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        jLabel4.setText("Phone Number");

        phoneNoTxt.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        phoneNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoTxtActionPerformed(evt);
            }
        });

        createPatientBtn.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        createPatientBtn.setText("Create Patient");
        createPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatientBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        jLabel5.setText("Age");

        ageTxt.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        jLabel6.setText("First Name");

        firstnameTxt.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        jLabel7.setText("Last Name");

        lastNameTxt.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        jLabel8.setText("Gender");

        backButton.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        jLabel9.setText("Locality");

        localityTxt.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N

        genderCombo.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        genderCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboActionPerformed(evt);
            }
        });

        pulseTxt.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N

        respTxt.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        respTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respTxtActionPerformed(evt);
            }
        });

        tempLbl.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        tempLbl.setText("Temperature");

        bpLbl.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        bpLbl.setText("Blood Pressure");

        pulseLbl.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        pulseLbl.setText("Heart Rate");

        dateLbl.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        dateLbl.setText("Respiratory Rate");

        tempTxt.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        tempTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempTxtActionPerformed(evt);
            }
        });

        bpTxt.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        bpTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(118, 118, 118)
                .addComponent(createPatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tempLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bpLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pulseLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(dateLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstnameTxt)
                    .addComponent(phoneNoTxt)
                    .addComponent(localityTxt)
                    .addComponent(tempTxt)
                    .addComponent(bpTxt)
                    .addComponent(pulseTxt)
                    .addComponent(respTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(firstnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(localityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tempLbl)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bpLbl)
                            .addComponent(bpTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pulseLbl)
                            .addComponent(pulseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tempTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLbl))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(createPatientBtn))
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateGenderCombo() {
        genderCombo.addItem("Male");
        genderCombo.addItem("Female");

    }

    public void checkValidations() {
        InputVerifier stringVerifier = new ValidateStringInput();
        InputVerifier integerVerifier = new ValidateIntNoInput();
        firstnameTxt.setInputVerifier(stringVerifier);
        lastNameTxt.setInputVerifier(stringVerifier);
        ageTxt.setInputVerifier(integerVerifier);
        tempTxt.setInputVerifier(integerVerifier);
        bpTxt.setInputVerifier(integerVerifier);
        pulseTxt.setInputVerifier(integerVerifier);
        respTxt.setInputVerifier(integerVerifier);

    }

    public void populateHouseOwnerTable() {
        DefaultTableModel dtm = (DefaultTableModel) PatientTable.getModel();
        dtm.setRowCount(0);

        for (Person person : nurseOrganization.getPersonDirectory().getPersonList()) {
            Object[] row = new Object[4];
            row[0] = person.getFirstName();
            row[1] = person.getLastName();
            for (Vitals vitals : person.getVitalsHistory().getVitalSignList()) {
                row[2] = vitals.getStatus();
                row[3] = vitals.getDate();
            }
            dtm.addRow(row);
        }

    }

    private void createPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatientBtnActionPerformed

        if (firstnameTxt.getText().length() != 0 && lastNameTxt.getText().length() != 0
                && ageTxt.getText().length() != 0 && localityTxt.getText().length() != 0) {
            if (checkPhoneNumber()) {
                String firstName = firstnameTxt.getText();
                String lastName = lastNameTxt.getText();
                int age = Integer.parseInt(ageTxt.getText());
                String gender = (String) genderCombo.getSelectedItem();
                Long phoneNumber = Long.valueOf(phoneNoTxt.getText());
                String locality = localityTxt.getText();
                String temperature = tempTxt.getText();
                String bloodPressure = bpTxt.getText();
                String heartRate = pulseTxt.getText();
                String respRate = respTxt.getText();

                if (age > 99) {
                    JOptionPane.showMessageDialog(null, "Please check Age", "WARNING", JOptionPane.ERROR_MESSAGE);
                } else {
                    Person person = null;
                    for (Person pp : nurseOrganization.getPersonDirectory().getPersonList()) {
                        if (pp.getFirstName().equals(firstName) && pp.getLastName().equals(lastName)) {
                            person = pp;
                        }
                    }
                    if (person == null) {
                        person = nurseOrganization.getPersonDirectory().createPerson();
                        person.setFirstName(firstName);
                        person.setLastName(lastName);
                        person.setAge(age);
                        person.setGender(gender);
                        person.setPhoneNumber(phoneNumber);
                        person.setLocality(locality);
                    }

                    Vitals vitals = person.getVitalsHistory().addVitalSign();
                    vitals.setHeartRate(Integer.parseInt(heartRate));
                    vitals.setRespiratoryRate(Integer.parseInt(respRate));
                    vitals.setTemperature(Float.parseFloat(temperature));
                    vitals.setSystolicBP(Integer.parseInt(bloodPressure));
                    vitals.setDate(new Date());

                    JOptionPane.showMessageDialog(null, "Patient has been Created successfully", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    populateHouseOwnerTable();
                    //resetFields();

                }
            } else {
                JOptionPane.showMessageDialog(null, "Phone number should have 10 digits", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No Data should be left empty. Please enter all the data", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_createPatientBtnActionPerformed

    private Boolean checkPhoneNumber() {
        if (phoneNoTxt.getText().length() == 10) {
            return true;
        } else {
            return false;
        }
    }

    public void resetFields() {
        firstnameTxt.setText("");
        lastNameTxt.setText("");
        ageTxt.setText("");
        phoneNoTxt.setText("");
        localityTxt.setText("");
        localityTxt.setText("");
        tempTxt.setText("");
        bpTxt.setText("");
        pulseTxt.setText("");
        respTxt.setText("");

    }


    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void phoneNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoTxtActionPerformed

    private void respTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respTxtActionPerformed

    private void tempTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempTxtActionPerformed

    private void bpTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bpTxtActionPerformed

    private void genderComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PatientTable;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bpLbl;
    private javax.swing.JTextField bpTxt;
    private javax.swing.JButton createPatientBtn;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JTextField firstnameTxt;
    private javax.swing.JComboBox genderCombo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JTextField localityTxt;
    private javax.swing.JTextField phoneNoTxt;
    private javax.swing.JLabel pulseLbl;
    private javax.swing.JTextField pulseTxt;
    private javax.swing.JTextField respTxt;
    private javax.swing.JLabel tempLbl;
    private javax.swing.JTextField tempTxt;
    // End of variables declaration//GEN-END:variables
}
