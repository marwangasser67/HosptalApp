/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosptalapp;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Patient extends Person{
    ArrayList <Treatments> TList;
    
    public Patient(double id,String name,Date date,Address address,ArrayList <Treatments> TList){
        super (id,name,date,address);
        this.TList=TList;
    }

     
public void getpatientsinfo(){
    super.getPersoninfo();
    for(int i=0;i<TList.size();i++){
        TList.get(i).getTreatmentsinfo();
    }
}

}
