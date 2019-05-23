/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamco;

import static dreamco.UserFrame.updatePendingFile;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Jeremiah
 */
public class AdminRegistrationFrame extends javax.swing.JFrame  {

    private static DefaultListModel dlm1= new DefaultListModel();
    private static DefaultListModel dlm2= new DefaultListModel();    
    private static String newfullname;
    private static String newpassword, confirmpassword;
    private static ArrayList <String> idlist1 = new ArrayList<>(); 
    private static ArrayList <String> namelist1= new ArrayList<>();
    private static ArrayList <String> passwordlist1= new ArrayList<>();
    private static ArrayList <String> parentidlist1= new ArrayList<>();
    private static ArrayList <String> idlist2 = new ArrayList<>(); 
    private static ArrayList <String> namelist2= new ArrayList<>();
    private static ArrayList <String> passwordlist2= new ArrayList<>();
    private static ArrayList <String> parentidlist2= new ArrayList<>();
    private static ArrayList <String> moneylist2= new ArrayList<>();
    
 
    public AdminRegistrationFrame() {
        initComponents();
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namefield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        newpasswordfield = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        confirmpasswordfield = new javax.swing.JPasswordField();
        checkboxtc = new javax.swing.JCheckBox();
        cancelbutton = new javax.swing.JButton();
        registrationbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        addbutton1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(121, 194, 234));
        jPanel1.setLayout(null);

        namefield.setEnabled(true);
        namefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefieldActionPerformed(evt);
            }
        });
        jPanel1.add(namefield);
        namefield.setBounds(190, 40, 260, 40);

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Full Name");
        jLabel6.setToolTipText("This will be your username when logging in");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 40, 150, 40);

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("New Password");
        jLabel9.setToolTipText("make sure your password is secure but easy to  remember as well!");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 90, 150, 40);
        jPanel1.add(newpasswordfield);
        newpasswordfield.setBounds(190, 90, 260, 40);

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirm Password");
        jLabel7.setToolTipText("make sure your password is secure but easy to  remember as well!");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 140, 150, 40);
        jPanel1.add(confirmpasswordfield);
        confirmpasswordfield.setBounds(190, 140, 260, 40);

        checkboxtc.setBackground(new java.awt.Color(117, 230, 218));
        checkboxtc.setForeground(new java.awt.Color(255, 255, 255));
        checkboxtc.setText("Agree to terms and conditions");
        checkboxtc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxtcActionPerformed(evt);
            }
        });
        jPanel1.add(checkboxtc);
        checkboxtc.setBounds(40, 190, 200, 30);

        cancelbutton.setText("Cancel");
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelbutton);
        cancelbutton.setBounds(360, 190, 90, 32);

        registrationbutton.setBackground(new java.awt.Color(255, 255, 153));
        registrationbutton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        registrationbutton.setText("Register User!");
        registrationbutton.setVisible(false);
        registrationbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(registrationbutton);
        registrationbutton.setBounds(110, 250, 280, 50);

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 400, 290, 300);

        addbutton1.setText("Approve");
        addbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutton1ActionPerformed(evt);
            }
        });
        jPanel1.add(addbutton1);
        addbutton1.setBounds(30, 710, 90, 32);

        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 710, 90, 32);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(440, 400, 250, 300);

        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList2);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(800, 400, 290, 300);

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1000, 710, 90, 32);

        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(800, 710, 90, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1128, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefieldActionPerformed
 
    }//GEN-LAST:event_namefieldActionPerformed

    private void checkboxtcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxtcActionPerformed
        if(checkboxtc.isSelected()){
        registrationbutton.setVisible(true);
        JOptionPane.showMessageDialog(null, "You agree to the collection of a one-off payment of RM50 to register as a member of DreamCo. A membership card will given upon registration.", "  Terms & Conditions", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        registrationbutton.setVisible(false);
        }
    }//GEN-LAST:event_checkboxtcActionPerformed

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed

    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void registrationbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationbuttonActionPerformed
        int key=25;
        newfullname=namefield.getText();
        newpassword=newpasswordfield.getText();
        confirmpassword=confirmpasswordfield.getText();
        if(newfullname.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a valid username and password!", "  Registration Error!", JOptionPane.ERROR_MESSAGE);
        }
        else if(newfullname.equals(newpassword)){
            JOptionPane.showMessageDialog(null, "Your name and password cannot match!", "  Registration Error!", JOptionPane.ERROR_MESSAGE);
        }
        else if(newfullname.length()<8){
            JOptionPane.showMessageDialog(null, "Please enter your REAL name. I doubt your name is less than 8 characters!", "  Registration Error!", JOptionPane.ERROR_MESSAGE);
        }
        else if(newpassword.length()<8){
            JOptionPane.showMessageDialog(null, "Please enter a password with a MINIMUM length of 8 characters!", "  Registration Error!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!newfullname.equals("") && newpassword.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a valid password!", "  Registration Error!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!newfullname.equals("") && !newpassword.equals(confirmpassword)){
            JOptionPane.showMessageDialog(null, "Passwords do not match!", "  Registration Error!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!newfullname.equals("") && newpassword.equals(confirmpassword) && newpassword.length()>=8){               
        MyTree t = new MyTree();        
        t.addUser();   
        try {
         
            t.add(newfullname, newpassword, String.valueOf(0));
            t.appendUserClearFile();
        } catch (IOException ex) {
            Logger.getLogger(AdminRegistrationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Thank-you for registering. Welcome to DreamCo!", "  Registration Complete!", JOptionPane.PLAIN_MESSAGE);  
        newfullname="";
        newpassword="";
        confirmpassword="";
        namefield.setText("");
        newpasswordfield.setText("");
        confirmpasswordfield.setText("");
        }

    }//GEN-LAST:event_registrationbuttonActionPerformed
  ////////////////////////////////////////////////////////////////////////////////////////////// Method for Pending User selection ////////////////////////////////////////////
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
       
        System.out.println("namelist"+namelist1);
        System.out.println("idlist"+idlist1);
        System.out.println("password"+passwordlist1);
        System.out.println("parent"+parentidlist1);
        System.out.println("\n");
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton1.setEnabled(true);
        addbutton1.setEnabled(true);
        boolean checkselection = !jList2.isSelectionEmpty();
        if(checkselection){
            jList2.clearSelection();
        }
        
        
        String selected=jList1.getSelectedValue().toString();
        String parent="";
             
        for(int i=0; i<namelist1.size(); i++){
            if(selected.equals(namelist1.get(i))){
                for(int j=0; j<namelist1.size(); j++){
                    if(parentidlist1.get(i).equals(idlist1.get(j))){
                        parent=namelist1.get(j);
                    }
                }
                if(parent.equals("")){
                    parent="N/A";
                }
                jTextArea1.setText(" Full Name: "+jList1.getSelectedValue().toString()+ "\n\n UserID: dcuser"+idlist1.get(i)+ "\n\n Password: "+ passwordlist1.get(i)+"\n\n Product Referrer: "+parent);
                break;
            }
        }
    }//GEN-LAST:event_jList1MouseClicked
  
////////////////////////////////////////////////////////////////////////////////////////// Method for Registered user selection //////////////////////////////////////////////////
    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);              
        jButton1.setEnabled(false);
        addbutton1.setEnabled(false);
        
        boolean checkselection = !jList1.isSelectionEmpty();
        if(checkselection){
            jList1.clearSelection();
        }
        
        String selected=jList2.getSelectedValue().toString();
        String parent="";

        for(int i=0; i<namelist2.size(); i++){
            if(selected.equals(namelist2.get(i))){
                for(int j=0; j<namelist2.size(); j++){
                    if(parentidlist2.get(i).equals(idlist2.get(j))){
                        parent=namelist2.get(j);
                    }
                }
                if(parent.equals("")){
                    parent="( N/A - ADMIN )";
                }
                jTextArea1.setText(" Full Name: "+jList2.getSelectedValue().toString()+ "\n\n UserID: dcuser"+idlist2.get(i)+ "\n\n Password: "+ passwordlist2.get(i)+"\n\n Product Referrer: "+parent+"\n\n Total Revenue Generated: RM"+moneylist2.get(i));
                break;
            }
        }
    }//GEN-LAST:event_jList2MouseClicked

    /////////////////////////////////////////////////////////////////////////////////////  NI UTK BUTTON APPROVE PENDING USERS - HELLO RAIHAN KAT SINI! ////////////////////////////
    private void addbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutton1ActionPerformed
        String selected=jList1.getSelectedValue().toString();
        String parent="";
             
        for(int i=0; i<namelist1.size(); i++){
            if(selected.equals(namelist1.get(i))){
                for(int j=0; j<namelist2.size(); j++){
                    if(parentidlist1.get(i).equals(idlist2.get(j))){
                        parent=namelist2.get(j);
                    }
                }
                if(parent.equals("")){
                    parent="N/A";
                }
                //System.out.println(parentidlist1.get(i));
                MyTree t = new MyTree();
                t.addUser();
                t.add(namelist1.get(i), passwordlist1.get(i), parentidlist1.get(i));
                System.out.println("pasdafw patents:  " + parentidlist1.get(i) + " qwd    " + parent);
                try {
                    t.appendUserClearFile();
                } catch (IOException ex) {
                    Logger.getLogger(AdminRegistrationFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

                dlm1.removeElement(selected); 
                break;
            }
        }
    }//GEN-LAST:event_addbutton1ActionPerformed
  
    
/////////////////////////////////////////////////////////////////////// REMOVE USER FROM PENDING LIST /////////////////////////////////////////////////////
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String selected=jList1.getSelectedValue().toString();
        String parent="";

        System.out.println("namelist"+namelist1);
        System.out.println("idlist"+idlist1);
        System.out.println("password"+passwordlist1);
        System.out.println("parent"+parentidlist1);
                
        for(int i=0; i<namelist1.size(); i++){
            if(selected.equals(namelist1.get(i))){
                for(int j=0; j<namelist2.size(); j++){
                    if(parentidlist1.get(i).equals(idlist2.get(j))){
                        parent=namelist2.get(j);
                    }
                }
                if(parent.equals("")){
                    parent="N/A";
                }
                
                idlist1.remove(i);
                passwordlist1.remove(i);
                parentidlist1.remove(i);
                namelist1.remove(i);
                
                try{
                    System.out.println("jhgjhghjgjgjhgjh");
                    PrintWriter pw = new PrintWriter(new FileWriter("Pending.txt"));
                    for(int a=0; a<namelist1.size(); a++){
                        pw.print(idlist1.get(a));
                        pw.print("\n"+passwordlist1.get(a));
                        pw.print("\n"+parentidlist1.get(a));
                        pw.print("\n"+namelist1.get(a));
                        pw.print("\n"+String.valueOf("0")+"\n");
                    }
                    pw.flush();
                    pw.close();
                }
                catch(IOException e){
                    JOptionPane.showMessageDialog(null, "System File Not Found", "System File Error! ", JOptionPane.ERROR_MESSAGE);
                }

                dlm1.removeElement(selected); 
                break;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String selected=jList2.getSelectedValue().toString();
        String userid="";
             
        for(int i=0; i<namelist2.size(); i++){
            if(selected.equals(namelist2.get(i))){
                userid=idlist2.get(i);
                dlm2.removeElement(selected); 
                break;
            }
        }
       MyTree t = new MyTree();
                t.addUser();
        try {
            t.remove(userid);
            t.appendUserClearFile();
        } catch (IOException ex) {
            Logger.getLogger(AdminRegistrationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            
    String selected=jList2.getSelectedValue().toString();
    String parent="";
             
        for(int i=0; i<namelist2.size(); i++){
            if(selected.equals(namelist2.get(i))){
                for(int j=0; j<namelist2.size(); j++){
                    if(parentidlist2.get(i).equals(idlist2.get(j))){
                        parent=namelist2.get(j);
                    }
                }
                if(parent.equals("")){
                    parent="N/A";
                }
                System.out.println("hahahaha: " + idlist2.get(i));
                UpdateUser updateuser= new UpdateUser(idlist2.get(i));
                updateuser.runUpdateUser();
                break;
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    
    /////////////////////////////////////////////////////////////////// MAIN RUNNING METHOD FOR THE FRAME  ///////////////////////////////////////////////////
    public void runAdminRegistrationFrame() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminRegistrationFrame adminregistrationframe = new AdminRegistrationFrame();
                adminregistrationframe.setVisible(true);
                jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                jList2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                getPendingNameList();
                getDreamCoNameList();
                adminregistrationframe.addWindowListener( new WindowAdapter()
                {
                 public void windowClosing(WindowEvent e)
                {
                        AdminRegistrationFrame frame = (AdminRegistrationFrame)e.getSource();
 
//                     int result = JOptionPane.showConfirmDialog(
//                    frame,
//                    "Are you sure you want to exit the application?",
//                    "Exit Application",
//                    JOptionPane.YES_NO_OPTION);
// 
//                    if (result == JOptionPane.YES_OPTION)
                    idlist1.clear();
                    namelist1.clear();
                    passwordlist1.clear();
                    parentidlist1.clear();
                    idlist2.clear();
                    namelist2.clear();
                    passwordlist2.clear();
                    parentidlist2.clear();
                    moneylist2.clear();
                    dlm2.removeAllElements();
                    
                    adminregistrationframe.setDefaultCloseOperation(AdminRegistrationFrame.DISPOSE_ON_CLOSE);
                }
            });
            }
        });
    }
    
    
    ///////////////////////////////////////////////////// Method to write encrypted string from registration to PENDING file for registration //////////////////////////////USELESS???
    public static void updateUserFile(String name, String password) throws IOException{
        BufferedWriter bw=new BufferedWriter(new FileWriter(new File("Userdata.txt"),true));
        bw.write(String.valueOf(MyTree.getIDCounter()));
        bw.write("\n"+ newpassword);
        bw.write("\n"+ String.valueOf(0));        
        bw.write("\n" + newfullname);
        bw.write("\n" + String.valueOf(0));
        bw.close();
    }
    
    
    ///////////////////////////////////////////////////////////// Method ArrayList to get PENDING namelist      //////////////////////////////////////
    public static void getPendingNameList(){  
        try{
            Scanner s= new Scanner(new FileReader("Pending.txt"));        
            while(s.hasNextLine()){
                idlist1.add(s.nextLine());
                passwordlist1.add(s.nextLine());                
                parentidlist1.add(s.nextLine());
                namelist1.add(s.nextLine());     
                s.nextLine();
            } 
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null, "User Files Not Found! ", "  System File Error!",  JOptionPane.ERROR_MESSAGE);
        }     
            jList1.setModel(dlm1);
            
            for(int i=0; i<namelist1.size(); i++){
                dlm1.addElement(namelist1.get(i));            
            }
    }
    ////////////////////////////////////////////////////////////// Method ArrayList to get DREAMCO USERDATA namelist      //////////////////////////////
    public static void getDreamCoNameList(){  
        try{
            Scanner s= new Scanner(new FileReader("Userdata.txt"));        
            while(s.hasNextLine()){
                idlist2.add(s.nextLine());
                passwordlist2.add(s.nextLine());                
                parentidlist2.add(s.nextLine());
                namelist2.add(s.nextLine());     
                moneylist2.add(s.nextLine());
            } 
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null, "User Files Not Found! ", "  System File Error!",  JOptionPane.ERROR_MESSAGE);
        }     
            jList2.setModel(dlm2);
            
            for(int i=0; i<namelist2.size(); i++){
                dlm2.addElement(namelist2.get(i));            
            }
    }
    

    

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton1;
    private javax.swing.JButton cancelbutton;
    private javax.swing.JCheckBox checkboxtc;
    private javax.swing.JPasswordField confirmpasswordfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JList<String> jList1;
    private static javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField namefield;
    private javax.swing.JPasswordField newpasswordfield;
    private javax.swing.JButton registrationbutton;
    // End of variables declaration//GEN-END:variables
}
