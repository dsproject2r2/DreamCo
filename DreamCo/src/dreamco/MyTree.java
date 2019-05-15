/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamco;

import java.io.IOException;

/**
 *
 * @author Raihan
 */
public class MyTree {
    
    public int total;
    public NodeTree root = new NodeTree("DreamCo");
    double fee=50;
            
    public int getTotal(){
        return total;
    }
    
    public MyTree(){
        total=0;
     //   root=null;
    }
    
    public void setFee(double fee){
        this.fee=fee;
    }
    
//    //add method to use when  load file
//    public void addLoad(String name, String parents, double Money, String password){
//        NodeTree temp = new NodeTree(name, null, null, Money, password);
//        if(root==null){
//            root=temp;
//            total++;
//            System.out.println("Root: " + name);
//        }
//        else{
//            if(contain(parents)){
//            getNode(parents).child.add(temp);
//            getNode(name).prev=getNode(parents);
//                System.out.println("Adding: " + getNode(name).name + " to " + getNode(parents).name);
//            }
//            else
//                System.out.println("Cannot add, parent not found");
//        }
//    }
    
    // add method to use when to create new user
    public void add(String name,String password, String parents) throws IOException{
        NodeTree temp = new NodeTree(name, null, null);
        temp.setPassword(password);
        DataEncryptionFile def= new DataEncryptionFile();
        //Nodee.add(temp);
       // System.out.println("afaf"+root.name);
        if(root.child.isEmpty()){
            root.child.add(temp);
            System.out.println("Adding: " + name + " to " + root.name);
            def.appendFile(name, password, root.name);
           def.fileEncryption();
//           def.fileDecryption();
        }
        else{
            if(contain(parents)){
            getNode(parents).child.add(temp);
            getNode(name).prev=getNode(parents);
            System.out.println("Adding: " + getNode(name).name + " to " + getNode(parents).name);
             def.appendFile(name, password,parents);
            NodeTree current = temp;
                    int level = 0;
                    total++;
                    while(current.prev!=null){
                    current = current.prev;
                    
                        switch (level) {
                            case 1:
                                current.addMoney(fee*0.5);
                                level++;
                                break;
                            case 2:
                                current.addMoney(fee*0.12);
                                level++;
                                break;
                            case 3:
                                current.addMoney(fee*0.09);
                                level++;
                                break;
                            case 4:
                                current.addMoney(fee*0.06);
                                level++;
                                break;
                            default:
                                current.addMoney(fee*0.03);
                                level++;
                                break;
                        }
                    }
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
        root= new NodeTree("DreamCo"); 
        total=0;
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
    
    public void setPassword(String name, String password){
        getNode(name).setPassword(password);
        System.out.println("Password has been set");    
    }
    
    
}
