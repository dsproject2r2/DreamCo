
package dreamco;

//THIS CLASS CONTAINS THE METHODS TO READ AND ALTER THE NAME FILE 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class DataFile {

private Scanner x;
String tempstring; 
    
public void writeToFile(){
    try{
        File file = new File("Userdata.txt");
            
        if(!file.exists()){
            file.createNewFile();
    }
            
    PrintWriter pw = new PrintWriter(file);
    }
    catch (IOException e){
        System.out.println("FILE DOES NOT EXIST!");
    }
}
       
public void readFile(){
    try{
        x= new Scanner (new File("Userdata.txt"));
            
        while(x.hasNext()){
        ///////////////////////////////
        //////////////////////////////
        ////////////////////////////
        ///////////////////////////////
        ///////////////////////////////
        //////////////////////////////
        }
    }
    catch(Exception e){
        System.out.println("FILE DOES NOT EXIST!");
    }       
}
    
public void closeFile(){
        x.close();
    }
   



public void fileEncryption() throws IOException{
/////////////////////////////////////////////////////////////////////////////////////////////////////// BUFFERED READER SEGMENT NOT IMPORTANT  ////////////////////////////////
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Userdata.txt"));
    StringBuffer br = new StringBuffer();
    String line = null;
    
    while((line =bufferedReader.readLine())!=null){
    br.append(line).append("\n");
    }
////////////////////////////////////////////////////////////////////////////////////////////////////// ENCRYPTION ALGORITHM ////////////////////////////////////////
    int key=25;
    String encryptedtxt="";
    
    for(int i=0; i<br.length();i++){
        int a=br.charAt(i);
        a=a+(key%26);
        encryptedtxt=encryptedtxt+(char) a;


    }
    
    try{
        File file = new File("Userdata.txt");
            
        if(!file.exists()){
            file.createNewFile();
    }
            
    PrintWriter pw = new PrintWriter(file);
    }
    catch (IOException e){
        System.out.println("FILE DOES NOT EXIST!");
    }

    
    System.out.println(encryptedtxt);

}


public void fileDecryption(){
    
}




}
