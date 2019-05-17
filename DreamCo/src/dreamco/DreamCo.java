
package dreamco;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;

//by JERRY <#

public class DreamCo {
    
 /////////////////////////////////////////////////////////////////////////////////////    This Class Serves as a tester class for now!   ////////////////////////////////////////
public static void main(String[] args) throws IOException {
    ///////////////////////////////////////////These are the OBJECTS to use OTHER classes in the package...............
    DataEncryptionFile objectDataFile = new DataEncryptionFile();
    MyTree tree= new MyTree();
    SplashScreen splashscreen= new SplashScreen();
    AdminFrame adminframe= new AdminFrame();
    
    System.out.println(tree.getFee());
    adminframe.changeRegistrationFee();
    System.out.println(tree.getFee());
//    splashscreen.startupSplashScreen();
    
    
//    Scanner s=new Scanner(System.in);
//    System.out.println("enter name");
//    String name=s.nextLine();
//    String password=s.nextLine();
//    String parents =s.nextLine();
//    tree.add(name, password,parents);
//  
//    LoginFrame login = new LoginFrame();
//    login.runLoginFrame();
    

    }

}
