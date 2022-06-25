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
public class Date {
    private String day;
    private String month;
    private String year;

public Date(String day,String month,String year)
{
    this.day=day;
    this.month=month;
    this.year=year;
}
        
        public String getdateinfo(){
return "day: "+day+"month "+month+"year"+year;
}}