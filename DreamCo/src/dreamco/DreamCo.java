
package dreamco;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;


public class DreamCo {
    
;
    
 /////////////////////////////////////////////////////////////////////////////////////    This Class Serves as a tester class for now!   ////////////////////////////////////////
public static void main(String[] args) throws IOException {
    
    
    /////////////////////////////////////////// SET LOOK AND FEEL ////////////////////////////////////////////////////////////////////////////////
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

    SplashScreen.runSplashScreen();        
        
//    LoginFrame.runLoginFrame(); 
    //MyTree.startupAdminConfigFile();
   // System.out.println(MyTree.getIDCounter() );

  // AdminRegistrationFrame.runAdminRegistrationFrame();
//    MyTree.readFee();
//    System.out.println(MyTree.getFee());
   //  AdminFrame.runAdminFrame();
//     UserFrame.runUserFrame();

    
//    Scanner s=new Scanner(System.in);
//    System.out.println("enter name");
//    String name=s.nextLine();
//    String password=s.nextLine();
//    String parents =s.nextLine();
//    tree.add(name, password,parents);
    }

}
