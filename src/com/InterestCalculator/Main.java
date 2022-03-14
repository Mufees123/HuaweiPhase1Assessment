package com.InterestCalculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating Object For various Banks SBI,Indian Bank,HDFC,Axis,Karur Vysya Bank
        Interest SBI=new Interest("State Bank of India","192311FE11","190GT178999","11111ERT","9876451122","Bangalore");
        Interest IB=new Interest("Indian Bank","1222FRT000","18FGTHSSSR","9088876661","8689010001","Chennai");
        Interest HDFC=new Interest("HDFC Bank","15677QQQ","190FRTT","789112342","9856612311","Mumbai");
        Interest Axis=new Interest("Axis","16YTRETQ","1FRTQ000","891223452","6375412311","Delhi");
        Interest KVB=new Interest("Karur Vysya Bank","17FTQTY","187FDRT001","809877771","7891113211","Karur");

       //Setting rate of interest for personal,Education,Gold,Hosuing Loan For arious Banks
        SBI.setInterest(6,7,5,8,15,20,5,12);
        IB.setInterest(8,7,6,4,10,15,6,12);
        HDFC.setInterest(7,8,7,9,14,16,5,12);
        Axis.setInterest(8,9,5,4,10,12,6,12);
        KVB.setInterest(5,4,3,6,9,10,5,12);
       //Scanner Class For getting user input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String n=sc.next();//Getting user name
        System.out.println("Enter the Account Number");
        String acc=sc.next();//Getting user Account
        System.out.println("Enter the phone Number");
        String ph=sc.next();//Getting User Phone number
        System.out.println();//Printing Empty line For space
        //Displaying Avaliable Banks
        System.out.println("Press 1 For SBI");
        System.out.println("Press 2 For Indian Bank");
        System.out.println("Press 3 For HDFC");
        System.out.println("Press 4 for Axis");
        System.out.println("Press 5 for KVB");
        System.out.println();
        System.out.println("Enter the Choice");
        int c=sc.nextInt();
        //Creating Object For Calculations classs
        Calculations s=new Calculations();
        //Creating Object For Calculation
        Display d=new Display();
        //Switch case For selecting the Bank
        switch (c) {
            case 1://SBI
                //Printing The Types of loans
                System.out.println("Enter 1 for housing loan");
                System.out.println("Enter 2 for personal loan");
                System.out.println("Enter 3 for goldloan");
                System.out.println("Enter 4 for educationloan");
                int tloan = sc.nextInt();//Selecting the loan type using the user input and if statement
                if (tloan == 1) {
                    System.out.println("Enter The principal amount");
                    int p = sc.nextInt();
                      int interest= s.calculate_interest( p,SBI.getHloan(), SBI.getHyear());//Passing The parameters Calculation class For getting interest
                      d.display(n,ph,acc,"Housing Loan",interest);//Display userDetails and interest

                } else if (tloan == 2) {
                    System.out.println("Enter The principal amount");
                    int p = sc.nextInt();
                    int interest= s.calculate_interest( p,SBI.getPloan(), SBI.getPyear());
                    d.display(n,ph,acc,"Personal Loan",interest);
                } else if (tloan == 3) {
                    System.out.println("Enter The number of Grams");
                    int g = sc.nextInt();
                    int cost=2500;
                    int interest= s.calculate_interest( g,SBI.getGloan(), SBI.getGyear(),cost);
                    d.display(n,ph,acc,"Gold Loan",interest);
                } else if (tloan == 4) {
                    System.out.println("Enter The principal amount");
                    int p = sc.nextInt();
                    int interest= s.calculate_interest( p,SBI.getEloan(),SBI.getEyear());
                    d.display(n,ph,acc,"Education Loan",interest);
                }
                break;
            case 2 ://Indian Bank
                System.out.println("Enter 1 for housing loan");
                System.out.println("Enter 2 for personal loan");
                System.out.println("Enter 3 for goldloan");
                System.out.println("Enter 4 for educationloan");
                int tloan1 = sc.nextInt();
                if (tloan1 == 1) {
                    System.out.println("Enter The principal amount");
                    int p = sc.nextInt();
                    int interest= s.calculate_interest( p,IB.getHloan(), IB.getHyear());
                    d.display(n,ph,acc,"Housing Loan",interest);
                } else if (tloan1 == 2) {
                    System.out.println("Enter The principal amount");
                    int p = sc.nextInt();
                    int interest= s.calculate_interest( p,IB.getPloan(), IB.getPyear());
                    d.display(n,ph,acc,"Personal Loan",interest);
                } else if (tloan1 == 3) {

                    System.out.println("Enter The number of Grams");
                    int g = sc.nextInt();
                    int cost=2500;
                    int interest= s.calculate_interest( g,IB.getGloan(), IB.getGyear(),c);
                    d.display(n,ph,acc,"Gold Loan",interest);
                } else if (tloan1 == 4) {
                    System.out.println("Enter The principal amount");
                    int p = sc.nextInt();
                    int interest= s.calculate_interest( p,IB.getEloan(),IB.getEyear());
                    d.display(n,ph,acc,"Education Loan",interest);
                }
                break;
            case 3 ://HDFC
                System.out.println("Enter 1 for housing loan");
                System.out.println("Enter 2 for personal loan");
                System.out.println("Enter 3 for goldloan");
                System.out.println("Enter 4 for educationloan");
                int tloan2 = sc.nextInt();
                if (tloan2 == 1) {
                    System.out.println("Enter The principal amount");
                    int p = sc.nextInt();
                    int interest= s.calculate_interest( p,HDFC.getHloan(), HDFC.getHyear());
                    d.display(n,ph,acc,"Housing Loan",interest);
                } else if (tloan2 == 2) {
                    System.out.println("Enter The principal amount");
                    int p = sc.nextInt();
                    int interest= s.calculate_interest( p,HDFC.getPloan(), HDFC.getPyear());
                    d.display(n,ph,acc,"Personal Loan",interest);
                } else if (tloan2 == 3) {

                    System.out.println("Enter The number of Grams");
                    int g = sc.nextInt();
                    int cost=2500;
                    int interest= s.calculate_interest( g,HDFC.getGloan(), HDFC.getGyear(),c);
                    d.display(n,ph,acc,"Gold Loan",interest);
                } else if (tloan2 == 4) {
                    System.out.println("Enter The principal amount");
                    int p = sc.nextInt();
                    int interest= s.calculate_interest( p,HDFC.getEloan(), HDFC.getEyear());
                    d.display(n,ph,acc,"Education Loan",interest);
                }
                break;

            case 4://Axis

                System.out.println("Enter 1 for housing loan");
                System.out.println("Enter 2 for personal loan");
                System.out.println("Enter 3 for goldloan");
                System.out.println("Enter 4 for educationloan");
                int tloan3 = sc.nextInt();
                if (tloan3 == 1) {
                    System.out.println("Enter The principal amount");
                    int p = sc.nextInt();
                    int interest= s.calculate_interest( p,Axis.getHloan(), Axis.getHyear());
                    d.display(n,ph,acc,"Housing Loan",interest);
                } else if (tloan3 == 2) {
                    System.out.println("Enter The principal amount");
                    int p = sc.nextInt();
                    int interest= s.calculate_interest( p,Axis.getPloan(), Axis.getPyear());
                    d.display(n,ph,acc,"Personal Loan",interest);
                } else if (tloan3 == 3) {

                    System.out.println("Enter The number of Grams");
                    int g = sc.nextInt();
                     int cost=2500;
                    int interest= s.calculate_interest( g,Axis.getGloan(), Axis.getGyear(),cost);
                    d.display(n,ph,acc,"Gold Loan",interest);
                } else if (tloan3 == 4) {
                    System.out.println("Enter The principal amount");
                    int p = sc.nextInt();
                    int interest= s.calculate_interest( p,Axis.getEloan(), Axis.getEyear());
                    d.display(n,ph,acc,"Education Loan",interest);
                }
                break;
            case 5://KVB
                System.out.println("Enter 1 for housing loan");
                System.out.println("Enter 2 for personal loan");
                System.out.println("Enter 3 for goldloan");
                System.out.println("Enter 4 for educationloan");
                int tloan4 = sc.nextInt();
                if (tloan4 == 1) {
                    System.out.println("Enter The principal amount");
                    int p = sc.nextInt();
                    int interest= s.calculate_interest( p,KVB.getHloan(), KVB.getHyear());
                    d.display(n,ph,acc,"Housing Loan",interest);
                } else if (tloan4 == 2) {
                    System.out.println("Enter The principal amount");
                    int p = sc.nextInt();
                    int interest= s.calculate_interest( p,KVB.getPloan(), KVB.getPyear());
                    d.display(n,ph,acc,"Personal Loan",interest);
                 } else if (tloan4 == 3) {

                    System.out.println("Enter The number of Grams");
                    int g = sc.nextInt();
                    int cost=2500;
                    int interest= s.calculate_interest( g,KVB.getGloan(), KVB.getGyear());
                    d.display(n,ph,acc,"Gold Loan",interest);
                } else if (tloan4 == 4) {
                    System.out.println("Enter The principal amount");
                    int p = sc.nextInt();
                    int interest= s.calculate_interest( p,KVB.getEloan(), KVB.getEyear());
                    d.display(n,ph,acc,"Housing Loan",interest);
                }
                   break;
                }

        }

        }





