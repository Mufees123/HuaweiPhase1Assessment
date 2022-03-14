package com.InterestCalculator;

//Display Class
public class Display {
    //Display Method
    public  void display(String name,String phone,String Acc,String Typeofloan,int interest){
        System.out.println("User Name: "+name);//User name
        System.out.println("Phone Number: "+phone);//Phone number
        System.out.println("Acc No: "+Acc);//Account number
        System.out.println("Typeofloan: "+Typeofloan);//Type of loan
        System.out.println("Total Interest : "+(double)interest);//Total Interest
        System.out.println("Interest per month: "+(double)interest/12);//Interest  per month
    }
}
