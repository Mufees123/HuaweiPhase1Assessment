package com.InterestCalculator;

//Bankdetails class is used Get information  about the bank
public class BanksDetails {
    //Variable declarition for Bank details
    public String name;
    public  String ID;
    public  String IFSC;
    public  String MICRcode;
    public String ph_no;
    public String location;
    //Constructor For Bankdetails class
    public BanksDetails(String name, String ID, String IFSC, String MICRcode, String ph_no,String location) {
        this.name = name;//Name
        this.ID = ID;
        this.IFSC = IFSC;
        this.MICRcode = MICRcode;
        this.ph_no = ph_no;
        this.location=location;
    }
    //Display Method for Bank details Attibutes
    public void GetDetials(){
        System.out.println("Bank Name:"+name);
        System.out.println("");
        System.out.println("BankID :"+ID);
        System.out.println("IFCS :"+IFSC);
        System.out.println("MICRcode :"+MICRcode);
        System.out.println("");
    }
}
