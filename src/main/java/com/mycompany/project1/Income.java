package com.mycompany.project1;

import java.time.LocalDate;

import java.time.LocalDate;


public class Income extends Transaction  {

    private final String source; 

    public Income(double amount, LocalDate date, String Note, String source) {
        super(amount, date, Note);
        this.source = source;
    }

    public String getSource() {
        return source;
    }

 
    @Override
    public double calculateImpact() {
      
        return getAmount();
    }

    @Override
    public String getType() {
        return "Income";
    }

}
