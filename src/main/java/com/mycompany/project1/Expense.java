package com.mycompany.project1;

import java.time.LocalDate;


public class Expense extends Transaction  {

    private  String category; 
   
    public Expense(double amount, LocalDate date, String Note, String category) {
        super(amount, date, Note);
        this.category = category;
        
    }

    public String getCategory() {
        return category;
    }
 
    @Override
    public double calculateImpact() {
       
        return -getAmount();
    }

    @Override
    public String getType() {
        return "Expense";
    }

}
