
package dreamco;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


// BY JERRY <#
public class UserFrame extends javax.swing.JFrame {

    ////////////////////////////////////////////////////////////////////////Declaration of variables used in this class ////////////////////////////////////////
    private static String newfullname;
    private static String newpassword, confirmpassword;
    
    public UserFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(450, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 600));
        jPanel1.setLayout(null);

        jButton4.setVisible(false);
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(340, 460, 90, 32);

        jCheckBox1.setVisible(false);
        jCheckBox1.setBackground(new java.awt.Color(117, 230, 218));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Agree to terms and conditions");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(20, 460, 200, 30);

        jButton3.setBackground(new java.awt.Color(5, 68, 94));
        jButton3.setForeground(new java.awt.Color(255, 255, 204));
        jButton3.setText("Register a NEW CLIENT!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(90, 350, 280, 50);

        jButton1.setBackground(new java.awt.Color(24, 154, 180));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register User and get that bread!");
        jButton1.setVisible(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(90, 520, 280, 50);

        jLabel3.setFont(new java.awt.Font("Myriad Pro", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("userIDvariable");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 220, 170, 30);

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("userRevenueVariable");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 250, 220, 30);

        jTextField3.setVisible(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 310, 260, 40);

        jPasswordField1.setVisible(false);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(170, 410, 260, 40);

        jPasswordField2.setVisible(false);
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(170, 360, 260, 40);

        jLabel6.setVisible(false);
        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Full Name");
        jLabel6.setToolTipText("This will be your username when logging in");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 310, 150, 40);

        jLabel7.setVisible(false);
        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirm Password");
        jLabel7.setToolTipText("make sure your password is secure but easy to  remember as well!");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 410, 150, 40);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Myriad Pro", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Daily Message");
        Random r= new Random();
        int randomselector;
        randomselector=r.nextInt(4);
        switch (randomselector){
            case 0:
            jLabel8.setText("It's all about your perception! Build your empire now!");
            break;
            case 1:
            jLabel8.setText("register now for a special surprise <3");
            break;
            case 2:
            jLabel8.setText("Money money money, must be funny, in a rich man's world");
            break;
            case 3:
            jLabel8.setText("Bring me the money!");
            break;
            case 4:
            jLabel8.setText("Get more people into the mlm sca...did I say scam? I mean business...");
            break;
        }
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 120, 450, 30);

        jLabel9.setVisible(false);
        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("New Password");
        jLabel9.setToolTipText("make sure your password is secure but easy to  remember as well!");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 360, 150, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dreamco/UserFrameBackground.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 450, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        newfullname=jTextField3.getText();
        newpassword=jPasswordField1.getText();
        confirmpassword=jPasswordField2.getText();

        if(newfullname.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a valid username and password!", "  Registration Error!", JOptionPane.ERROR_MESSAGE);
        }
        if(newfullname.equals(newpassword)){
            JOptionPane.showMessageDialog(null, "Your name and password cannot match!", "  Registration Error!", JOptionPane.ERROR_MESSAGE);
        }
        if(newfullname.length()<8){
            JOptionPane.showMessageDialog(null, "Please enter your REAL name. I doubt your name is less than 8 characters!", "  Registration Error!", JOptionPane.ERROR_MESSAGE);
        }
        if(newpassword.length()<8){
            JOptionPane.showMessageDialog(null, "Please enter a password with a MINIMUM length of 8 characters!", "  Registration Error!", JOptionPane.ERROR_MESSAGE);
        }
        if(!newfullname.equals("") && newpassword.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a valid password!", "  Registration Error!", JOptionPane.ERROR_MESSAGE);
        }
        if(!newfullname.equals("") && !newpassword.equals(confirmpassword)){
            JOptionPane.showMessageDialog(null, "Passwords do not match!", "  Registration Error!", JOptionPane.ERROR_MESSAGE);
        }
        if(!newfullname.equals("") && newpassword.equals(confirmpassword) && newpassword.length()>8){               
            encryptNow(newfullname, newpassword);
            MyTree.setIDCounter(MyTree.getIDCounter()+1);
        
            try {
                updatePendingFile(newfullname, newpassword);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Pending File Not Found!", " System Error", JOptionPane.ERROR_MESSAGE);
            }
            newfullname="";
            newpassword="";
            confirmpassword="";
            jTextField3.setText("");
            jPasswordField1.setText("");
            jPasswordField2.setText("");
        
    
            JOptionPane.showMessageDialog(null, "Thank-you for registering. Your registration request is pending and will be approved by an admin in 2-3 business days.", "  Registration Request Sent", JOptionPane.INFORMATION_MESSAGE);
            jButton3.setVisible(true);
            jButton4.setVisible(false);
            jButton1.setVisible(false);
            jCheckBox1.setVisible(false);
            jPasswordField1.setVisible(false);
            jPasswordField2.setVisible(false);
            jTextField3.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel9.setVisible(false);
            jCheckBox1.setSelected(false);
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
        jButton1.setVisible(true);
        JOptionPane.showMessageDialog(null, "You agree to the collection of a one-off payment of RM50 to register as a member of DreamCo. A membership card will given upon registration.", "  Terms & Conditions", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        jButton1.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setVisible(false);
        jButton4.setVisible(true);
        jCheckBox1.setVisible(true);
        jPasswordField1.setVisible(true);
        jPasswordField2.setVisible(true);
        jTextField3.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jLabel9.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton3.setVisible(true);
        jButton4.setVisible(false);
        jButton1.setVisible(false);
        jCheckBox1.setVisible(false);
        jPasswordField1.setVisible(false);
        jPasswordField2.setVisible(false);
        jTextField3.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel9.setVisible(false);
        jCheckBox1.setSelected(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed


    ///////////////////////////////////////////////////////////////////////////////////////MAIN METHOD TO RUN THIS JFRAME /////////////////////////////////////////////
    public static void runUserFrame() {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFrame().setVisible(true);
            }
        });
    }
    
    //////////////////////////////////////////////////////////////////// Method for Encrypting the text upon input before parsing///////////////////////////////////////////
    private void encryptNow( String tempnewfullname, String tempnewpassword){
        newfullname="";
        newpassword="";
        int key=25;
        
        for(int i=0; i<tempnewfullname.length();i++){
            int a=tempnewfullname.charAt(i);
            if(Character.isUpperCase(a)){
                a=a+(key%26);
                if(a>'Z')
                     a=a-26;
        }
        else if(Character.isLowerCase(a)){
            a=a+(key%26);
            if(a>'z')
                a=a-26;
        }       
        newfullname=newfullname +(char) a;                
        }
        
        for(int i=0; i<tempnewpassword.length();i++){
            int a=tempnewpassword.charAt(i);
            if(Character.isUpperCase(a)){
                a=a+(key%26);
                if(a>'Z')
                     a=a-26;
        }
        else if(Character.isLowerCase(a)){
            a=a+(key%26);
            if(a>'z')
                a=a-26;
        }
        newpassword=newpassword+(char) a;
        }
        
    }
    
    
    /////////////////////////////////////////////////////////////////// Method to write encrypted string from registration to PENDING file //////////////////////////////
    public static void updatePendingFile(String name, String password) throws IOException{
        BufferedWriter bw=new BufferedWriter(new FileWriter(new File("Pending.txt"),true));
        bw.write(String.valueOf(MyTree.getIDCounter()));
        bw.write("\n"+ newpassword);
        bw.write("\n"+ MyTree.getIDCounter());        
        bw.write("\n" + newfullname);
        bw.write("\n" + String.valueOf(0)+"\n");
        bw.close();
    }
    


    
   
    
        
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private static javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
