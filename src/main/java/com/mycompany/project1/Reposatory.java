package com.mycompany.project1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reposatory {

    private ArrayList<Transaction> expenses_and_Incomes = new ArrayList<>();

    public void addTransaction(Transaction t) {
        expenses_and_Incomes.add(t);
    }

    public String[][] get_all_incomes() {

        ArrayList<Transaction> incomes = new ArrayList<>();

        for (Transaction obj : expenses_and_Incomes) {

            if (obj instanceof Income) {
                incomes.add(obj);
            }
        }

        String[][] incomeData = new String[incomes.size()][5];

        for (int i = 0; i < incomes.size(); i++) {

            Income inc = (Income) incomes.get(i);

            incomeData[i][0] = inc.getType();
            incomeData[i][1] = inc.getSource();
            incomeData[i][2] = String.valueOf(inc.getAmount());
            incomeData[i][3] = String.valueOf(inc.getDate());
            incomeData[i][4] = inc.getNote();
        }

        return incomeData;
    }

    public String[][] get_all_expenses() {

        ArrayList<Transaction> expenses = new ArrayList<>();

        for (Transaction obj : expenses_and_Incomes) {

            if (obj instanceof Expense) {
                expenses.add(obj);
            }
        }

        String[][] expenseData = new String[expenses.size()][5];

        for (int i = 0; i < expenses.size(); i++) {

            Expense exp = (Expense) expenses.get(i);

            expenseData[i][0] = exp.getType();
            expenseData[i][1] = exp.getCategory();
            expenseData[i][2] = String.valueOf(exp.getAmount());
            expenseData[i][3] = String.valueOf(exp.getDate());
             expenseData[i][4] = String.valueOf(exp.getNote());
        }

        return expenseData;
    }


    public String[][] get7daysexpenses() {

        LocalDate todaydate = LocalDate.now();
        LocalDate _7daysagodate = todaydate.minusDays(7);

        List<Expense> filtered_expense_List = new ArrayList<>();

        for (Transaction obj : expenses_and_Incomes) {

            if (obj instanceof Expense
                    && !obj.getDate().isBefore(_7daysagodate)
                    && !obj.getDate().isAfter(todaydate)) {

                Expense ex = (Expense) obj;
                filtered_expense_List.add(ex);
            }
        }

        String[][] data =
                new String[filtered_expense_List.size()][5];

        for (int i = 0; i < filtered_expense_List.size(); i++) {

            Expense ex = filtered_expense_List.get(i);

            data[i][0] = ex.getType();
            data[i][1] = ex.getCategory();
            data[i][2] = String.valueOf(ex.getAmount());
            data[i][3] = String.valueOf(ex.getDate());
            data[i][4] = ex.getNote();
        }

        return data;
    }

    public double getTotalExpense() {

        double total = 0;

        for (Transaction obj : expenses_and_Incomes) {

            if (obj instanceof Expense) {

                Expense ex = (Expense) obj;
                total += ex.getAmount();
            }
        }

        return total;
    }

    public double getFoodCost() {

        double total = 0;

        for (Transaction obj : expenses_and_Incomes) {

            if (obj instanceof Expense) {

                Expense ex = (Expense) obj;

                if (ex.getCategory().equals("Food")) {
                    total += ex.getAmount();
                }
            }
        }

        return total;
    }


    public double getEntertainmentCost() {

        double total = 0;

        for (Transaction obj : expenses_and_Incomes) {

            if (obj instanceof Expense) {

                Expense ex = (Expense) obj;

                if (ex.getCategory().equals("Entertainment")) {
                    total += ex.getAmount();
                }
            }
        }

        return total;
    }


    public double getHealthCost() {

        double total = 0;

        for (Transaction obj : expenses_and_Incomes) {

            if (obj instanceof Expense) {

                Expense ex = (Expense) obj;

                if (ex.getCategory().equals("Health")) {
                    total += ex.getAmount();
                }
            }
        }

        return total;
    }



    public double getEducationCost() {

        double total = 0;

        for (Transaction obj : expenses_and_Incomes) {

            if (obj instanceof Expense) {

                Expense ex = (Expense) obj;

                if (ex.getCategory().equals("Education")) {
                    total += ex.getAmount();
                }
            }
        }

        return total;
    }


    public double getOthersCost() {

        double total = 0;

        for (Transaction obj : expenses_and_Incomes) {

            if (obj instanceof Expense) {

                Expense ex = (Expense) obj;

                if (ex.getCategory().equals("Others")) {
                    total += ex.getAmount();
                }
            }
        }

        return total;
    }


    public double getFoodPercentage() {

        if (getTotalExpense() == 0) {
            return 0;
        }

        return (getFoodCost() / getTotalExpense()) * 100;
    }




    public double getEntertainmentPercentage() {

        if (getTotalExpense() == 0) {
            return 0;
        }

        return (getEntertainmentCost() / getTotalExpense()) * 100;
    }



    public double getHealthPercentage() {

        if (getTotalExpense() == 0) {
            return 0;
        }

        return (getHealthCost() / getTotalExpense()) * 100;
    }


    public double getEducationPercentage() {

        if (getTotalExpense() == 0) {
            return 0;
        }

        return (getEducationCost() / getTotalExpense()) * 100;
    }



    public double getOthersPercentage() {

        if (getTotalExpense() == 0) {
            return 0;
        }

        return (getOthersCost() / getTotalExpense()) * 100;
    }


    public void deleteExpense(String category, String Note) {

        for (Transaction obj : expenses_and_Incomes) {

            if (obj instanceof Expense) {

                Expense ex = (Expense) obj;

                if (ex.getCategory().equals(category)&& ex.getNote().equals(Note)) {
                 expenses_and_Incomes.remove(obj);
                }
            }
        }
        
    }


 

    public void deleteIncome(String Source, String Note) {
for (Transaction obj : expenses_and_Incomes) {

            if (obj instanceof Income) {

                Income in = (Income) obj;

                if (in.getSource().equals(Source)&& in.getNote().equals(Note)) {
                 expenses_and_Incomes.remove(obj);
                }
            }
        }
        
    }

 
    public String[][] searchExpenseByCategory(String category) {
        ArrayList<Expense> matchedList = new ArrayList<>();

        for (Transaction obj : expenses_and_Incomes) {
            if (obj instanceof Expense) {
                Expense ex = (Expense) obj;
                if (ex.getCategory().equalsIgnoreCase(category)) {
                    matchedList.add(ex);
                }
            }
        }

        String[][] data = new String[matchedList.size()][5];
        for (int i = 0; i < matchedList.size(); i++) {
            Expense ex = matchedList.get(i);
            data[i][0] = ex.getType();
            data[i][1] = ex.getCategory();
            data[i][2] = String.valueOf(ex.getAmount());
            data[i][3] = String.valueOf(ex.getDate());
            data[i][4] = ex.getNote();
        }
        return data;
    }


    public String[][] searchIncomeBySource(String source) {
        ArrayList<Income> matchedList = new ArrayList<>();

        for (Transaction obj : expenses_and_Incomes) {
            if (obj instanceof Income) {
                Income inc = (Income) obj;
                if (inc.getSource().equals(source)) {
                    matchedList.add(inc);
                }
            }
        }

        String[][] data = new String[matchedList.size()][4];
        for (int i = 0; i < matchedList.size(); i++) {
            Income inc = matchedList.get(i);
            data[i][0] = inc.getType();
            data[i][1] = inc.getSource();
            data[i][2] = String.valueOf(inc.getAmount());
            data[i][3] = String.valueOf(inc.getDate());
        }
        return data;
    }
    
public double get_total_Income() {

    double total = 0;

    for (Transaction obj : expenses_and_Incomes) {

        if (obj instanceof Income) {
            Income in = (Income) obj;
            total += in.getAmount();
        }
    }

    return total;
}


public double get_total_expense() {

    double total = 0;

    for (Transaction obj : expenses_and_Incomes) {

        if (obj instanceof Expense) {
            Expense ex = (Expense) obj;
            total += ex.getAmount();
        }
    }

    return total;
}

    public double get_current_balance() {
    double balance = 0;

    for (Transaction obj : expenses_and_Incomes) {
        balance += obj.calculateImpact();
    }

    return balance; 
    }
    
public void generateCSV() {

    try {

        FileWriter writer = new FileWriter("transactions.csv");

        writer.write("Type,SourceOrCategory,Amount,Date,Note\n");

        for (Transaction t : expenses_and_Incomes) {

            if (t instanceof Income) {

                Income in = (Income) t;

                writer.write(
                    "Income,"
                    + in.getSource() + ","
                    + in.getAmount() + ","
                    + in.getDate() + ","
                    + in.getNote()
                    + "\n"
                );

            } else if (t instanceof Expense) {

                Expense ex = (Expense) t;

                writer.write(
                    "Expense,"
                    + ex.getCategory() + ","
                    + ex.getAmount() + ","
                    + ex.getDate() + ","
                    + ex.getNote()
                    + "\n"
                );
            }
        }

        writer.close();

    } catch (IOException e) {
        e.printStackTrace();
    }
} 
    
 
public void loadCSV() {

    try {

        BufferedReader reader =
                new BufferedReader(
                        new FileReader("transactions.csv")
                );

       
        reader.readLine();

        String line;

        while ((line = reader.readLine()) != null) {

            String[] data = line.split(",");

            String type = data[0];
            String sourceOrCategory = data[1];
            double amount = Double.parseDouble(data[2]);
            LocalDate date = LocalDate.parse(data[3]);
            String note = data[4];

            if (type.equals("Income")) {

                Income income = new Income(
                        amount,
                        date,
                        note,
                        sourceOrCategory
                );

                expenses_and_Incomes.add(income);

            }

            else if (type.equals("Expense")) {

                Expense expense = new Expense(
                        amount,
                        date,
                        note,
                        sourceOrCategory
                );

                expenses_and_Incomes.add(expense);
            }
        }

        reader.close();

    } catch (IOException e) {
        e.printStackTrace();
    }
}

}