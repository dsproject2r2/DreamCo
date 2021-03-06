
package dreamco;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class LoginFrame extends javax.swing.JFrame {
    
    //To instantiate the LoginFrame
    private String adminuserinput;
    private String adminpassinput;
    private String name;
    
    public LoginFrame() {
        initComponents();
    }
    
    public static LoginFrame lf= new LoginFrame();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(31, 97, 147));
        jPanel2.setForeground(new java.awt.Color(31, 97, 147));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login Authentication");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 50, 460, 19);

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User ID");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(15, 101, 60, 19);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Dream Corporation! ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(6, 17, 467, 32);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jLabel4.setToolTipText("");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(15, 158, 77, 19);

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
        jButton1.setBounds(190, 200, 117, 32);

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
        encryptCheck(adminpassinput,adminuserinput);
        /////////////////////////////////////////to read user data from file/////////////////////////////////////
        String userid="";
        String password ="";
        String money="";
        try{
            Scanner s = new Scanner(new FileReader("Userdata.txt"));
            while (s.hasNextLine()) {
                userid = s.nextLine();
                password = s.nextLine();
                s.nextLine();
                name = s.nextLine();
                money = s.nextLine();
                if(password.equals(adminpassinput) && ("cbtrdq" +userid).equals(adminuserinput)){
                    break;
                } 
            }            
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Program File Not Found!", " System Error", JOptionPane.ERROR_MESSAGE);
        }
        decryptName(name);
        /////////////////////////////////////////////////**********************/////////////////////////////////////////////////
        if(adminuserinput.equals(MyTree.getAdminID()) && adminpassinput.equals(MyTree.getAdminPass())){
            AdminFrame af= new AdminFrame();
            af.runAdminFrame();
            lf.dispose();
            DataEncryptionFile.userdataDecryption();
            DataEncryptionFile.pendingDecryption();
            DataEncryptionFile.metadataDecryption();
            
            JOptionPane.showMessageDialog(null, "Welcome back Sir Admin of the DreamCo Scam!", "  DreamCo Says...", JOptionPane.INFORMATION_MESSAGE);            
        }
        else if(adminuserinput.equals("cbtrdq"+userid) && adminpassinput.equals(password)){
            JOptionPane.showMessageDialog(null, "Welcome back "+ name, "  DreamCo Says...", JOptionPane.INFORMATION_MESSAGE);
            UserFrame user = new UserFrame(userid,money);
            lf.dispose();
            user.runUserFrame();
        }
        else if(adminuserinput.equals("") && adminpassinput.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your username and password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid username or password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
        }      
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
        
///////////////////////////////////////////////////////////////////////////////////// Algorithm to check for admin //////////////////////////////////////////
        adminuserinput=jTextField1.getText();
        adminpassinput=jPasswordField1.getText();
        encryptCheck(adminpassinput,adminuserinput);
        /////////////////////////////////////////to read user data from file/////////////////////////////////////
        String userid="";
        String password ="";
        String money="";
        try{
            Scanner s = new Scanner(new FileReader("Userdata.txt"));
            while (s.hasNextLine()) {
                userid = s.nextLine();
                password = s.nextLine();
                s.nextLine();
                name = s.nextLine();
                money = s.nextLine();
                if(password.equals(adminpassinput) && ("cbtrdq" +userid).equals(adminuserinput)){
                    break;
                } 
            }            
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Program File Not Found!", " System Error", JOptionPane.ERROR_MESSAGE);
        }
        decryptName(name);
        /////////////////////////////////////////////////**********************/////////////////////////////////////////////////
        if(adminuserinput.equals(MyTree.getAdminID()) && adminpassinput.equals(MyTree.getAdminPass())){
            AdminFrame af= new AdminFrame();
            af.runAdminFrame();
            lf.dispose();
            DataEncryptionFile.userdataDecryption();
            DataEncryptionFile.pendingDecryption();
            DataEncryptionFile.metadataDecryption();
            
            JOptionPane.showMessageDialog(null, "Welcome back Sir Admin of the DreamCo Scam!", "  DreamCo Says...", JOptionPane.INFORMATION_MESSAGE);            
        }
        else if(adminuserinput.equals("cbtrdq"+userid) && adminpassinput.equals(password)){
            JOptionPane.showMessageDialog(null, "Welcome back "+ name, "  DreamCo Says...", JOptionPane.INFORMATION_MESSAGE);
            UserFrame user = new UserFrame(userid,money);
            lf.dispose();
            user.runUserFrame();
        }
        else if(adminuserinput.equals("") && adminpassinput.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your username and password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid username or password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
        }     
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
        
///////////////////////////////////////////////////////////////////////////////////// Algorithm to check for admin //////////////////////////////////////////
        adminuserinput=jTextField1.getText();
        adminpassinput=jPasswordField1.getText();
        encryptCheck(adminpassinput,adminuserinput);
        /////////////////////////////////////////to read user data from file/////////////////////////////////////
        String userid="";
        String password ="";
        String money="";
        try{
            Scanner s = new Scanner(new FileReader("Userdata.txt"));
            while (s.hasNextLine()) {
                userid = s.nextLine();
                password = s.nextLine();
                s.nextLine();
                name = s.nextLine();
                money = s.nextLine();
                if(password.equals(adminpassinput) && ("cbtrdq" +userid).equals(adminuserinput)){
                    break;
                } 
            }            
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Program File Not Found!", " System Error", JOptionPane.ERROR_MESSAGE);
        }
        decryptName(name);
        /////////////////////////////////////////////////**********************/////////////////////////////////////////////////
        if(adminuserinput.equals(MyTree.getAdminID()) && adminpassinput.equals(MyTree.getAdminPass())){
            AdminFrame af= new AdminFrame();
            af.runAdminFrame();
            lf.dispose();
            DataEncryptionFile.userdataDecryption();
            DataEncryptionFile.pendingDecryption();
            DataEncryptionFile.metadataDecryption();
            
            JOptionPane.showMessageDialog(null, "Welcome back Sir Admin of the DreamCo Scam!", "  DreamCo Says...", JOptionPane.INFORMATION_MESSAGE);            
        }
        else if(adminuserinput.equals("cbtrdq"+userid) && adminpassinput.equals(password)){
            JOptionPane.showMessageDialog(null, "Welcome back "+ name, "  DreamCo Says...", JOptionPane.INFORMATION_MESSAGE);
            UserFrame user = new UserFrame(userid,money);
            lf.dispose();
            user.runUserFrame();
        }
        else if(adminuserinput.equals("") && adminpassinput.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your username and password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid username or password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
        }     
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
        
///////////////////////////////////////////////////////////////////////////////////// Algorithm to check for admin //////////////////////////////////////////
        adminuserinput=jTextField1.getText();
        adminpassinput=jPasswordField1.getText();
        encryptCheck(adminpassinput,adminuserinput);
        /////////////////////////////////////////to read user data from file/////////////////////////////////////
        String userid="";
        String password ="";
        String money="";
        try{
            Scanner s = new Scanner(new FileReader("Userdata.txt"));
            while (s.hasNextLine()) {
                userid = s.nextLine();
                password = s.nextLine();
                s.nextLine();
                name = s.nextLine();
                money = s.nextLine();
                if(password.equals(adminpassinput) && ("cbtrdq" +userid).equals(adminuserinput)){
                    break;
                } 
            }            
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Program File Not Found!", " System Error", JOptionPane.ERROR_MESSAGE);
        }
        decryptName(name);
        /////////////////////////////////////////////////**********************/////////////////////////////////////////////////
        if(adminuserinput.equals(MyTree.getAdminID()) && adminpassinput.equals(MyTree.getAdminPass())){
            AdminFrame af= new AdminFrame();
            af.runAdminFrame();
            lf.dispose();
            DataEncryptionFile.userdataDecryption();
            DataEncryptionFile.pendingDecryption();
            DataEncryptionFile.metadataDecryption();
            
            JOptionPane.showMessageDialog(null, "Welcome back Sir Admin of the DreamCo Scam!", "  DreamCo Says...", JOptionPane.INFORMATION_MESSAGE);            
        }
        else if(adminuserinput.equals("cbtrdq"+userid) && adminpassinput.equals(password)){
            JOptionPane.showMessageDialog(null, "Welcome back "+ name, "  DreamCo Says...", JOptionPane.INFORMATION_MESSAGE);
            UserFrame user = new UserFrame(userid,money);
            lf.dispose();
            user.runUserFrame();
        }
        else if(adminuserinput.equals("") && adminpassinput.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your username and password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid username or password!", "  Invalid Login Credentials!", JOptionPane.ERROR_MESSAGE);
        }     
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    /////////////////////////////////////////////////////////// CALL THIS METHOD TO RUN THE LOGIN FRAME //////////////////////////////////////////////
    public void runLoginFrame() {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                lf.setVisible(true);
                lf.setResizable(false);
            }
        });
    }
    
    ///////////////////////////////////////////////////////////Method to encrypt entered password to match in userdata file //////////////////////////////////
    private void encryptCheck( String tempadminpassinput, String tempadminuserinput){
        adminuserinput="";
        adminpassinput="";
        int key=25;
        
        for(int i=0; i<tempadminpassinput.length();i++){
            int a=tempadminpassinput.charAt(i);
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
        adminpassinput=adminpassinput +(char) a;                
        }
        
        for(int i=0; i<tempadminuserinput.length();i++){
            int a=tempadminuserinput.charAt(i);
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
        adminuserinput=adminuserinput +(char) a;                
        }
    }
    
    private void decryptName(String encryptedname){
        name="";
        int key=25;
        for(int i=0; i<encryptedname.length();i++){
            int a=encryptedname.charAt(i);
            if(Character.isUpperCase(a)){
                a=a-(key%26);
                if(a<'A')
                     a=a+26;
        }
        else if(Character.isLowerCase(a)){
            a=a-(key%26);
            if(a<'a')
                a=a+26;
        }
        name=name+(char) a;
        }        
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
