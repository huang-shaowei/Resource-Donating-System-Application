/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CommunityCenter;

import Business.EcoSystem;
import Business.Enterprise.CommunityCenterEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.FoodOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class FoodSendingJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    UserAccount account;
    FoodOrganization organization;
    Enterprise enterprise;
    EcoSystem business;
    WorkRequest request;
    /**
     * Creates new form FoodSendingJPanel
     */
    public FoodSendingJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, WorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = (FoodOrganization)organization;
        this.enterprise = enterprise;
        this.business = business;
        this.request = request;
        
        populateTable();
        
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)foodSendingTbl.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest needRequest : organization.getWorkQueue().getWorkRequestList()){
            if(needRequest.getStatus().equals("Need")) {
                //if(needRequest.getLocation().equals(request.getLocation())) {
                    Object[] row = new Object[2];
                    row[0] = needRequest;
                    row[1] = needRequest.getRequestorName().getUsername();
            
                    model.addRow(row);
                //}

            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodSendingTbl = new javax.swing.JTable();
        sendBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 2, 18)); // NOI18N
        jLabel1.setText("Sending Food");

        foodSendingTbl.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        foodSendingTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Name", "Recipient"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(foodSendingTbl);
        if (foodSendingTbl.getColumnModel().getColumnCount() > 0) {
            foodSendingTbl.getColumnModel().getColumn(0).setResizable(false);
            foodSendingTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        sendBtn.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        sendBtn.setText("Send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendBtn)
                    .addComponent(backBtn))
                .addContainerGap(273, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = foodSendingTbl.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        FoodWorkRequest needRequest = (FoodWorkRequest)foodSendingTbl.getValueAt(selectedRow, 0);
     
        needRequest.setStatus("Completed");
        request.setStatus("Completed");
    }//GEN-LAST:event_sendBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FoodWorkAreaJPanel fwajp = (FoodWorkAreaJPanel) component;
        fwajp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable foodSendingTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sendBtn;
    // End of variables declaration//GEN-END:variables
}
