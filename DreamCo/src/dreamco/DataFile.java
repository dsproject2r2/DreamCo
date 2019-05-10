
package dreamco;

//THIS CLASS CONTAINS THE METHODS TO READ AND ALTER THE NAME FILE 

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;


public class DataFile {

private static Formatter x;
String tempstring; 
static String encryptedtxt="";


public static void openFile(){
    try{
        x=new Formatter ("Userdata.txt");
    }
    catch (Exception e){
        System.out.println("FILE NOT FOUND");
    }
}
    
public static void writeToFile(){
    x.format("%s", encryptedtxt);
}

public static void closeFile(){
        x.close();
    }



public static void fileEncryption() throws IOException{
    BufferedReader bufferedreader = new BufferedReader(new FileReader("Userdata.txt"));
    StringBuffer br = new StringBuffer();
    String line = null;
    
    while((line =bufferedreader.readLine())!=null){
    br.append(line).append("\n");
    }
////////////////////////////////////////////////////////////////////////////////////////////////////// ENCRYPTION ALGORITHM ////////////////////////////////////////////////
    int key=25;

    for(int i=0; i<br.length();i++){
        int a=br.charAt(i);
        a=a+(key%2);
        encryptedtxt=encryptedtxt+(char) a;
    }
    
    openFile();
    writeToFile();
    closeFile();
    
    System.out.println(encryptedtxt);
}


public static void fileDecryption() throws FileNotFoundException, IOException{
    BufferedReader bufferedreader = new BufferedReader(new FileReader("Userdata.txt"));
    StringBuffer br = new StringBuffer();
    String line = null;
    
    while((line =bufferedreader.readLine())!=null){
    br.append(line).append("\n");
    }
////////////////////////////////////////////////////////////////////////////////////////////////////// DECRYPTION ALGORITHM //////////////////////////////////////////////
    int key=25;

    for(int i=0; i<br.length();i++){
        int a=br.charAt(i);
        a=a-(key%2);
        encryptedtxt=encryptedtxt+(char) a;
    }
    
    openFile();
    writeToFile();
    closeFile();
    
    System.out.println(encryptedtxt);
}




}
