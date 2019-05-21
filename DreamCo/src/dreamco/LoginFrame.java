
package dreamco;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {
    
    //To instantiate the LoginFrame
    private static LoginFrame lf=new LoginFrame();
    private String adminuserinput;
    private String adminpassinput;
    
    public LoginFrame() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login Authentication");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 50, 460, 19);

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("UserID");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(15, 101, 52, 19);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Dream Corporation! ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(6, 17, 467, 32);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Password");
        jLabel4.setToolTipText("");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(15, 158, 77, 19);

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Sign In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(190, 200, 117, 25);

        jTextField1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(111, 92, 338, 39);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(111, 149, 338, 39);

        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 520, 270);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(497, 292));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed

    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
///////////////////////////////////////////////////////////////////////////////////// Algorithm to check for admin //////////////////////////////////////////
        adminuserinput=jTextField1.getText();
        adminpassinput=jPasswordField1.getText();
        
        /////////////////////////////////////////to read user data from file/////////////////////////////////////
        String username="";
        int userid;
        String password = "-";
        String name="";
        String userMoney="";
        try{
            Scanner scan = new Scanner(new FileInputStream("Userdata.txt"));
            while (scan.hasNextLine()) {
                username = scan.nextLine();
                password = scan.nextLine();
                System.out.println("user: " + username);
                System.out.println("pass: "+ password);
                
                scan.nextLine();
                name =scan.nextLine();
                userMoney = scan.nextLine();
                if(password.equals(adminpassinput) && username.equals(adminuserinput))
                    break;
            }
            
        }catch(FileNotFoundException e){
            System.out.println("Error: "+e);
        } 
        /////////////////////////////////////////////////**********************/////////////////////////////////////////////////
        if(adminuserinput.equals("admin") && adminpassinput.equals("123")){
            AdminFrame.runAdminFrame();
            lf.dispose();
            JOptionPane.showMessageDialog(null, "Welcome back Sir Admin of the DreamCo Scam!", "  DreamCo Says...", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(adminuserinput.equals(username) && adminpassinput.equals(password)){
            JOptionPane.showMessageDialog(null, "Welcome back "+ name, "  DreamCo Says...", JOptionPane.ERROR_MESSAGE);
            System.out.println("YESS NI USER FRAME"); 
            UserFrame f = new UserFrame(adminuserinput, userMoney);
            f.runUserFrame();
            
            
        }
        else if(adminuserinput.equals("") && adminpassinput.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your username and password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
        }
        else if(adminuserinput.equals("admin") && !adminpassinput.equals("123")){
            JOptionPane.showMessageDialog(null, "Invalid Password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!adminuserinput.equals("admin") && !adminpassinput.equals("123")){
            JOptionPane.showMessageDialog(null, "Invalid username or password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
            adminuserinput=jTextField1.getText();
            adminpassinput=jPasswordField1.getText();
        
            if(adminuserinput.equals("admin") && adminpassinput.equals("123")){
                AdminFrame.runAdminFrame();
                lf.dispose();
                JOptionPane.showMessageDialog(null, "Welcome back Sir Admin of the DreamCo Scam!", "  DreamCo Says...", JOptionPane.INFORMATION_MESSAGE);
            }
            if(adminuserinput.equals("admin") && !adminpassinput.equals("123")){
                JOptionPane.showMessageDialog(null, "Invalid Password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
            }
            if(!adminuserinput.equals("admin") && !adminpassinput.equals("123")){
                JOptionPane.showMessageDialog(null, "Invalid username or password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
            }    
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
            adminuserinput=jTextField1.getText();
            adminpassinput=jPasswordField1.getText();

        
            if(adminuserinput.equals("admin") && adminpassinput.equals("123")){
                AdminFrame.runAdminFrame();
                lf.dispose();
                JOptionPane.showMessageDialog(null, "Welcome back Sir Admin of the DreamCo Scam!", "  DreamCo Says...", JOptionPane.INFORMATION_MESSAGE);
            }
            if(adminuserinput.equals("admin") && !adminpassinput.equals("123")){
                JOptionPane.showMessageDialog(null, "Invalid Password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
            }
            if(!adminuserinput.equals("admin") && !adminpassinput.equals("123")){
                JOptionPane.showMessageDialog(null, "Invalid username or password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
            }    
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
            adminuserinput=jTextField1.getText();
            adminpassinput=jPasswordField1.getText();

        
            if(adminuserinput.equals("admin") && adminpassinput.equals("123")){
                AdminFrame.runAdminFrame();
                lf.dispose();
                JOptionPane.showMessageDialog(null, "Welcome back Sir Admin of the DreamCo Scam!", "  DreamCo Says...", JOptionPane.INFORMATION_MESSAGE);
            }
            if(adminuserinput.equals("admin") && !adminpassinput.equals("123")){
                JOptionPane.showMessageDialog(null, "Invalid Password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
            }
            if(!adminuserinput.equals("admin") && !adminpassinput.equals("123")){
                JOptionPane.showMessageDialog(null, "Invalid username or password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
            }    
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    
    
    
    
    /////////////////////////////////////////////////////////// CALL THIS METHOD TO RUN THE LOGIN FRAME //////////////////////////////////////////////
    public static void runLoginFrame() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                lf.setVisible(true);
                lf.setResizable(false);
            }
        });
    }
    
    
    ///////////////////////////////////////////////////////////  METHOD TO LOOP THROUGH THE TEXT FILE TO LOOK FOR USER ID /////////////////////////////
    private void userFileReader(){
        try{
        Scanner s= new Scanner(new FileReader("Userdata.txt"));
        while(s.hasNext()){
            
        }
        
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Userdata File Not Found!", "File Not Found Error!", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
