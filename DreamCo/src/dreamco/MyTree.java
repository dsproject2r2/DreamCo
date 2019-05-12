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
    
    public java.util.ArrayList<NodeTree> Nodee =  new java.util.ArrayList<>();
    public int total;
    public NodeTree root;
    double fee=50;
            
    public MyTree(){
        total=0;
        root=null;
    }
    
    public void setFee(double fee){
        this.fee=fee;
    }
    
    //add method to use when  load file
    public void addLoad(String name, String parents, double Money, int ID){
        NodeTree temp = new NodeTree(name, null, null, Money, ID);
        if(root==null){
            Nodee.add(temp);
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
        temp.addMoney(fee);
        //Nodee.add(temp);
        
        if(root==null){
            Nodee.add(temp);
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
    
    // get money balance from user, return 0 if user not exist
    public double getMoney(String name){
        for (int i = 0; i < Nodee.size(); i++) {
            if(Nodee.get(i).name.equalsIgnoreCase(name)){
                return  Nodee.get(i).money;
            }
        }
        return 0;
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
    
    public void displayAllNodes(){
        dfstack();
    }
    
    //display all parents from the child
    public void displayAncestor(String name){
        NodeTree temp = getNode(name);
        if(contain(name)){
            while(temp.prev!=null){

                System.out.print(temp.name + " ");        
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
            System.out.print(temp.name + " ");
            for (int i = 0; i < temp.child.size(); i++) {
                s.push(temp.child.get(i));
            }
        }System.out.println("");
    }
    
    public void dfstack(){
        Stack<NodeTree> s = new Stack();
        
        s.push(root);
        NodeTree temp = root;
        while(s.size()!=0){
            temp = s.pop();
            if(temp==null)
                continue;
            System.out.print(temp.name + " ");
            for (int i = 0; i < temp.child.size(); i++) {
                s.push(temp.child.get(i));
            }
            
        }
        System.out.println("");
    }
    
    
    public void bfsQueue() {
        MyQueue<NodeTree> queue = new MyQueue<NodeTree>();
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
    
    public int returnIndex(NodeTree node){
        for (int i = 0; i < Nodee.size(); i++) {
                if(node.equals(Nodee.get(i))){
                    return i;
                }
            }
        return -1;
    }
    
    public void clear(){
        root=null;
    }
    
    public void remove(String name){
        NodeTree temp = getNode(name).prev;
        
        if(contain(name)){
            if(root==getNode(name)){
                clear();
            }else{
                for (int i = 0; i < temp.child.size(); i++) {

                    if(temp.child.get(i)==null){
                        continue;
                    }

                    if(temp.child.get(i).equals(getNode(name))){
                        getNode(temp.name).child.remove(i);
                    }
                }
            }
        }else
            System.out.println("User not found");

    }
    
}
