
package dreamco;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Raihan
 */
public class MyTree {

    ///////////////////////////////////////////////////////////// Static VARIABLE and OBJECT declarations //////////////////////////////////////////////////////////////////////

    public NodeTree root = new NodeTree("DreamCo",null,new NodeTree("temp"),idCounter);
    public static int idCounter;    
    private static double classvariablefee;
    private static double commission_gen1, commission_gen2, commission_gen3, commission_gen4, commission_gen5;
    
    //private double hello=root.getMoney();

   ////////////////////////////////////////////////////////////////////////////////// CONSTRUCTOR for variable instatiation upon calling NEW CBJECT /////////////////////////////////////////////////// 
    public MyTree(){
        idCounter=0;
        classvariablefee=50;
        commission_gen1=0.5;
        commission_gen3=0.12;
        commission_gen2=0.09;
        commission_gen4=0.06;
        commission_gen5=0.03;
    }
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////// SETTERS are all here !!! /////////////////////////////////////
    public static void setIDCounter(int idcounter){

    }
    
    public static void setParent(String parent){
        
    }
    
    public static void setFee(double fee) {
        classvariablefee = fee;
    }
    
    public static void setGen1Commission(double commission){
        commission_gen1= commission;
    }
            
    public static void setGen2Commission(double commission){
        commission_gen2= commission;
    }
    
    public static void setGen3Commission(double commission){
        commission_gen3=commission;
    }
            
    public static void setGen4Commission(double commission){
        commission_gen4=commission;
    }
    public static void setGen5Commission(double commission){
        commission_gen5=commission;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////////// GETTERS are all here!!! /////////////////////////////////////////////////
    public static int getIDCounter(){
        return idCounter;
    }
    
    public static double getFee() {
        return classvariablefee;
    }
    
    public static double getGen1Commission(){
        return commission_gen1;
    }
    public static double getGen2Commission(){
        return commission_gen2;
    }
    public static double getGen3Commission(){
        return commission_gen3;
    }
    public static double getGen4Commission(){
        return commission_gen4;
    }
    public static double getGen5Commission(){
        return commission_gen5;
    }
    
    public void addUser(){
        try{
            Scanner scan = new Scanner(new FileInputStream("Userdata.txt"));
            while (scan.hasNextLine()) {
                String IDs=scan.nextLine();
                int ID = Integer.parseInt(IDs);
                
                String password = scan.nextLine();
                String parent=scan.nextLine();
                String username = scan.nextLine();
                
                String moneys=scan.nextLine();
                double money = Double.parseDouble(moneys);
                
                addFromFile(username,password,parent,money,ID);
                System.out.println("user: " + username);
                System.out.println("pass: "+ password);
                System.out.println("ID: " + ID);
                System.out.println("mponey: "+ money);
                
            }
            
        }catch(FileNotFoundException e){
            System.out.println("Error: "+e);
        } 
    }
    
 
    public void addFromFile(String name,String password, String parent, double Money, int id){
        
        NodeTree temp = new NodeTree(name, password, Money, id);
        
        if(root.child.isEmpty()){
            root.child.add(temp);
            temp.prev=root;
            System.out.println("Adding: " + name + " to " + root.name);
        }
        else{
            if(contain(parent)){
            getNode(parent).child.add(temp);
            getNode(name).prev=getNode(parent);
            System.out.println("Adding: " + getNode(name).name + " to " + getNode(parent).name);
            }
            else
                System.out.println("Cannot add, parent not found");
        }
    }
    
     public void appendUser() throws IOException{
       // DFSdisplayAll();
        
        MyStack<NodeTree> s = new MyStack();
        
        if(root==null)
            System.out.println("No user");
        else{        
            s.push(root);
            NodeTree temp = root;
            //DataEncryptionFile.appendUserIntoFile(temp.ID, temp.password, "DreamCo", temp.name, temp.money);
            while(s.getSize()!=0){
                temp = s.pop();
                if(temp==null){
                    System.out.println("aaaa");
                    continue;}
                if(temp.name.equals("DreamCo")){
                    DataEncryptionFile.appendUserIntoFile(temp.ID, temp.password, "DreamCo", temp.name, temp.money);
                }else{
                    DataEncryptionFile.appendUserIntoFile(temp.ID, temp.password, temp.prev.name, temp.name, temp.money);
                }
                    System.out.print(' '+ temp.name + " -RM" + temp.money);
                    for (int i = 0; i < temp.child.size(); i++) {
                        s.push(temp.child.get(i));
                    }
            }
        System.out.println("");
        }
    }
     
     
    // add method to use when to create new user
    public void add(String name,String password, String parent) throws IOException{
        idCounter++;
        NodeTree temp = new NodeTree(name, null, null, idCounter);
        temp.setPassword(password);
       // DataEncryptionFile.appendUserIntoFile(temp.ID, temp.password, temp.prev.name, temp.name, temp.money);
        //Nodee.add(temp);
       // System.out.println("afaf"+root.name);
        if(root.child.isEmpty()){
            root.child.add(temp);
            temp.prev=root;
            System.out.println("Adding: " + name + " to " + temp.prev.name);
            System.out.println("ID  :   " + temp.ID);
            //DataEncryptionFile.appendUserIntoFile(temp.ID, temp.password, temp.prev.name, temp.name, temp.money);
        }
        else{
            if(contain(parent)){
            getNode(parent).child.add(temp);
            temp.prev=getNode(parent);
            System.out.println("Adding: " + temp.name + " to " + temp.prev.name);
            System.out.println("ID  :   " + temp.ID);
            
            NodeTree current = temp;
                    int level = 0;
                    idCounter++;
                    while(current.prev!=null){
                    current = current.prev;
                    
                        switch (level) {
                            case 1:
                                current.addMoney(classvariablefee*getGen1Commission());
                                level++;
                                break;
                            case 2:
                                current.addMoney(classvariablefee*getGen2Commission());
                                level++;
                                break;
                            case 3:
                                current.addMoney(classvariablefee*getGen3Commission());
                                level++;
                                break;
                            case 4:
                                current.addMoney(classvariablefee*getGen4Commission());
                                level++;
                                break;
                            default:
                                current.addMoney(classvariablefee*getGen5Commission());
                                level++;
                                break;
                        }
                    }
            //DataEncryptionFile.appendUserIntoFile(temp.ID, temp.password, temp.prev.name, temp.name, temp.money);
            }
            else
                System.out.println("Cannot add, parent not found");
        }
    }
    
    // get money balance from user, return 0 if user not exist
    public double getMoney(String name){
        return getNode(name).money;
    }
    
    public boolean contain (String name){
        MyStack<NodeTree> s = new MyStack();
        s.push(root);
        NodeTree temp = root;;
        while(s.getSize()!=0){
            temp = s.pop();
            if(temp==null)
                continue;
            else if(temp.equals(getNode(name))){
                return true;
            }
            for (int i = 0; i < temp.child.size(); i++) {
                s.push(temp.child.get(i));
            }
        }
        return false;
    }
    
    public NodeTree getNode(String name){
        MyStack<NodeTree> s = new MyStack();
        
        s.push(root);
        NodeTree temp = root;
        while(s.getSize()!=0){
            temp = s.pop();
            if(temp==null)
                continue;
            else if(temp.name.equalsIgnoreCase(name))
                return temp;
            for (int i = 0; i < temp.child.size(); i++) {
                s.push(temp.child.get(i));
            }
        }
        return null;
    }
    
    public double getTotalMoney(){
        if(root==null)
            return 0;
        else{
            
            return 0;
        }
    }
    
    public void displayAllNodes(){
        DFSdisplayAll();
    }
    
    //display all parents from the child
    public void displayAncestor(String name){
        NodeTree temp = getNode(name);
        if(contain(name)){
            while(temp.prev!=null){

                System.out.print(' '+temp.name + " -RM" + temp.money);        
                temp = temp.prev;
            }
            System.out.print(temp.name);
        }
        else
            System.out.println("Node not found");
    }

    public void dfstackUser(String name){
        MyStack<NodeTree> s = new MyStack();
        
        s.push(getNode(name));
        NodeTree temp = getNode(name);;
        while(s.getSize()!=0){
            temp = s.pop();
            if(temp==null)
                continue;
            System.out.print(' '+ temp.name + " -RM" + temp.money);
            for (int i = 0; i < temp.child.size(); i++) {
                s.push(temp.child.get(i));
            }
        }System.out.println("");
    }
    
    public void DFSdisplayAll(){
        MyStack<NodeTree> s = new MyStack();
        
        if(root==null)
            System.out.println("No user");
        else{        
            s.push(root);
            NodeTree temp = root;
            while(s.getSize()!=0){
                temp = s.pop();
                if(temp==null)
                    continue;
                System.out.print(' '+ temp.name + " -RM" + temp.money);
                for (int i = 0; i < temp.child.size(); i++) {
                    s.push(temp.child.get(i));
                }

            }
        System.out.println("");
        }
    }
    
    public void BFSdisplayAll() {
        MyQueue<NodeTree> queue = new MyQueue<NodeTree>();
        
        if(root==null)
            System.out.println("No user");
        else{
            queue.enqueue(root);
            while (queue.getSize()!= 0) {
                NodeTree temp = queue.dequeue(); // return null if the queue is empty
                if(temp==null)
                    continue;
                System.out.print(temp.name + " ");
                    for (int i = 0; i<temp.child.size(); i++) {
                        queue.enqueue(temp.child.get(i));
                }
            }
            System.out.println("");
        }
    }
    
    public void clear(){
        root= new NodeTree("DreamCo",null,new NodeTree("temp"),idCounter);
        idCounter=0;
        System.out.println("All user have been deleted");
    }
    
    public void remove(String name){
        if(contain(name)){
            if(root==getNode(name)){
                clear();
            }else{
               NodeTree []temp = new NodeTree[getNode(name).child.size()];
                boolean remove=false;
                String prev = getNode(name).prev.name;
                if(getNode(name).child.size()!=0){
                    remove=true;
                        for (int i = 0; i < getNode(name).child.size(); i++) {
                            temp[i] = getNode(name).child.get(i);
                        }
                }
                int numbtemp=-1;
                    for (int i = 0; i < getNode(name).prev.child.size(); i++) {
                        if(getNode(prev).child.get(i)==(getNode(name))){
                            numbtemp = i;
                            break;
                        }
                    }
                if(numbtemp!=-1){    
                    getNode(name).prev.child.remove(numbtemp);
                }
                if(remove){
                    for (int i = 0; i < temp.length; i++) {
                        getNode(prev).child.add(temp[i]);
                    }
                }
                System.out.println("Removed: "+ name);
            }
        }else
            System.out.println("User not found");
    }
    
    //method to be used for password reset
    public void setPassword(String name, String password){
        getNode(name).setPassword(password);
        System.out.println("Password has been set");    
    }
    
    //method to read FEE from textfile upon startup
    public static void startupAdminConfigFile(){
        try{
        Scanner s= new Scanner(new FileReader("AdminConfig.txt"));
        while(s.hasNextLine()){
            setIDCounter(Integer.parseInt(s.next()));
            setFee(Double.parseDouble(s.next()));
            setGen1Commission(Double.parseDouble(s.next()));
            setGen2Commission(Double.parseDouble(s.next()));
            setGen3Commission(Double.parseDouble(s.next()));
            setGen4Commission(Double.parseDouble(s.next()));
            setGen5Commission(Double.parseDouble(s.next()));          
        }
        s.close();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "System File Not Found!", "  System Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void updateAdminConfigFile() {  //called by my adminframe class 
        try{
        PrintWriter pw= new PrintWriter(new FileWriter(new File("AdminConfig.txt")));
        pw.print(getIDCounter());
        pw.print("\n"+getFee());
        pw.print("\n"+getGen1Commission());
        pw.print("\n"+getGen2Commission());
        pw.print("\n"+getGen3Commission());
        pw.print("\n"+getGen4Commission());
        pw.print("\n"+getGen5Commission());
        pw.close();
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "System File Not Found!", "  System Error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    
}
