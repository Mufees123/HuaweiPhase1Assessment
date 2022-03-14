package com.InterestCalculator;

//Interest Class that extends Bankdetials
public class Interest extends  BanksDetails{
    //Constructor For Interest Class
    public Interest(String name, String ID, String IFSC, String MICRcode, String ph_no,String location) {
       //Super Class (Bank details) Constructor
        super(name, ID, IFSC, MICRcode, ph_no,location);

    }
    private int ploan;//Rate of Interest for personal loan
    private int hloan;//Rate of Interest for Housing loan
    private  int eloan;//Rate of Interst for Education loan
    private  int gloan;//Rate of Interest for Gold loan
    private int hyear;//Period of Time for Housing loan
    private  int pyear;//Period of Time for Personal loan
    private int eyear;//Period of time for Education loan
    private  int gyear;//Period of time for Gold Loan
    //Setter method For Interest Class
    public  void setInterest(int ploan,int hloan,int eloan,int gloan,int pyear,int hyear,int eyear,int gyear ){
        this.ploan=ploan;
        this.eloan=eloan;
        this.hloan=hloan;
        this.gloan=gloan;
        this.pyear=pyear;
        this.hyear=hyear;
        this.gyear=gyear;
        this.eyear=eyear;
    }
    //Getter Method For Interest class
    public int getPloan() {
        return ploan;
    }


    public int getHloan() {
        return hloan;
    }



    public int getEloan() {
        return eloan;
    }


    public int getGloan() {
        return gloan;
    }


    public  int getHyear() {
        return hyear;
    }

    public int getPyear() {
        return pyear;
    }

    public int getEyear() {
        return eyear;
    }

    public int getGyear() {
        return gyear;
    }
}

