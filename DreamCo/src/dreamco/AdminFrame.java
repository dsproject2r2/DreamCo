
package dreamco;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import javax.swing.JOptionPane;





public class AdminFrame extends javax.swing.JFrame {
   

    
    public AdminFrame() {
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
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 450, 600));
        setPreferredSize(new java.awt.Dimension(450, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(450, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 160, 110, 40);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("View DreamCo Company Tree");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(60, 350, 330, 50);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Change Registration Fee");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(60, 420, 330, 50);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("View DreamCo Financials");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(60, 210, 330, 50);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText(" Client Registration and Information");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(60, 280, 330, 50);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setText("Change Commission Percentage");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(60, 490, 330, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dreamco/DC.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(450, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(450, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(450, 600));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(468, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    MyTree k =  new MyTree();
        k.displayGraph();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String fee= JOptionPane.showInputDialog(null,"Enter new registration fee", "New Registration Fee", JOptionPane.INFORMATION_MESSAGE);
        if(fee!=null){
            MyTree.setFee(Double.parseDouble(fee));
            MyTree.updateAdminConfigFile();
            JOptionPane.showMessageDialog(null, "New Registration Fee of RM"+ MyTree.getFee()+ " has been set!" , " SCAM SUCCESS!", JOptionPane.PLAIN_MESSAGE); 
        }
        else{
            MyTree.setFee(MyTree.getFee());
        }               
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MyTree tree =  new MyTree();
        tree.addUser();
        double adminMoney = tree.root.money;
        double[] levelrevenue = tree.gettotalLevel();
            
        StringBuilder sb = new StringBuilder();
            
        for (int i = 0; i < levelrevenue.length; i++) {
        sb.append("Level: " + i +" = RM" + levelrevenue[i] + "\n");
        }
        JOptionPane.showMessageDialog(null, "Admin Revenue: RM" + String.valueOf(adminMoney) +"\n\n" +sb.toString(), " DreamCo Revenue", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AdminRegistrationFrame ar= new AdminRegistrationFrame();
        ar.runAdminRegistrationFrame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    CommissionFrame commissionframe= new CommissionFrame();
    commissionframe.runCommissionFrame();
    }//GEN-LAST:event_jButton6ActionPerformed

    ////////////////////////////////////////////////////////////////////////////////////////////////MAIN METHOD TO RUN THIS CLASS JFRAME ////////////////////////
    public void runAdminFrame() {

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {        
                AdminFrame adminframe= new AdminFrame();   
                adminframe.setVisible(true);
                adminframe.setSize(455,635);
                adminframe.addWindowListener( new WindowAdapter()
                {
                 public void windowClosing(WindowEvent e)
                {
                        AdminFrame frame = (AdminFrame)e.getSource();
 
                     int result = JOptionPane.showConfirmDialog(
                    frame,
                    "Are you sure you want to exit the application?",
                    "Exit Application",
                    JOptionPane.YES_NO_OPTION);
 
                    if (result == JOptionPane.YES_OPTION)
                    DataEncryptionFile.userdataEncryption();
                    DataEncryptionFile.pendingEncryption();
                    DataEncryptionFile.metadataEncryption();
                    adminframe.setDefaultCloseOperation(AdminFrame.EXIT_ON_CLOSE);
                }
            });
                adminframe.setVisible( true );
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables







}
