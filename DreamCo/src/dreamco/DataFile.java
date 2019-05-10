
package dreamco;

//THIS CLASS CONTAINS THE METHODS TO READ AND ALTER THE NAME FILE 

import java.io.BufferedReader;
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
    
}

public static void closeFile(){
        x.close();
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////ENCRYPTION ALGORITHM//////////////////////////////////////////////////////
public static void fileEncryption() throws IOException{
    BufferedReader bufferedreader = new BufferedReader(new FileReader("Userdata.txt"));
    StringBuffer br = new StringBuffer();
    String line = null;
    int key=25;
    
    while((line =bufferedreader.readLine())!=null){
         br.append(line).append("\n");
    }
                  
    for(int i=0; i<br.length();i++){
        int a=br.charAt(i);
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
        encryptedtxt=encryptedtxt+(char) a;
    }
    
    openFile();
    x.format(encryptedtxt);
    closeFile();
    
    System.out.print(encryptedtxt);
}


///////////////////////////////////////////////////////////////////////////////////////////////////////DECRYPTION ALGORITHM ///////////////////////////////////////////////////////
public static void fileDecryption() throws IOException{
    BufferedReader bufferedreader = new BufferedReader(new FileReader("Userdata.txt"));
    StringBuffer br = new StringBuffer();
    String line = null;
    int key=25;
    
    while((line =bufferedreader.readLine())!=null){
        br.append(line).append("\n");
    }

    for(int i=0; i<br.length();i++){
        int a=br.charAt(i);
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
        encryptedtxt=encryptedtxt+(char) a;
    }
    
    openFile();
    x.format(encryptedtxt);
    closeFile();
    
    System.out.print(encryptedtxt);
}


}
