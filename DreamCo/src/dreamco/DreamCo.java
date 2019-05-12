
package dreamco;

import java.io.IOException;
import javax.swing.JFrame;

//by JERRY <#

public class DreamCo {
    
 /////////////////////////////////////////////////////////////////////////////////////    This Class Serves as a tester class for now!   ////////////////////////////////////////
public static void main(String[] args) throws IOException {
    ///////////////////////////////////////////These are the objects to use other classes in the package...............
    DataEncryptionFile objectDataFile = new DataEncryptionFile();
    Gui startupGui= new Gui();
    SplashScreen splash=new SplashScreen();
    Log login=new Log();

    login.runLoginFrame();
    
    

    }

}
