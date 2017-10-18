/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Doctor;

import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Vitals.Vitals;
import Business.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Date;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author karth
 */
public class MonitorPatients extends javax.swing.JPanel {
    private JPanel userProcessContainer;

    private DoctorOrganization doctorOrganization;
    String patientStatus = null;
    private Enterprise enterprise;
    private Person person=new Person();
   


    MonitorPatients(JPanel userProcessContainer, DoctorOrganization doctorOrganization, Enterprise enterprise,Person person) {
               initComponents();
        this.userProcessContainer = userProcessContainer;

        this.doctorOrganization = doctorOrganization;
        this.enterprise = enterprise;
        this.person=person;
        
        populateVitalSigns();

        
        populateVitalSignsTrend();
    }
    
    
  public void populateVitalSignNow()
    {
        Random randomNo = new Random();
        
        int heartRate = 0;
        int respRate = 0;
        int sysBP = 0;
        int temp = randomNo.nextInt(100 - 97) + 97;
        person.setAge(5);
        person.setFirstName("Karthik");
        if(person.getAge() <= 3)
        {
            respRate = randomNo.nextInt(31 - 20) + 20;
            heartRate = randomNo.nextInt(131 - 80) + 80;
            sysBP = randomNo.nextInt(111 - 80) + 80;
        }
        else if(person.getAge()> 3 && person.getAge() <=5)
        {
            respRate = randomNo.nextInt(31 - 20) + 20;
            heartRate = randomNo.nextInt(121 - 80) + 80;
            sysBP = randomNo.nextInt(111 - 80) + 80;
        }
        else if(person.getAge()>=6 && person.getAge()<=12)
        {
            respRate = randomNo.nextInt(31 - 20) + 20;
            heartRate = randomNo.nextInt(111 - 70) + 70;
            sysBP = randomNo.nextInt(121 - 80) + 80;
        }
        else
        {
            respRate = randomNo.nextInt(21 - 12) + 12;
            heartRate = randomNo.nextInt(111 - 55) + 55;
            sysBP = randomNo.nextInt(121 - 110) + 110;
        }
        
        Vitals vitalSign = person.getVitalsHistory().addVitalSign();
        
        vitalSign.setHeartRate(heartRate);
        vitalSign.setRespiratoryRate(respRate);
        vitalSign.setSystolicBP(sysBP);
        vitalSign.setTemperature(temp);
        vitalSign.setStatus(person.getVitalsHistory().getVitalSignStatus(person.getAge(), vitalSign));
        vitalSign.setDate(new Date());
    }
    
    public void populateVitalSigns()
    {
        DefaultTableModel dtm = (DefaultTableModel)vitalSignTable.getModel();
        dtm.setRowCount(0);
        
        for(Vitals vs : person.getVitalsHistory().getVitalSignList())
        {
            Object [] row = new Object[6];
            row[0] = vs;
            row[1] = vs.getHeartRate();
            row[2] = vs.getRespiratoryRate();
            row[3] = vs.getBP();
            row[4] = vs.getTemperature();
            row[5] = vs.getStatus();
            dtm.addRow(row);
        }
    }
                                        

                                     

    public void populateVitalSignsTrend()
    {
        {
            XYSeriesCollection respRatedataset = new XYSeriesCollection();
            JFreeChart lineChart1 = ChartFactory.createXYLineChart("","Time" , "Respiratory Rate", respRatedataset, PlotOrientation.VERTICAL, true, true, false);

            XYSeries respiratoryRate = new XYSeries("Respiratory Rate");

            int trentCount = 0;
            for (Vitals vitalSign : person.getVitalsHistory().getVitalSignList())
            {
                respiratoryRate.add(trentCount, vitalSign.getRespiratoryRate());
                trentCount++;
            }

            respRatedataset.addSeries(respiratoryRate);

            jPanel1.setLayout(new java.awt.BorderLayout());
            ChartPanel chartPanel1 = new ChartPanel(lineChart1);
            chartPanel1.setPreferredSize(getPreferredSize());
            jPanel1.add(chartPanel1);
            jPanel1.validate();
        }
        {
            XYSeriesCollection heartRatedataset = new XYSeriesCollection();
            JFreeChart lineChart2 = ChartFactory.createXYLineChart("","Time" , "Heart Rate", heartRatedataset, PlotOrientation.VERTICAL, true, true, false);

            XYSeries heartRate = new XYSeries("Heart Rate");

            int trentCount = 0;
            for (Vitals vitalSign : person.getVitalsHistory().getVitalSignList())
            {
                heartRate.add(trentCount, vitalSign.getHeartRate());
                trentCount++;
            }

            heartRatedataset.addSeries(heartRate);

            jPanel2.setLayout(new java.awt.BorderLayout());
            ChartPanel chartPanel2 = new ChartPanel(lineChart2);
            chartPanel2.setPreferredSize(getPreferredSize());
            jPanel2.add(chartPanel2,BorderLayout.CENTER);
            jPanel2.validate();
        }
        {
            XYSeriesCollection bloodPressuredataset = new XYSeriesCollection();
            JFreeChart lineChart3 = ChartFactory.createXYLineChart("","Time" , "Blood Pressure", bloodPressuredataset, PlotOrientation.VERTICAL, true, true, false);

            XYSeries sysBP = new XYSeries("Blood Pressure");

            int trentCount = 0;
            for (Vitals vitalSign : person.getVitalsHistory().getVitalSignList())
            {
                sysBP.add(trentCount, vitalSign.getBP());
                trentCount++;
            }

            bloodPressuredataset.addSeries(sysBP);

            jPanel3.setLayout(new java.awt.BorderLayout());
            ChartPanel chartPanel3 = new ChartPanel(lineChart3);
            chartPanel3.setPreferredSize(getPreferredSize());
            jPanel3.add(chartPanel3,BorderLayout.CENTER);
            jPanel3.validate();
        }
        {
            XYSeriesCollection tempdataset = new XYSeriesCollection();
            JFreeChart lineChart4 = ChartFactory.createXYLineChart("","Time" , "Temperature", tempdataset, PlotOrientation.VERTICAL, true, true, false);

            XYSeries temp = new XYSeries("Temperature");

            int trentCount = 0;
            for (Vitals vitalSign : person.getVitalsHistory().getVitalSignList())
            {
                temp.add(trentCount, vitalSign.getTemperature());
                trentCount++;
            }

            tempdataset.addSeries(temp);

            jPanel4.setLayout(new java.awt.BorderLayout());
            ChartPanel chartPanel4 = new ChartPanel(lineChart4);
            chartPanel4.setPreferredSize(getPreferredSize());
            jPanel4.add(chartPanel4,BorderLayout.CENTER);
            jPanel4.validate();
        }
    }
    
    @Override
    public Dimension getPreferredSize() {
        // given some values of w & h
        return new Dimension(310, 210);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalSignTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        recommendBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        recommendTxt = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        vitalSignTable.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        vitalSignTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Heart Rate", "Respiratory Rate", "Blood Pressure", "Temperature", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vitalSignTable);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 102), new java.awt.Color(0, 153, 102), new java.awt.Color(0, 153, 102), new java.awt.Color(0, 204, 102)));
        jPanel1.setMaximumSize(new java.awt.Dimension(30000, 30000));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 102), new java.awt.Color(0, 153, 102), new java.awt.Color(0, 153, 102), new java.awt.Color(0, 204, 102)));
        jPanel2.setMaximumSize(new java.awt.Dimension(30000, 30000));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 102), new java.awt.Color(0, 153, 102), new java.awt.Color(0, 153, 102), new java.awt.Color(0, 204, 102)));
        jPanel4.setMaximumSize(new java.awt.Dimension(30000, 30000));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 102), new java.awt.Color(0, 153, 102), new java.awt.Color(0, 153, 102), new java.awt.Color(0, 204, 102)));
        jPanel3.setMaximumSize(new java.awt.Dimension(30000, 30000));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
        );

        recommendBtn.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N
        recommendBtn.setText("Recommend");
        recommendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recommendBtnActionPerformed(evt);
            }
        });

        recommendTxt.setColumns(20);
        recommendTxt.setRows(5);
        jScrollPane2.setViewportView(recommendTxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(738, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recommendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(backButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(recommendBtn)
                .addGap(113, 113, 113))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(backButton)
                    .addGap(31, 31, 31)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void recommendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recommendBtnActionPerformed
        String recommend = recommendTxt.getText();
        
        for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof NurseOrganization)
            for(Person per : org.getPersonDirectory().getPersonList())
            {
       person.setRecommendations(recommend);
        
            }
    }//GEN-LAST:event_recommendBtnActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton recommendBtn;
    private javax.swing.JTextArea recommendTxt;
    private javax.swing.JTable vitalSignTable;
    // End of variables declaration//GEN-END:variables
}
