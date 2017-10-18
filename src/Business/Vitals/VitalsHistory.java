/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vitals;

import java.util.ArrayList;

/**
 *
 * @author Trupti
 */
public class VitalsHistory {
    private ArrayList<Vitals> vitalSignList;
    
    public VitalsHistory()
    {
        this.vitalSignList = new ArrayList<>();
    }

    public ArrayList<Vitals> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<Vitals> VitalSignList) {
        this.vitalSignList = VitalSignList;
    }
    
    public Vitals addVitalSign()
    {
        Vitals v = new Vitals();
        vitalSignList.add(v);
        return v;  
    }
    
    public void deleteVitalSign(Vitals vitals)
    {
        vitalSignList.remove(vitals);
    }
    
    public String getVitalSignStatus(int age,Vitals vitalSign)
    {
        String status = null;
        if (age>=1 && age<=3)
        {
            
            if (((vitalSign.getRespiratoryRate()>=20)&&(vitalSign.getRespiratoryRate()<=30)) &&
                    ((vitalSign.getHeartRate()>=80)&&(vitalSign.getHeartRate()<=130)) &&
                    ((vitalSign.getBP()>=80)&&(vitalSign.getBP()<=110)) &&
                    ((vitalSign.getTemperature()>=97)&&(vitalSign.getTemperature()<=100)))
            {
                    status = "Standard";//validation for Age group
            }
            else
            {
                status = "Irregular";
            }
        }
        else if (age>=4 && age<=5)
        {
            
            if (((vitalSign.getRespiratoryRate()>=20)&&(vitalSign.getRespiratoryRate()<=30)) &&
                    ((vitalSign.getHeartRate()>=80)&&(vitalSign.getHeartRate()<=120)) &&
                    ((vitalSign.getBP()>=80)&&(vitalSign.getBP()<=110)) &&
                    ((vitalSign.getTemperature()>=97)&&(vitalSign.getTemperature()<=100)))
            {
                status = "Standard";//validation for Age group
            }
            else
            {
                status = "Irregular";
            }
        }


        else if (age>=6 && age<=12)
        {
           
            if (((vitalSign.getRespiratoryRate()>=20)&&(vitalSign.getRespiratoryRate()<=30)) &&
                    ((vitalSign.getHeartRate()>=70)&&(vitalSign.getHeartRate()<=110)) &&
                    ((vitalSign.getBP()>=80)&&(vitalSign.getBP()<=120)) &&
                    ((vitalSign.getTemperature()>=97)&&(vitalSign.getTemperature()<=100)))
            {
                status = "Standard";//validation for Age group
            }
            else
            {
                status = "Irregular";
            }
        }


        else if (age>=13)
        {
         
            if (((vitalSign.getRespiratoryRate()>=12)&&(vitalSign.getRespiratoryRate()<=20)) &&
                ((vitalSign.getHeartRate()>=55)&&(vitalSign.getHeartRate()<=105)) &&
                ((vitalSign.getBP()>=110)&&(vitalSign.getBP()<=120)) &&
                ((vitalSign.getTemperature()>=97)&&(vitalSign.getTemperature()<=100)))
            {
                status = "Standard";//validation for Age group
            }
            else
            {
                status = "Irregular";
            }
        }
        return status;
    }
}
