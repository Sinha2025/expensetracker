
package com.mycompany.project1;

import javax.swing.table.DefaultTableModel;
public class dashbord extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(dashbord.class.getName());
          
    
    public Reposatory db;
     
public dashbord(Reposatory db) {
        this.db = db;
        
        initComponents();
         this.setLocationRelativeTo(null);
        show_recent_data();
    } 

   
   

    void show_recent_data() {
        if (db == null ) {
            return; 
        }
        
            
        
   
        double foodPct = db.getFoodPercentage();
        double eduPct = db.getEducationPercentage();
        double hltPct = db. getHealthPercentage();
        double enterPct = db.getEntertainmentPercentage();
        double otrPct = db.getOthersPercentage();

        foodlbl.setText(String.format("%.2f%%", foodPct));
        edulbl.setText(String.format("%.2f%%", eduPct));
        hltlbl.setText(String.format("%.2f%%", hltPct));
        enterlbl.setText(String.format("%.2f%%", enterPct));
        otrlbl.setText(String.format("%.2f%%", otrPct));
        
       String[][] data = db.get7daysexpenses();
        
        DefaultTableModel model = (DefaultTableModel) jtable1.getModel();
        
      
        model.setRowCount(0);
        
      
        if (data != null) {
            for (String[] row : data) {
                model.addRow(row); 
        
        
        
        
        
        
        
        
        
        
    
        }
    }
    

myincome.setText(db.get_total_Income() + " Tk");//total income
totalspent.setText(db.get_total_expense() + "Tk");//totalexpense
availablebaget.setText(db.get_current_balance() + " Tk");// current 


foodcost.setText("BDT" + db.getFoodCost());
educost.setText("BDT" + db.getEducationCost());
hltcost.setText("BDT" + db.getHealthCost());
entcost.setText("BDT" + db.getEntertainmentCost());
otrcost.setText("BDT" + db.getOthersCost());
    
    }


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        foodlbl = new javax.swing.JLabel();
        foodcost = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        edulbl = new javax.swing.JLabel();
        educost = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        hltlbl = new javax.swing.JLabel();
        hltcost = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        enterlbl = new javax.swing.JLabel();
        entcost = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        otrlbl = new javax.swing.JLabel();
        otrcost = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        myincome = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        totalspent = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        availablebaget = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable1 = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        addexpense = new javax.swing.JButton();
        showallexpensesbtn = new javax.swing.JButton();
        searchexpensesbtn = new javax.swing.JButton();
        addincome = new javax.swing.JButton();
        allincome = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(235, 21, 203));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));

        jPanel3.setBackground(new java.awt.Color(254, 243, 235));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(194, 89, 21));
        jLabel1.setText("Food");

        foodlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        foodlbl.setForeground(new java.awt.Color(194, 89, 21));
        foodlbl.setText("0%");

        foodcost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        foodcost.setForeground(new java.awt.Color(102, 102, 102));
        foodcost.setText("BDT 0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(foodcost, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(foodcost)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(235, 243, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(29, 78, 216));
        jLabel2.setText("Education");

        edulbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edulbl.setForeground(new java.awt.Color(29, 78, 216));
        edulbl.setText("0 %");

        educost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        educost.setForeground(new java.awt.Color(102, 102, 102));
        educost.setText("BDT 0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edulbl, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(educost, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(edulbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(educost)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(230, 248, 237));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(21, 128, 61));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(21, 128, 61));
        jLabel3.setText("HealthCare");

        hltlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hltlbl.setForeground(new java.awt.Color(21, 128, 61));
        hltlbl.setText("0 %");

        hltcost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hltcost.setForeground(new java.awt.Color(102, 102, 102));
        hltcost.setText("BDT 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addComponent(hltlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(hltcost, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hltlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hltcost)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(243, 238, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(109, 40, 217));
        jLabel4.setText("Entertainment");

        enterlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enterlbl.setForeground(new java.awt.Color(109, 40, 217));
        enterlbl.setText("0%");

        entcost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        entcost.setForeground(new java.awt.Color(102, 102, 102));
        entcost.setText("BDT 0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entcost, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(entcost)
                .addGap(46, 46, 46))
        );

        jPanel5.setBackground(new java.awt.Color(248, 248, 195));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Others");

        otrlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        otrlbl.setText("0%");

        otrcost.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        otrcost.setForeground(new java.awt.Color(102, 102, 102));
        otrcost.setText("BDT 0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otrcost, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otrlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otrlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otrcost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText(" Total Income   :");

        myincome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        myincome.setText("BDT 0");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Total Expense :");

        totalspent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalspent.setText("BDT 0");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("  Balance           :");

        availablebaget.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        availablebaget.setText("BDT 0");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 255));
        jLabel26.setText("Summary");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel12)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalspent, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availablebaget, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myincome, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myincome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(totalspent, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(availablebaget))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));

        jtable1.setBackground(new java.awt.Color(243, 238, 255));
        jtable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Catagory", " Sub Category", "Cost", "Date", "Note"
            }
        ));
        jtable1.setRowHeight(28);
        jtable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jtable1AncestorRemoved(evt);
            }
        });
        jScrollPane1.setViewportView(jtable1);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 153, 51));
        jLabel27.setText("Recent Expenses (Last 7 Days): ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        addexpense.setBackground(new java.awt.Color(242, 242, 242));
        addexpense.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addexpense.setText("Add Expense");
        addexpense.addActionListener(this::addexpenseActionPerformed);

        showallexpensesbtn.setBackground(new java.awt.Color(242, 242, 242));
        showallexpensesbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        showallexpensesbtn.setText("Show Expenses");
        showallexpensesbtn.addActionListener(this::showallexpensesbtnActionPerformed);

        searchexpensesbtn.setBackground(new java.awt.Color(242, 242, 242));
        searchexpensesbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchexpensesbtn.setText("Search Expenses");
        searchexpensesbtn.addActionListener(this::searchexpensesbtnActionPerformed);

        addincome.setBackground(new java.awt.Color(242, 242, 242));
        addincome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addincome.setText("Add Income");
        addincome.addActionListener(this::addincomeActionPerformed);

        allincome.setBackground(new java.awt.Color(242, 242, 242));
        allincome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        allincome.setText("Show Income");
        allincome.addActionListener(this::allincomeActionPerformed);

        jTextField1.setBackground(new java.awt.Color(0, 0, 102));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("                                         Personal Expense Tracker");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchexpensesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addincome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(allincome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addexpense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(showallexpensesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(addexpense)
                        .addGap(18, 18, 18)
                        .addComponent(showallexpensesbtn)
                        .addGap(18, 18, 18)
                        .addComponent(searchexpensesbtn)
                        .addGap(18, 18, 18)
                        .addComponent(addincome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(allincome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtable1AncestorAdded
     
    }//GEN-LAST:event_jtable1AncestorAdded

    private void jtable1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtable1AncestorRemoved
 
    }//GEN-LAST:event_jtable1AncestorRemoved

    private void addexpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addexpenseActionPerformed
        
        addExpense addex =new  addExpense(db);
       
        addex.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_addexpenseActionPerformed

    private void showallexpensesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showallexpensesbtnActionPerformed
       all_Expenses_dash  e=new   all_Expenses_dash(db);
       e.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_showallexpensesbtnActionPerformed

    private void searchexpensesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchexpensesbtnActionPerformed
      serachExpenses s =  new serachExpenses (db);
       s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searchexpensesbtnActionPerformed

    private void addincomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addincomeActionPerformed
       add_income a=new add_income(db);
       a.setVisible(true);
       
       this.dispose();
    }//GEN-LAST:event_addincomeActionPerformed

    private void allincomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allincomeActionPerformed
        show_all_incomes a=new show_all_incomes(db);
       a.setVisible(true);
       
       this.dispose();
    }//GEN-LAST:event_allincomeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        db.generateCSV();
    }//GEN-LAST:event_formWindowClosing


   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addexpense;
    private javax.swing.JButton addincome;
    private javax.swing.JButton allincome;
    private javax.swing.JLabel availablebaget;
    private javax.swing.JLabel educost;
    private javax.swing.JLabel edulbl;
    private javax.swing.JLabel entcost;
    private javax.swing.JLabel enterlbl;
    private javax.swing.JLabel foodcost;
    private javax.swing.JLabel foodlbl;
    private javax.swing.JLabel hltcost;
    private javax.swing.JLabel hltlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable jtable1;
    private javax.swing.JLabel myincome;
    private javax.swing.JLabel otrcost;
    private javax.swing.JLabel otrlbl;
    private javax.swing.JButton searchexpensesbtn;
    private javax.swing.JButton showallexpensesbtn;
    private javax.swing.JLabel totalspent;
    // End of variables declaration//GEN-END:variables
}
