/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosptalapp;

import java.util.*;
public class Hospital {
    private ArrayList <Doctors> DocList;
    private ArrayList <Patient> Palist;
    private ArrayList <Treatments> TrList;

    public Hospital(){
       DocList=new  ArrayList <Doctors>();
       Palist=new ArrayList <Patient>();
       TrList=new ArrayList <Treatments>();
    }
    public void Adddoctors(){
        Scanner S=new Scanner(System.in);
        System.out.println("please enter the id:");
        double id=S.nextDouble();
        System.out.println("please enter the name: ");
        String name=S.next();
        System.out.println("please enter the day");
        String day=S.next();
        System.out.println("please enter the month");
        String month=S.next();
        System.out.println("please enter the year");
        String year=S.next();
        System.out.println("please enter the name of strret");
        String street=S.next();
        System.out.println("please enter name of the city");
        String city=S.next();
        System.out.println("please enter the competence");
        String com=S.next();
    Address A=new Address(street,city);
    Date D=new Date(day,month,year);
    
    Doctors D1=new Doctors(id,name,D,A,com);
    DocList.add(D1);
    }
    public void getalldoctorinfo(){
        for(int i=0;i<DocList.size();i++){
            DocList.get(i).getdoctorinfo();
        }}
    public void Addpatients(){
        Scanner S1=new Scanner(System.in);
         System.out.println("please enter the id:");
        double id=S1.nextDouble();
        System.out.println("please enter the name: ");
        String name=S1.next();
        System.out.println("please enter the day");
        String day=S1.next();
        System.out.println("please enter the month");
        String month=S1.next();
        System.out.println("please enter the year");
        String year=S1.next();
        Date D4=new Date(day,month,year);
        System.out.println("please enter the name of strret");
        String street=S1.next();
        System.out.println("please enter name of the city");
        String city=S1.next();
        Address A3=new Address(street,city);
        System.out.println("please enter the num the treatment");
        int J=S1.nextInt();
        for(int i=0;i<J;i++){
            String treatment1=S1.next();
            System.out.println("enter enter the day");
            String day1=S1.next();
            System.out.println("please enter the month");
            String month1=S1.next();
            System.out.println("please enter year");
            String year1=S1.next();
            Date D5=new Date(day1,month1,year1);
            System.out.println("please enter the cost");
            String cost=S1.next();
            System.out.println("please enter the id doctor");
            double iddoctor=S1.nextDouble();
            Treatments T1=new Treatments(treatment1,cost,D5,iddoctor);
            TrList.add(T1);
        }
        
        Patient P1=new Patient(id,name,D4,A3,TrList);
        Palist.add(P1);}
    
    public void getpatientinfo(){
        for(int j=0;j<Palist.size();j++){
            Palist.get(j).getpatientsinfo();
        }}
    public void searchdoctorname(){
        if(!DocList.isEmpty()){
            Scanner S2=new Scanner(System.in);
            String doctor=S2.next();
            for(int i=0;i<DocList.size();i++){
                if(DocList.get(i).getname().equalsIgnoreCase(doctor))
                    System.out.println(DocList.get(i).getdoctorinfo());
            }}}
    
    void list(){
        boolean r=true;
        Scanner s=new Scanner(System.in);
        while(r){
            System.out.println("\n enter 1 for add a doctor:"+"\n enter 2 for search a doctor name"+"\n enter 3 to list all doctor "
 +"\n enter 4 to add patients and tratments"+"\n enter 5 to list all patient and treatments"+"\n enter 6 for exite");                   
        
        System.out.println("\n enter a choice");
        int option=s.nextInt();
        switch(option){
            case 1: Adddoctors();
            break;
            case 2:searchdoctorname();
            break;
            case 3:getalldoctorinfo();
            break;
            case 4:Addpatients();
            break;
            case 5:getpatientinfo();
            break;
            case 6:r=false;
            break;
            default:System.out.println("bad programmer");
        }
        
    }}}
    

