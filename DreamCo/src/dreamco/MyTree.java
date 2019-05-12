/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamco;

import java.util.Stack;

/**
 *
 * @author Raihan
 */
public class MyTree {
    
    public int total;
    public NodeTree root;
    double fee=50;
            
    public int getTotal(){
        return total;
    }
    
    public MyTree(){
        total=0;
        root=null;
    }
    
    public void setFee(double fee){
        this.fee=fee;
    }
    
    //add method to use when  load file
    public void addLoad(String name, String parents, double Money, String password){
        NodeTree temp = new NodeTree(name, null, null, Money, password);
        if(root==null){
            root=temp;
            total++;
            System.out.println("Root: " + name);
        }
        else{
            if(contain(parents)){
            getNode(parents).child.add(temp);
            getNode(name).prev=getNode(parents);
                System.out.println("Adding: " + getNode(name).name + " to " + getNode(parents).name);
            }
            else
                System.out.println("Cannot add, parent not found");
        }
    }
    
    // add method to use when to create new user
    public void add(String name, String parents){
        NodeTree temp = new NodeTree(name, null, null);
        //Nodee.add(temp);
        
        if(root==null){
            root=temp;
            total++;
            System.out.println("Root: " + name);
        }
        else{
            if(contain(parents)){
            getNode(parents).child.add(temp);
            getNode(name).prev=getNode(parents);
            System.out.println("Adding: " + getNode(name).name + " to " + getNode(parents).name);
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
        Stack<NodeTree> s = new Stack();
        s.push(root);
        NodeTree temp = root;;
        while(s.size()!=0){
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
        Stack<NodeTree> s = new Stack();
        
        s.push(root);
        NodeTree temp = root;
        while(s.size()!=0){
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
        dfstack();
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
        Stack<NodeTree> s = new Stack();
        
        s.push(getNode(name));
        NodeTree temp = getNode(name);;
        while(s.size()!=0){
            temp = s.pop();
            if(temp==null)
                continue;
            System.out.print(' '+ temp.name + " -RM" + temp.money);
            for (int i = 0; i < temp.child.size(); i++) {
                s.push(temp.child.get(i));
            }
        }System.out.println("");
    }
    
    public void dfstack(){
        Stack<NodeTree> s = new Stack();
        
        if(root==null)
            System.out.println("No user");
        else{        
            s.push(root);
            NodeTree temp = root;
            while(s.size()!=0){
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
    
    public void bfsQueue() {
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
        root=null; 
        total=0;
        System.out.println("All user have been deleted");
    }
    
//    public void remove(String name){
//        
//        if(contain(name)){
//            if(root==getNode(name)){
//                clear();
//            }else{
//              //  NodeTree temp = getNode(name).prev;
//                for (int i = 0; i < getNode(name).prev.child.size(); i++) {
//
//                    if(getNode(name).prev.child.get(i)==null){
//                        continue;
//                    }
//
//                    if(getNode(name).prev.child.get(i).equals(getNode(name))){
//                        getNode(getNode(name).prev.name).child.remove(i);
//                    }
//                }
//                getNode(name).prev=null;
//                
//                for (int i = 0; i < getNode(name).child.size(); i++) {
//                    getNode(name).child.get(i).prev=getNode(name).prev;
//                    getNode(name).prev.child.add(getNode(name).child.get(i));
//                    
//                }
////                for (int i = 0; i < getNode(name).child.size(); i++) {
////                    if(temp.child.get(i)==null){
////                        continue;
////                    }
////                    getNode(name).child.get(i).prev=temp;
////                }
//                total--;
//            }
//        }else
//            System.out.println("User not found");
//    }
    
    public void setPassword(String name, String password){
        getNode(name).setPassword(password);
        System.out.println("Password has been set");    
    }
    
}
