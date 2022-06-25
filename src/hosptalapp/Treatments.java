/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosptalapp;

/**
 *
 * @author ASUS
 */
public class Treatments {
    private String prosnum;//رقم المعالجة
    private String prosdate;//تاريخ المعالجة
    private String treatment;//كلفة المعالجة
    private double iddoctor;//رقم الدكتور
    
    public Treatments(String prosnum,String prosdate,String treatment,double iddoctor){
        this.prosnum=prosnum;
        this.prosdate=prosdate;
        this.treatment=treatment;
        this.iddoctor=iddoctor;
    }

    Treatments(String treatment1, String cost, Date D5, double iddoctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void getTreatmentsinfo(){
        System.out.println("prosnum: "+prosnum+"prosdate:"+prosdate+"treeatment: "+treatment+"id doctor"+iddoctor);
    }
    
}
