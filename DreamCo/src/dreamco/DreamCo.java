
package dreamco;

import java.io.IOException;
import javax.swing.JFrame;

public class DreamCo {

 /////////////////////////////////////////////////////////////////////////////////////    This Class Serves as a tester class for now!   ////////////////////////////////////////
public static void main(String[] args) throws IOException {
    //////////////////////////////////////////////////////////////////These are the objects to use other classes in the package...............
    DataEncryptionFile objectDataFile = new DataEncryptionFile();
    Gui startupGui= new Gui();
    
    //programGui.dialogBox();    
    startupGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    startupGui.setSize(400,700);
    startupGui.setLocationRelativeTo(null);
    startupGui.setVisible(true);
    }

}
