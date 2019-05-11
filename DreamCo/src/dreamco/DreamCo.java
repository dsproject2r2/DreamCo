
package dreamco;

import java.io.IOException;

public class DreamCo {

 /////////////////////////////////////////////////////////////////////////////////////This Class Serves as a tester class for now!   
public static void main(String[] args) throws IOException {
    DataEncryptionFile objectDataFile = new DataEncryptionFile();
        
    DataEncryptionFile.fileEncryption();
    DataEncryptionFile.fileDecryption();
    DataEncryptionFile.appendFile();    
    }

}
