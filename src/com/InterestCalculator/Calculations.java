package com.InterestCalculator;

//Calculation class is polymorphism class
public class Calculations {
//This method is used to calculate Personal ,Housing ,Education loan Interests
public int calculate_interest(int Principal_amount,int Rate_of_interest,int Period_of_Time){
    int interest=(Principal_amount*Rate_of_interest*Period_of_Time)/100;
    return interest;
}
//This method is used to calculate Gold load interest
public int calculate_interest(int no_of_grams,int Rate_of_interest,int Period_of_Time,int Cost){
    int intertest=(no_of_grams*Cost*Rate_of_interest*Period_of_Time)/100;
    return intertest;
}

}
