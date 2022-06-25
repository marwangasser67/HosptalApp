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
public class Doctors extends Person{
private String com;//الاختصاص

public Doctors (double id,String name,Date date,Address address,String com){
    super(id,name,date,address);
    this.com=com;
}

public String getname(){
    return super.getname();
}

public String getdoctorinfo(){
    return "comp:"+com+"***"+super.getpersoninfo();
}
    
}
