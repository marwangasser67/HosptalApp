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
public class Address {
    private String street;
    private String city;
    
    public Address(String street,String city){
        this.street=street;
        this.city=city;
    }
    public String getaddressinfo(){
        return "street is: "+street+"city is: "+city;
    }
}
