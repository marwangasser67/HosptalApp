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
public class Person {
    private double id;
    private String name;
    private Date date;
    private Address address;
    
    public Person(double id,String name,Date date,Address address){
        this.id=id;
        this.name=name;
        this.date=date;
        this.address=address;
    }
    public String getname(){
        return name;
    }
    public String getpersoninfo(){
        return "id"+id+"name"+name+"**"+address.getaddressinfo()+"***"+date.getdateinfo();
    }

   // String getname() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    void getPersoninfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
