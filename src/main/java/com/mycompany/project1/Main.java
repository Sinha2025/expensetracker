package com.mycompany.project1;

public class Main {

    public static void main(String[] args) {
        
        Reposatory db = new Reposatory()  ;
         db.loadCSV();
        dashbord d=new dashbord(db);
        d.setVisible(true);
    
    }
}
