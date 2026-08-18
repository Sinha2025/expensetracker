
package com.mycompany.project1;

import java.time.LocalDate;


public abstract class Transaction {

    private double amount;
    private  LocalDate date;
    private  String Note;

    protected Transaction(double amount, LocalDate date, String Note) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
         
 
        this.amount = amount;
        this.date = date;
        this.Note = Note;
    }


    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNote(){
    
    return Note; }
     
  

  
    public abstract double calculateImpact();

    
    public abstract String getType();

 
}
