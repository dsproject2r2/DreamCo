
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
    MyTree mytree= new MyTree();
    SplashScreen splashscreen= new SplashScreen();
    AdminFrame adminframe= new AdminFrame();
    UserFrame userframe= new UserFrame();
    

    adminframe.runAdminFrame();
//    userframe.runUserFrame();
//    splashscreen.startupSplashScreen();
    
//    Scanner s=new Scanner(System.in);
//    System.out.println("enter name");
//    String name=s.nextLine();
//    String password=s.nextLine();
//    String parents =s.nextLine();
//    tree.add(name, password,parents);
    }

}
