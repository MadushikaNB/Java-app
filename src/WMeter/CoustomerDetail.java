/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WMeter;

import MyCode.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author MNB
 */
public class CoustomerDetail extends javax.swing.JInternalFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String item ="NIC Number";
   // ResultSetMetaData  rsmd = null;
    String acn;
    
    public CoustomerDetail() {
        initComponents();
        con= DBConnect.connect();
        tableload();
        
      //  SError SER = new SError();
        
    }
    
    public void tableload(){
        
        try{
        String q = "SELECT accountnumber,first_name,last_name,user_name,nic_number,mobile_number,address FROM customerdetail";
        pst = con.prepareStatement(q);
        
        //System.out.println(q.toString());
        rs = pst.executeQuery();
      //  rsmd = rs.getMetaData();
   //System.out.println("SELECT user_name FROM customerdetail");
  // int columnsNumber = rsmd.getColumnCount();
  // while (rs.next()) {
    //  for (int i = 1; i <= columnsNumber; i++) {
          // if (i > 1)
         //     
         //  System.out.print(",  ");
         // String columnValue = rs.getString(i);
          // System.out.print(columnValue + " " + rsmd.getColumnName(i));
     // }
     //  System.out.println("");
  // }
        
     
  
        jTableCD.setModel(DbUtils.resultSetToTableModel(rs));
//"SELECT accountnumber,first_name,last_name,user_name,nic_number,mobile_number,address FROM customerdetail";
       
                
                }
        catch(Exception e ){
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCD = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        Accnumber = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        UName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Mobinumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Uname = new javax.swing.JTextField();
        Nicnumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        Fname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setTitle("SATSM");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCD);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 530, 173));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 161, 37));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 161, 37));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 161, 33));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Mobile Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 110, 30));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Last Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 90, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 90, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("First Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 90, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Account Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 120, 30));

        jPanel1.setPreferredSize(new java.awt.Dimension(850, 400));
        jPanel1.setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NIC Number", "User Name" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(180, 20, 160, 30);

        Accnumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Accnumber.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(Accnumber);
        Accnumber.setBounds(690, 20, 150, 30);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(230, 130, 111, 33);

        UName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNameActionPerformed(evt);
            }
        });
        jPanel1.add(UName);
        UName.setBounds(30, 80, 309, 33);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Search By");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 120, 30);
        jPanel1.add(Mobinumber);
        Mobinumber.setBounds(670, 280, 150, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("User Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(570, 226, 90, 30);
        jPanel1.add(Uname);
        Uname.setBounds(670, 230, 150, 30);
        jPanel1.add(Nicnumber);
        Nicnumber.setBounds(670, 170, 150, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("NIC Number");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(570, 173, 90, 30);

        Address.setColumns(20);
        Address.setRows(5);
        jScrollPane2.setViewportView(Address);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(630, 330, 200, 60);

        Fname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(Fname);
        Fname.setBounds(670, 70, 150, 30);
        jPanel1.add(Lname);
        Lname.setBounds(670, 120, 150, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WMeter/99.jpg"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 870, 420);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 410));

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                tableload();
                clearField();
               
                
                
               
                 
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableCDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCDMouseClicked
        int r = jTableCD.getSelectedRow();
        String acn= jTableCD.getValueAt(r, 0).toString();
        String firstname = jTableCD.getValueAt(r, 1).toString();
        String lastname = jTableCD.getValueAt(r, 2).toString();
        String username =jTableCD.getValueAt(r, 3).toString();
        String nicnumber = jTableCD.getValueAt(r, 4).toString();
        String mobilenumber = jTableCD.getValueAt(r, 5).toString();
        String address = jTableCD.getValueAt(r, 6).toString();
       // System.out.println(acn);
        Fname.setText(firstname);
        Lname.setText(lastname);
        Uname.setText(username);
        Nicnumber.setText(nicnumber);
        Mobinumber.setText(mobilenumber);
        Address.setText(address); 
        Accnumber.setText(acn);
        
       /* try{
            String sql = "SELECT balance FROM wmeter WHERE accountnummber ="+acn+" ";
            pst = con.prepareStatement(sql);
            pst.executeQuery();
            
            System.out.println(sql);
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    
         */
        
    }//GEN-LAST:event_jTableCDMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
      int b = JOptionPane.showConfirmDialog(null,"DO you Really want to update");
     if(b==0){
        String acn = Accnumber.getText().toString() ;
        String firstname = Fname.getText();
        String lastname = Lname.getText();
        String username = Uname.getText();
        String nicnumber = Nicnumber.getText();
        String mobilenumber = Mobinumber.getText();
        String address =  Address.getText();
        
       String sql = "UPDATE customerdetail SET first_name='"+firstname+"',last_name ='"+lastname+"',user_name = '"+username+"',nic_number = '"+nicnumber+"',mobile_number = '"+mobilenumber+"',address = '"+address+"' where accountnumber = '"+acn+"'  ";
      /*  try{
            
        pst = con.prepareStatement(sql);
        pst.execute();
        tableload();
        
        }
        catch(Exception e ){
         System.out.print(e);
        }*/
     } 
     
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      try{
        
          
      
      }
      catch(Exception e){}
        
        int r = JOptionPane.showConfirmDialog(null,"Do you want to delete this");
        if (r==0){
            String acn = Accnumber.getText().toString();
            
            String sql = "DELETE from customerdetail where accountnumber ='"+acn+"'";
            try{
                pst = con.prepareStatement(sql);
                pst.execute();
                tableload();
                clearField();
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void UNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UNameActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        if(item.equals("NIC Number")){

            String user = UName.getText();

            String sql = "SELECT accountnumber,first_name,last_name, user_name,nic_number,mobile_number,address FROM customerdetail where nic_number LIKE '%"+user+"%'";

            try{
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                jTableCD.setModel(DbUtils.resultSetToTableModel(rs));

            }
            catch(Exception e){
                System.out.println("madu.....");
            }
        }

        else
        {
            String user = UName.getText();

            String sql = "SELECT accountnumber,first_name,last_name, user_name,nic_number,mobile_number,address FROM customerdetail where  user_name LIKE '%"+user+"%'";
            //System.out.println(sql);
            try{
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                jTableCD.setModel(DbUtils.resultSetToTableModel(rs));

            }
            catch(Exception e){

            }

        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        item = jComboBox1.getSelectedItem().toString();

    }//GEN-LAST:event_jComboBox1ActionPerformed
 public void clearField(){
        
        Fname.setText("");
        Lname.setText("");
        Uname.setText("");
        Nicnumber.setText("");
        Mobinumber.setText("");
        Address.setText(""); 
        Accnumber.setText("");
                
 
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Accnumber;
    private javax.swing.JTextArea Address;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private javax.swing.JTextField Mobinumber;
    private javax.swing.JTextField Nicnumber;
    private javax.swing.JTextField UName;
    private javax.swing.JTextField Uname;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCD;
    // End of variables declaration//GEN-END:variables
}
 //conn = (Connection) DriverManager.getConnection(host,username,password);
            // This will load the MySQL driver, each DB has its own driver
  //Class.forName("com.mysql.jdbc.Driver");
  // Setup the connection with the DB
//conn = (Connection) DriverManager.getConnection("jdbc:mysql://db4free.net:3306/water_meter?"+"user=madumnb&password=madumnb");
  // conn = (Connection) DriverManager.getConnection("jdbc:mysql://databases-auth.000webhost.com:3306/id489183_watermate"+"user=id489183_sandun&password=12345");
            //jdbc:mysql://localhost:3306/water_meter
            //root
  //++ conn = (Connection) DriverManager.getConnection("jdbc:mysql://192.248.12.7:3306/satsm_water_meter","satsm","satsm123");
    //conn = ConnectionHelper("satsm","satsm123","satsm_water_meter","192.248.12.7");
/*
 try {
         if(conn != null){
           conn.close();
           conn = null;
        }
    } catch (Exception ex) {
        System.err.println(ex.getMessage());
    }
 
 
 */