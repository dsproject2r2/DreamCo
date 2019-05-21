
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
import javax.swing.JOptionPane;


public class DataEncryptionFile {

private static String encryptedtxt1="";
private static String encryptedtxt2="";

////////////////////////////////////////////////////////////////////////////////////////////////////METHODS ARE ALL BELOW THIS LINE //////////////////////////////////////////////////
public static void writeUserDataFile() throws IOException{
    PrintWriter pw= new PrintWriter(new FileWriter(new File("Userdata.txt")));
    pw.print(encryptedtxt1);
    pw.close();
}
public static void writePendingFile() throws IOException{
    PrintWriter pw= new PrintWriter(new FileWriter(new File("Pending.txt")));
    pw.print(encryptedtxt2);
    pw.close();
}



public static void appendUserIntoFile(int ID, String password, String parent, String name, double money  ) throws IOException{
    PrintWriter pw=new PrintWriter(new FileWriter(new File("Userdata.txt"),true));
    pw.write(ID);
    pw.write("\n" + password);
    pw.write("\n" + parent);
    pw.write("\n" + name);
    pw.write("\n"+money +"\n");
    pw.close();
    }

public static void userDataEncryption(){
    try{
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
        encryptedtxt1=encryptedtxt1+(char) a;
    } 
    bufferedreader.close();
    writeUserDataFile();
    encryptedtxt1="";
    }
    catch(IOException e){
        JOptionPane.showMessageDialog(null, "System File Not Found!", "  System Error!", JOptionPane.ERROR_MESSAGE);
    }
}

public static void pendingEncryption(){
    try{
    BufferedReader bufferedreader = new BufferedReader(new FileReader("Pending.txt"));
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
        encryptedtxt2=encryptedtxt2+(char) a;
    } 
    bufferedreader.close();
    writePendingFile();
    encryptedtxt2="";
    }
    catch(IOException e){
        JOptionPane.showMessageDialog(null, "System File Not Found!", "  System Error!", JOptionPane.ERROR_MESSAGE);
    }
}


public static void userDataDecryption() {
    try{
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
        encryptedtxt1=encryptedtxt1+(char) a;
    }
    bufferedreader.close();
    writeUserDataFile();
    encryptedtxt1="";
    }
    catch(IOException e){
        JOptionPane.showMessageDialog(null, "System File Not Found!", "  System Error!", JOptionPane.ERROR_MESSAGE);
    }
}

public static void pendingDecryption() {
    try{
    BufferedReader bufferedreader = new BufferedReader(new FileReader("Pending.txt"));
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
        encryptedtxt2=encryptedtxt2+(char) a;
    }
    bufferedreader.close();
    writePendingFile();
    encryptedtxt2="";
    }
    catch(IOException e){
        JOptionPane.showMessageDialog(null, "System File Not Found!", "  System Error!", JOptionPane.ERROR_MESSAGE);
    }
}

}
