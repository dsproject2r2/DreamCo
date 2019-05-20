
package dreamco;

//by JERRY <3
//THIS CLASS CONTAINS THE METHODS TO READ AND ALTER THE NAME FILE      -The encryption will also only encrypt letters and not numbers

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class DataEncryptionFile {

private static String encryptedtxt="";

////////////////////////////////////////////////////////////////////////////////////////////////////METHODS ARE ALL BELOW THIS LINE //////////////////////////////////////////////////
public static void writeEncryptionFile() throws IOException{
    PrintWriter pw= new PrintWriter(new FileWriter(new File("Userdata.txt")));
    pw.print(encryptedtxt);
    pw.close();
}

/////////////////////////////////////////////////////This method is to add any names or entries to the file.........................................
public static void appendFile(String name, String password, String parent, double total ) throws IOException{
    BufferedWriter bw=new BufferedWriter(new FileWriter(new File("Userdata.txt"),true));
    bw.write(name);
    bw.write("\n" + password);
    bw.write("\n"+parent +"\n");
    bw.close();
    }


public static void fileEncryption() throws IOException{
    BufferedReader bufferedreader = new BufferedReader(new FileReader("Userdata.txt"));
    StringBuilder br = new StringBuilder();
    String line;
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
    bufferedreader.close();
    writeEncryptionFile();
    encryptedtxt="";

}


public static void fileDecryption() throws IOException{
    BufferedReader bufferedreader = new BufferedReader(new FileReader("Userdata.txt"));
    StringBuilder br= new StringBuilder();
    String line;
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
    bufferedreader.close();
    writeEncryptionFile();
    encryptedtxt=null;
}

}
